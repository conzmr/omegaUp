// Working program with FastReader 
//PERCENTAGE: 60.00%	
//MEMORY: 7.10 MB	
//TIME: 5.13 s	
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
  
public class Main 
{ 
    static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    } 

     public static void main(String[] args) throws IOException 
    { 
        FastReader s=new FastReader(); 
        //M - number of locks
        //P - locks sizes
        //N - number of keys
        //L - keys sizes
        int M, N;
        int[] P, L;

        M = s.nextInt();
        P = new int[M];
        for(int i = 0; i<M; i++){
            P[i] = s.nextInt();
        }
        
        N = s.nextInt();
        L = new int[N];
        for(int i = 0; i<N; i++){
            L[i] = s.nextInt();
        }
        
        //For each key find a lock if any
        for(int i = 0; i<L.length; i++){
            int match = 0;
            for (int j=0; j<P.length; j++){
                if(L[i] == P[j]){
                    match = j+1;
                    break;
                }
            }
            System.out.print(match+" ");
        }
    }
} 