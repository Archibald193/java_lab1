import java.util.Scanner;
import static java.lang.Math.*;
public class lab1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print a: ");
        double a = scanner.nextDouble();
        System.out.print("Print b: ");
        double b = scanner.nextDouble();
        
        double m = max(a, b);
        double n = min(a, b);

        if (n == 0) {
            System.out.println("Err");
        } else {
            double chisl = 5 * m - 4 - n;
            double znam = 8.3 + (m / n);
            
            if (znam == 0) {
                 System.out.println("Err");
            } else {
                double d = chisl / znam;
                System.out.println(d);
            }
        }
        scanner.close();
    }
}
