import java.util.Arrays;
import java.util.Random;
public class lab2_4 {
    public static void main(String[] args) {
        int size = 4;
        int[][] matrix = new int[size][size];
        Random random = new Random();

        System.out.println("Матрица:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = random.nextInt(20) - 10;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }
        double product = 1.0;
        int count = 0;
        for (int i = 0; i < size; i++) {
            int element = matrix[i][size - 1 - i];
            if (element > 0) {
                product = product * element;
                count++;
            }
        }
        if (count > 0) {
            double result = Math.pow(product, 1.0 / count);
            System.out.println("Среднее геометрическое: " + result);
        } else {
            System.out.println("Нет положительных элементов.");
        }
    }
}
