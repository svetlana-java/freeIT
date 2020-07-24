package Lesson3;

/**
 * Имеется прямоугольное отверстие размерами a и b, определить, можно ли его полностью закрыть
 * круглой картонкой радиусом r.
 */
public class Example7 {
    public static void main(String[] args){
        int a = 6;
        double a1 = a / 2d;
        int b = 4;
        int r = 2;
        if(a > b && a1 <= r){
            System.out.println("Полностью закроет");
    }else{
            System.out.println("Не закроет");
        }
    }
}
