import static java.lang.Math.*;
public class lab1_1 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Err");
        }
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double n = max(x, y);
        double s = pow(n, 2);
        System.out.println(s);

    }
}