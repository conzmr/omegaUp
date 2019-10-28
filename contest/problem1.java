import java.util.*;

public class Main {

    public static boolean checkMerge(int i, String merge, int cs1, String s1, int cs2, String s2){
        
        if(i == merge.length()){
            return true;
        }
        char ch = merge.charAt(i);
        if(cs1 < s1.length()-1 && ch == s1.charAt(cs1) && cs2 < s2.length()-1 && ch == s2.charAt(cs2) ){
            if(checkMerge(i+1, merge, cs1+1, s1, cs2, s2)){
                return true;
            }else{
                return checkMerge(i+1, merge, cs1, s1, cs2+1, s2);
            }
        }
        if(cs1 < s1.length()-1 && ch == s1.charAt(cs1)){
            return checkMerge(i+1, merge, cs1+1, s1, cs2, s2);
        }
        if(cs2 < s2.length()-1 && ch == s2.charAt(cs2)){
            return checkMerge(i+1, merge, cs1, s1, cs2+1, s2);
        }
        if(ch != s1.charAt(cs1) && ch != s2.charAt(cs2) ){
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        String s1 = s.nextLine(),
        s2 = s.nextLine(),
        merge = s.nextLine();
        char ch;
        boolean valid;
        if(merge.length() != s1.length() + s2.length()){
            System.out.println("INVALID MERGE");
        }else{
            valid = checkMerge(0,  merge, 0, s1, 0, s2);
            if(valid){
                System.out.println("VALID MERGE");
            }else{
                System.out.println("INVALID MERGE");
            }
        }
    }
}