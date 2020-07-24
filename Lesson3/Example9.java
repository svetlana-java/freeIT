package Lesson3;

/**
 * Получить ряд случайных чисел и посчитать факториал числа.
 */
public class Example9 {
    public static void main(String[] args) {
        int factorial = 1;
        int n = 0;
        int x = (int) (Math.random() * 20);
        while (x != 0) {
            factorial *= x;
            n++;
            x = (int) (Math.random() * 20);
            System.out.println("Ряд случайных чисел " + x);
        }
        System.out.println("Факториал числа " + factorial);
    }

}
