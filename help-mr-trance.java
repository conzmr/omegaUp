// https://omegaup.com/arena/problem/Ayudando-a-Mr-Trance-Reloaded#problems
//PERCENTAGE: 100.00%
//MEMORY: 0.00 MB	  
//TIME: 1.83 s

import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String word = s.nextLine().toLowerCase(); 
        String phrase = s.nextLine().toLowerCase(); 
        String[] words = phrase.split(" ");
        int count = 0;
        
        for(String currentWord : words) {
        	if (currentWord.equals(word)) {
        		count++;
        	}
        }
        System.out.println(count);
    }
}