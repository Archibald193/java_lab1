import java.util.Arrays;
import java.util.Random;
public class lab2_1 {
    public static double[] createReciprocalFraction(int[] a){
        double[] b = new double[a.length];
        for (int i = 0; i < a.length -1; i++) {
            try {
                b[i] = 1.0/a[i];               
            } catch (ArithmeticException e){
            System.out.println("err");
            b[i] = 0.0;
            }
        }
        return b;
    }
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        arr[2] = 0;
        System.out.println("Массив: " + Arrays.toString(arr));
        double[] ba = createReciprocalFraction(arr);
        System.out.println("Массив обратный: " + Arrays.toString(ba));
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i]; 
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        System.out.println("Итог: " + Arrays.toString(arr));
    }
}