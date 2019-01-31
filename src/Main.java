import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        double f = sc.nextDouble();

        double y = (f - c*d/a)/(e-b*d/a);
        double x = (c - b*y)/a;
        
        System.out.println(x + " " + y);
    }
}