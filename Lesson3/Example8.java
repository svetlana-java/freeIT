package Lesson3;

import java.util.Random;

/**
 * Имеется целое число - количество денег в рублях. Вывести это число, добавив слово "рублей" в правильном падеже.
 */
public class Example8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int rubl = rand.nextInt(1000);
        int result1 = rubl % 10;
        int result2 = rubl % 100;
        if (result1 == 1 && result2 != 11) {
            System.out.println(rubl + " рубль ");
        } else if ((result1 == 2 || result1 == 3 || result1 == 4)
                && !(result2 == 12 || result2 == 13 || result2 == 14)) {
            System.out.println(rubl + " рубля ");
        }else {
            System.out.println(rubl + " рублей ");
        }
    }
}
