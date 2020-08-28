package ExampleTransport;

public class FreightTransport extends LandTransport {
    final int maxWeight; // грузоподъумность

    public FreightTransport(int power, int maxSpeed, int weight, String brand, int wheel, int fuel, int maxWeight) {
        super(power, maxSpeed, weight, brand,wheel,fuel);
        this.maxWeight = maxWeight; // грузоподъемность
    }
    @Override
    public  double powerKv(){
        double power2 = power * 0.74;
        return power2;
    }
    @Override
    public void description (){
        System.out.println("Объект truck класса FreightTransport  имеет следующие характеристики: мощность - " + power + " л.с.; мощность в киловатах - " + powerKv() + "; максимальная скорость - " +
                maxSpeed + " км/ч; масса - " + weight + " кг; марка - " + brand + "; количество колес - " + wheel + "; расход топлива - " + fuel + " л/100 км; грузоподъемность - " + maxWeight);
}
public void getCargo (double cargo) {
    if (cargo <= maxWeight) {
        System.out.println("Грузовик загружен");
    } else {
        System.out.println("Вам нужен грузовик побольше");
    }
}
}