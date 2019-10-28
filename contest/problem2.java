import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(), max = 0, maxtmp = 0;
        int[] LN = new int[N];
        
        for(int i = 0; i<N; i++){
            LN[i] = s.nextInt();
        }

        for (int i = 0; i < LN.length; i++){ 
            maxtmp = maxtmp + LN[i]; 
            if (max < maxtmp) 
                max = maxtmp; 
            if (maxtmp < 0) 
                maxtmp = 0; 
        } 

        System.out.println(max);
        
    }
}
