package Example27Card;

public class Mastercard extends DebitCard implements Rassrochka {
    boolean rassrochka;
    public Mastercard(int sum, String type, boolean rassrochka) {
        super(sum, type);
       this.rassrochka = rassrochka;
    }
    @Override
    public void functionRassrochka() {
        if( rassrochka==true){
            System.out.println("Рассрочка есть");
        }else {
            System.out.println("Функции рассрочки нет");}
    }
}
