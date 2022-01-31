import java.util.Scanner;

public class findTheDistance {
    public static void main(String[] args){
        Scanner pointN1 = new Scanner(System.in);
        System.out.print("valeur de X1 svp: ");
        int xOne = pointN1.nextInt();
        System.out.print("valeur de Y1 svp: ");
        int yOne = pointN1.nextInt();
        System.out.print("valeur de X2 svp: ");
        int xTwo = pointN1.nextInt();
        System.out.print("valeur de Y2 svp: ");
        int yTwo = pointN1.nextInt();
        
        pointN1.close();
        
        System.out.print("la distance entre ces points est de: " + distance(xOne, yOne, xTwo, yTwo));
       
        ;

        
        
    }

    private static double distance(int x1, int y1, int x2, int y2){
        double distanceSqrt = (Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        double d = Math.sqrt(distanceSqrt);
        return d;
    }
}
