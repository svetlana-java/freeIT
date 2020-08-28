package homework5;

/*
Создать класс и объект, описывающие банкомат.
 */
public class Example25 {
    public static void main(String[] args) {
        CashMachine cashMachine1 = new CashMachine(1, 5, 5);

        CashMachine.addMoney(4, 3, 1);
        boolean requestCash = CashMachine.takeMoney(100);
    }
}

class CashMachine {
    private static int bill20;
    private static int bill50;
    private static int bill100;

    public CashMachine(int bill20, int bill50, int bill100) {
        this.bill20 = bill20;
        this.bill50 = bill50;
        this.bill100 = bill100;
    }

    public static void addMoney(int bill20, int bill50, int bill100) {
        int sum = 20 * bill20 + 50 * bill50 + 100 * bill100;
        System.out.println(sum);
        ;
    }

    public static boolean takeMoney(int requestCash) {
        if (requestCash <= 20 * bill20 + 50 * bill50 + 100 * bill100) {
            System.out.println("Возьмите деньги");
            return true;
        } else {
            System.out.println("Денег нет");
            return false;
        }

    }


}