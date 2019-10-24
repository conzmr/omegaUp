import java.util.*;

// https://omegaup.com/arena/problem/chocolates#problems

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N, K, sum, maxSum = 0;
        N = s.nextInt();
        K = s.nextInt();
        int[] D = new int[N];
        
        for(int i = 0; i<N; i++){
            D[i] = s.nextInt();
        }
        
        for(int i = 0; i<=N-K; i++){
            sum = 0;
            for (int j=0; j<K; j++){
                sum+= D[i+j];
            }
            if(sum>maxSum){
                maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
