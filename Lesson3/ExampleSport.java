package Lesson3;

/**
 * Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый день он увеличивал
 * дневную норму на 10% нормы предыдущего дня.
 * Какой суммарный путь пробежит спортсмен за 7 дней?
 */
public class ExampleSport {
    public static void main(String[] args) {
        double km = 10;
            double result = km;
            for(int day = 2; day <= 7; day++){
                double persent = result * 0.1;
                result =  result + persent;
                System.out.println( day + " день спортсмен пробежит " + result + " км");
            }
}
}
