package homework3;

/**
 * Амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет
 *  * через 3, 6, 9, 12 ... 24 часа.
 */
public class ExampleAmeba {
    public static void main(String[] args) {
        int result = 1;
        for (int hour = 1; hour <= 24; hour++){
            if(hour % 3 == 0){
                result = result * 2;
                System.out.println(result + " амебы " + "через " + hour + " ч");
            }
        }
    }
}
