//PERCENTAGE: 100.00%
//MEMORY: 0.00 MB  
//TIME: 0.21 s	
//https://omegaup.com/arena/problem/1-Bisiesto#problems

import java.util.*;

public class Main {

    public static String isLeap(short year){
        if(year%4 == 0){
            if(year%100 == 0){
                if(year%400 == 0){
                    return "S";
                }
            }else{
                return "S";
            }
        }
        return "N";
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        
        for(int i = 0; i<N; i++){
            System.out.println(isLeap(s.nextShort()));
        }
    }
}