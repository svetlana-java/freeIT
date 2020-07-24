package Lesson3;

/**
 * Создать последовательность случайных чисел, найти и вывести наибольшее из них.
 */
public class Example13 {
    public static void main(String[] args){
      int[] values = {45, 132, 81, 0, 8, 4, 73};
        int maxIndex = 0;
        int maxValue = values[maxIndex];
        for(int i = 0; i < values.length; i++){
          if(maxValue < values[i]){
              maxValue = values[i];
              maxIndex = i;
          }
        }
        System.out.println(maxIndex +" - индекс максимального числа в массиве" + "; " +
                maxValue + " - максимальное число");
    }
}
