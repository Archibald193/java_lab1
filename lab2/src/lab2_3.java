import java.util.Arrays;
import java.util.Random;
public class lab2_3 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][5];
        Random random = new Random();
        System.out.println("Матрица:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = random.nextInt(50) - 25;
            }
            System.out.println(Arrays.toString(matrix[i]));
        }

        int limit = 0;
        int[] b = new int[4];
        for (int i = 0; i < 4; i++) {
            int count = 0;
            for (int j = 0; j < 5; j++) {
                if (matrix[i][j] < limit) {
                    count++;
                }
            }
            b[i] = count;
        }
        System.out.println("Вектор B (количество элементов < " + limit + " в каждой строке):");
        System.out.println(Arrays.toString(b));
    }
}
