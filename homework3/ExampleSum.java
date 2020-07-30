package homework3;

/**
 * Напишите программу. определяющую сумму всех нечетных чисел от 1 до 99.
 */

public class ExampleSum {
    public static void main(String[] args) {
        int result = 0;
        for(int i = 1; i <= 99; i++){
            if(i % 2 != 0){
                result = result + i;
            }
        }
        System.out.println("Сумма равна " + result);
    }
}


