// Working program with Scanner
//PERCENTAGE: 60.00%	
//MEMORY: 8.96 MB	
//TIME: 6.12 s	
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
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