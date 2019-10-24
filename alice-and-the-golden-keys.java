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

//BUFFERED READER VERSION

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// public class Main {
//     public static void main(String[] args) throws IOException {
//         int M, N, x, y;
//         String[] P, L;
//         BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
//         M = Integer.parseInt(s.readLine());
//         P = (s.readLine()).split(" ");
//         N = Integer.parseInt(s.readLine());
//         L = (s.readLine()).split(" ");
//         for(x = 0; x < N; x++)
//         {
//             for(y = 0; y < M; y++)
//             {
//                 if(P[y].equals(L[x]))
//                 {
//                     System.out.print((y + 1) + " ");
//                     break;
//                 }
//                 if(y + 1 == M)
//                     System.out.print("0 ");
//             }
//         }
//     }
    
// }