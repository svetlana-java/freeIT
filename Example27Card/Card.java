package Example27Card;

public  class Card implements GiveMone {
    int sum;
    public Card(int sum) {
        this.sum = sum;
    }
    @Override
    public void giveMoney(int summa) {
        if (this.sum >= summa){
            System.out.println("Денег хватит");
        }else {
            System.out.println("Денег нет");
        }
    }
}
