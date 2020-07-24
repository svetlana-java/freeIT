package Lesson3;

/**
 * Имеется целое число, определить является ли число простым, е.у. делится без остатка
 * на себя и 1.
 */

public class Example11 {
    public static void main(String[] args) {
        int numb = 31;
        boolean result = true;
        for (int i = 2; i < numb; i++) {
            if (numb % i == 0) {
                result = false;
            }
        }
        System.out.println(result);
    }
}



