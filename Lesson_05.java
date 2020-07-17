public class Lesson_05 {
    public static void main(String[] args) {
        int a = 10;
        int b = -5;
        int c = -3;
        int d = 0;
        int e = 0;

        if (a > 0) d++;
        if (a < 0) e++;
        if (b > 0) d++;
        if (b < 0) e++;
        if (c > 0) d++;
        if (c < 0) e++;

        System.out.println("Количество положительных чисел в наборе " + d + " Количество отрицательных чисел в наборе " + e);
    }
}
