// https://omegaup.com/arena/omegaupchallenge8/practice/#problems/TARDIS
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 
import java.util.Stack;

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

    public static int getMaxDangerLevel(int startOfRange, int endOfRange, int[] dangers) {
        int max  = 0;
        for(int i = startOfRange; i <= endOfRange; i++){
            if(dangers[i] > max) {
                max = dangers[i];
            }
        }
        return max;
    }

     public static void main(String[] args) throws IOException 
    { 
        FastReader s=new FastReader(); 
        //Number of sectors
        int N = s.nextInt(), 
        operationType,
        startOfRange,
        endOfRange,
        sector,
        danger,
        undoOperations;
        int[] lastDangers = new int[N];

        Stack<int[]> history = new Stack();
         //Number of operations
        int Q = s.nextInt();
        for(int i = 0; i<N; i++){
            lastDangers[i] = s.nextInt();
            System.out.print(lastDangers[i]);
        }

        history.push(lastDangers);

        for(int i = 0; i<Q; i++){
            operationType = s.nextInt();
            if(operationType == 0){
                startOfRange = s.nextInt();
                endOfRange = s.nextInt();
                System.out.println(getMaxDangerLevel(startOfRange, endOfRange, lastDangers));
            }
            else if(operationType == 1){
                sector = s.nextInt();
                danger = s.nextInt();
                lastDangers[sector] = danger;
                history.push(lastDangers);
            }
            else{
                undoOperations = s.nextInt();
                for(int j= 0; j< undoOperations; j++){
                    history.pop();
                }
                lastDangers = history.peek();
            }
        }
    }
} 