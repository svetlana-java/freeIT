package Example27Card;

public class Main {
    public static void main(String[] args) {
        CreditCard creditCard = new CreditCard(1000, "belveb");
        DebitCard debitCard = new DebitCard(150, "ideabank");
        Visa visa = new Visa(1234, "alfabank", true);
        Mastercard mastercard = new Mastercard(10000, "vtb", false);

        creditCard.giveMoney(1500);
        debitCard.giveMoney(150);

        visa.functionRassrochka();
        visa.giveMoney(100);

        mastercard.functionRassrochka();
        mastercard.giveMoney(155);
    }
}
