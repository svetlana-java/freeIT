package ExampleTransport;

public class AirTransport extends Transport {
    double span; // размах крыльев (м)
    double minrunway; // минимальная длина взлётно-посадочной полосы для взлёта


public AirTransport(int power, int maxSpeed, int weight, String brand, double span, double minrunway){
    super(power, maxSpeed, weight, brand);
    this.span =span;
    this.minrunway = minrunway;
}
    @Override
    public double powerKv() {
        double power2 = power * 0.74;
        return power2;
    }
    @Override
    public void description(){
        System.out.println("Объект plane класса CivilTransport  имеет следующие характеристики: мощность - " + power + " л.с.; мощность в киловатах - " + powerKv() + "; максимальная скорость - " +
                maxSpeed + " км/ч; масса - " + weight + " кг; марка - " + brand + "; размах крыльев " + span + " м; минимальная длина взлётно-посадочной полосы для взлёта - " + minrunway + " м;");
    }

    public double getMinrunway() {
        return minrunway;
    }
}
