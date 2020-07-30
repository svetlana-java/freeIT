package homework3;

/**
 * Создать массив, заполнить его случайными элементами, распечатать,
 * перевернуть и снова распечатать.
 */

public class Example15 {
    public static void main(String[] args){
        int array[]  = {4, 73, 81, 3, 7};
        for(int i = 0; i < array.length; i++){
            System.out.print( array[i] + " ");
        }
        System.out.println();
        for (int i = array. length -1; i >= 0; i--){
            System.out.print( array[i] + " ");
        }
    }
}
