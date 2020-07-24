package Lesson3;

import java.util.Random;

/**
 * Посчитать факториал числа в границах от 10 до 15.
 */
public class Example10 {
    public static void main(String[] args) {
        int val1 = 10;
        int val2 = 15;
        int diff = val2 - val1;
        Random random = new Random();
        int val = random.nextInt(diff + 1) + val1;
        System.out.println("Рандомное число " + val);
        int result = factorial(val);
System.out.println("Факториал числа " + result);

    }
        public static int factorial(int val){
           int result = 1;
            for (int i = 1; i <= val; i++) {
               result *= i;
            }
            return result;
        }
}
