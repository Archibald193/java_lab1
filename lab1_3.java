import java.util.Scanner;
import static java.lang.Math.*;
public class lab1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print a: ");
        double a = scanner.nextDouble();
        System.out.print("Print b: ");
        double b = scanner.nextDouble();
        System.out.print("Print x: ");
        double x = scanner.nextDouble();
        double y, f;

        if (x <= 0) {
            y = a - pow(b, x + 1);
            f = exp(tan(a * x + 1));
        } 
        else if (x <= 3) {
            y = pow(1 + 3, x * a);
            f = pow(x, a) - pow(sin(x), b);
        } 
        else {
            y = 1 / tan(a * x + 1);
            f = pow(x, 2/5);
        }

        System.out.println("Y = " + y);
        System.out.println("F = " + f);
        scanner.close();
    }
}
