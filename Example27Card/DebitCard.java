package Example27Card;

public class DebitCard extends Card {
    String type;
    public DebitCard(int sum, String type) {
        super(sum);
        this.type = type;
    }
    @Override
    public void giveMoney(int summa) {
        super.giveMoney(summa);
    }
}
