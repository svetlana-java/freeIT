package Lesson3;

/**
 * Найти сумму первых n целых чисел, которые делятся на 3.
 */
public class Example12 {
    public static void main(String[] args){
        int n = 10;
        int k = 0;
        int summ = 0;
        for(int i = 1; k < n; i++){
            if(i % 3 == 0) {
                summ = summ + i;
                k++;
            }
        }
        System.out.println(summ);
    }
}
