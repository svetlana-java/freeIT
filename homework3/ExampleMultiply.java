package homework3;

/**
 * Составьте программу, вычисляющую A * B, не пользуясь операцией умножения.
 */
public class ExampleMultiply {
    public static void main(String[] args){
        int a = 5;
        int b = 9;
        int result1 = a * b;
        int result2 = a + b;
        for (int i = 0; i != result1; i++){
            if (result2 < result1) {
                result2 = result1;
                result2 += i;
                i++;
                System.out.println( "A * B = " + result2);
            }
        }
        if (a == 0 || b == 0) {
            System.out.println(0);
        }
        if (a == 1 || b == 1) {
            System.out.println(result2 - 1);
        }
    }
}
