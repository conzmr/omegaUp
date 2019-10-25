//TLE
//PERCENTAGE: 4.00%	
//MEMORY: 6.62 MB  
//TIME: 22.63 s	

//WITH RECURSIVE GCD
//MEMORY: 0.00 MB  
//TIME: 22.96 s	

//https://omegaup.com/arena/problem/El-Rey-Caprichoso#problems

import java.io.DataInputStream; 
import java.io.FileInputStream; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.math.BigInteger; 

public class Main {
     static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead; 
  
        public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        } 
  
        public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        } 
  
        public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9'); 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
  
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
  
            if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            } 
  
            if (neg) 
                return -ret; 
            return ret; 
        } 
  
        private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        } 
  
        private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        } 
  
        public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
    public static int gcd(int a, int b)  
    { 
        BigInteger b1 = BigInteger.valueOf(a); 
        BigInteger b2 = BigInteger.valueOf(b); 
        BigInteger gcd = b1.gcd(b2); 
            return gcd.intValue(); 
    } 

    // // Recursive method to return gcd of a and b 
    // static int gcd(int a, int b) 
    // { 
    // if (a == 0) 
    //     return b;  
    // return gcd(b % a, a);  
    // } 
      
    // method to return LCM of two numbers 
    static int lcm(int a, int b) 
    { 
        return (a*b)/gcd(a, b); 
    } 

    public static void main(String[] args) throws Exception {
        Reader s = new Reader(); 
        //N - Expected numbers
        //LN - List of numbers
        //GCD - Greatest common divisor for all numbers
        //LCF - Lowest common factor for pair of GCD
        int N, currentGCD, currentLCF, GCD = 1, LCF = 1;
        int[] LN;
        N = s.nextInt();
        LN = new int[N];
        for(int i = 0; i<N; i++){
            LN[i] = s.nextInt();
        }
        for(int i = 0; i<N; i++){
            for(int j = 0; j < N; j++){
                if(j!=i){
                    currentGCD = gcd(LN[i], LN[j]);
                    if(currentGCD > GCD){
                        if(currentGCD == GCD){
                        currentLCF = lcm(LN[i], LN[j]);
                        if(currentLCF < LCF) {
                            LCF = currentLCF;
                        }
                        }
                        else{
                            GCD = currentGCD;
                            LCF = lcm(LN[i], LN[j]);
                        }
                    }
                }
            }
        }
        System.out.print(LCF);
    }
}