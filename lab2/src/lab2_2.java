import java.util.Arrays;
public class lab2_2 {
    public static void main(String[] args) {
        int[] x = {-10, 5, -8, 0, 2, -15, 77, -1, -100, 4};
        System.out.println("x: " + Arrays.toString(x));
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                count++;
            }
        }
        
        double[] y = new double[count];
        int j = 0; 
        for (int i = 0; i < x.length; i++) {
            if (x[i] < 0) {
                y[j] = x[i] / 2.0; 
                j++;
            }
        }
        System.out.println("y: " + Arrays.toString(y));
        Arrays.sort(y);
        System.out.println("y(после сортировки): " + Arrays.toString(y));        
    }
}
