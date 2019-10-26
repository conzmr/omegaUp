//PERCENTAGE: 100.00%
//MEMORY: 0.00 MB  
//TIME: 1.18 s	
//https://omegaup.com/arena/omegaupchallenge8/practice/#problems/Asteriscos-0

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for(int i = 0; i<N; i++){
            for(int j = 0; j<N-1; j++){
                System.out.print("*");
            }
            System.out.println("*");   
        }
    }
}