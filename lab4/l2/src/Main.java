public class Main {
    public static void main(String[] args) {
        ComplexNumber x = new ComplexNumber(2, 3);
        System.out.println("Исходное число x: " + x);

        int n = 2;
        System.out.println("Возводим в степень n = " + n);
        ComplexNumber res = x.power(n);
        if (res != null) {
            System.out.println("Результат x^" + n + ": " + res);
        }
    }
}