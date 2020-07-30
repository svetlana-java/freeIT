package homework3;

/**
 * Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, их номера.
 */
public class Example14 {
    public static void main(String[] args){
        int array [] = {7, 7, 8, 5, 1, 10, 6};
        int minIndex = 0;
        int minvalue = array [0];
        int maxIndex = 0;
        int maxvalue = array [0];
        for (int i = 0; i < array.length; i ++){
            if (minvalue > array[i]) {
                minvalue = array[i];
                minIndex = i;
            }
        }
        for (int i = 0; i < array.length; i ++){
            if (maxvalue < array[i]) {
                maxvalue = array[i];
                maxIndex = i;
            }
        }
        System.out.println("Индекс минимального числа " + minIndex + " : " + " минимальное число массива " + minvalue);
        System.out.println("Индекс максимального числа " + maxIndex + " : " + " максимальное число массива " + maxvalue);
    }
}
