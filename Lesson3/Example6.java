package Lesson3;

/**
 * Создайте число. Определите, является ли число трехзначным. Определите, является ли его последняя цифра семеркой.
 * Определите, является ли число четным.
 *
 */
public class Example6 {
    public static void main(String[] args) {
        int value = 10;
        if (value >= 100 && value < 1000 || value <= -100 && value > -1000) {
            System.out.println("Число " + value + " является трехзначным");
        } else {
            System.out.println("Число " + value + " не является трехзначным");
        }
        if (value % 10 == 7 || value % 10 == -7) {
            System.out.println("Последняя цифра числа " + value + " семь");
        } else {
            System.out.println("Число " + value + " не заканчивается на семь");
        }
        if (value % 2 == 0) {
            System.out.println("Число " + value + " является четным");
        } else {
            System.out.println("Число " + value + " нечетное");
        }
    }
}


