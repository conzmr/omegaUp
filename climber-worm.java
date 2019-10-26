//PERCENTAGE: 100.00%
//MEMORY: 0.00 MB  
//TIME: 1.41 s	
//https://omegaup.com/arena/omegaupchallenge8/practice/#problems/gusano_escalador

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int u = s.nextInt();
        int d = s.nextInt();
        int mins = 0;

        while (n>0){
            n -= u;
            mins++;
            if(n>0){
                n += d;
                mins++;
            }
        }
        System.out.println(mins);
    }
}