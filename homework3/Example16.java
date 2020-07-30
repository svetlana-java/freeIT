package homework3;

/**
 * Определите сумму элементов одномерного массива, расположенных между минимальным и максимальными значениями.
 */
public class Example16 {
    public static void main(String[] args){
        int[] array = {10, 2, 4, 9, 17, 43, 8};
        int maxIndex = 0;
        int minIndex = 0;
        int maxValue = array[0];
        int minValue = array [0];
        int result = 0;
        for (int i = 0; i < array.length; i++){
            if (maxValue < array [i]){
                maxValue = array [i];
                maxIndex = i;
            }
        }
        for (int i = 0; i < array.length; i++){
            if (minValue > array [i]){
                minValue = array [i];
                minIndex = i;
            }
        }
        for (int i = minIndex + 1; i < maxIndex ; i++){
           result = result + array[i];
        }
        System.out.println("Индекс минимального числа " + minIndex + " : " + " минимальное число массива " + minValue);
        System.out.println("Индекс максимального числа " + maxIndex + " : " + " максимальное число массива " + maxValue);
        System.out.println("Сумма равна  " + result);
    }
}
