//BUFFERED READER VERSION
//PERCENTAGE: 50.00%	
//MEMORY: 12.89 MB	
//TIME: 5.65 s	
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        int M, N, x, y;
        String[] P, L;
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(s.readLine());
        P = (s.readLine()).split(" ");
        N = Integer.parseInt(s.readLine());
        L = (s.readLine()).split(" ");
        for(x = 0; x < N; x++)
        {
            for(y = 0; y < M; y++)
            {
                if(P[y].equals(L[x]))
                {
                    System.out.print((y + 1) + " ");
                    break;
                }
                if(y + 1 == M)
                    System.out.print("0 ");
            }
        }
    }
    
}