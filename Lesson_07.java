public class Lesson_07 {
    public static void main(String[] args) {
        int n = 19;
        if (n % 10 == 1 && n != 11)
            System.out.println(n + " программист");
        else if (n % 10 >= 2 && n % 10 <= 4 && n != 11 && n != 13 && n != 14)
            System.out.println(n + " программиста");
        else
            System.out.println(n + " программистов");
    }
}
