package ExampleTransport;

public class CivilTransport extends AirTransport {
    int numberPassengers; // кол-во пассажиров
    boolean businessClass; // наличие бизнес класса (true/false)

    public CivilTransport (int power, int maxSpeed, int weight, String brand, double span, double minrunway, int numberPassengers, boolean businessClass){
        super(power, maxSpeed, weight, brand,span,minrunway);
        this.numberPassengers = numberPassengers;
        this.businessClass = businessClass;       // конструктор объекта plane класса CivilTransport
    }


    @Override
    public  double powerKv(){
        double power2 = power * 0.74;
        return power2;
    }
    @Override
    public void description() {
        System.out.println("Объект plane класса CivilTransport  имеет следующие характеристики: мощность - " + power + " л.с.; мощность в киловатах - " + powerKv() + "; максимальная скорость - " +
                maxSpeed + " км/ч; масса - " + weight + " кг; марка - " + brand + "; размах крыльев " + span + " м; минимальная длина взлётно-посадочной полосы для взлёта - " + minrunway +
                " м; кол-во пассажиров - " + numberPassengers + "; наличие бизнес класса - " + businessClass);
    }
    public void getPassenger( int passenger){
        if (passenger <= numberPassengers){
            System.out.println("Самолет загружен");
        }else {
            System.out.println("Вам нужен самолет побольше");
        }
}
}

