package Lesson3;

/**
 * Напишите программу печати таблицы перевода расстояний из дюймов в сантиметры
 * для значений длин от 1 до 20 дюймов.
 */
public class ExampleSm {
    public static void main(String[] args) {
        double cm = 2.54;
        double result = cm;
        for (int dum = 1; dum <= 20; dum++) {
            result = cm * dum;
                System.out.println(dum + " дюйм = " + result + " см");
            }
        }
    }





