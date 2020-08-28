package Example27Card;

public class CreditCard extends Card {
    String type;
    public CreditCard(int sum, String type) {
        super(sum);
        this.type = type;
    }
    @Override
    public void giveMoney(int summa) {
        super.giveMoney(summa);
    }
}
