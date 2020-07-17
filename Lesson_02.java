public class Lesson_02 {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }
    }
}
