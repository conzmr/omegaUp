import java.util.*;

public class Main {

    private static double round(double value) {
    return Math.round(value * Math.pow(10, 2)) / Math.pow(10, 2);
    }

    private static void midpoint(double x1, double y1, double x2, double y2, double distanceFrom, double distance) { 
        double T = distanceFrom / distance;
        double x = (1 - T) * x1 + T * x2;
        double y = (1 - T) * y1 + T * y2;
        System.out.print(round(x) + " " + round(y)) ;  
    } 

    public static double calculateDistanceBetweenPoints(
        double x1, 
        double y1, 
        double x2, 
        double y2) {       
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double totalDist = 0, middleDist = 0;
        double[][] LN = new double[N][2];
        double[] lengths = new double[N-1];

        
        for(int i = 0; i<N; i++){
            LN[i][0] = s.nextInt();
            LN[i][1] = s.nextInt();
        }

        for(int i = 0; i<lengths.length; i++){
            totalDist += calculateDistanceBetweenPoints(LN[i][0], LN[i][1], LN[i+1][0], LN[i+1][1]);
            lengths[i] = totalDist;
        }

        middleDist = totalDist/2;
        double currentD = 0;
        for(int i = 0; i<lengths.length; i++){
            if(middleDist < lengths[i]){
                i = i;
                midpoint(LN[i][0], LN[i][1], LN[i+1][0], LN[i+1][1], middleDist-currentD,lengths[i]-currentD);
                break;
            }
            currentD = lengths[i];
        }
    }
}