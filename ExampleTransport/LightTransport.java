package ExampleTransport;

public class  LightTransport extends LandTransport {
     String bodyType; // тип кузова
     int numberPassenger;  // количество пассажиров

    public LightTransport(int power, int maxSpeed, int weight, String brand, int wheel, int fuel, String bodyType, int numberPassenger) {
        super(power, maxSpeed, weight, brand,wheel,fuel);
        this.bodyType = bodyType;
        this.numberPassenger = numberPassenger;
    }
    @Override
    public  double powerKv(){
        double power2 = power * 0.74;
        return power2;
    }
    @Override
    public void description (){
        System.out.println("Объект car класса  LightTransport имеет следующие характеристики: мощность - " + power + " л.с.; мощность в киловатах - " + powerKv() + "; максимальная скорость - " +
                maxSpeed + " км/ч; масса - " + weight + " кг; марка - " + brand + "; количество колес - " + wheel + "; расход топлива - " + fuel + " л/100 км; тип кузова - "+ bodyType + "; количество пассажиров - " + numberPassenger);
    }
    public double time(double hour) {   // метод расчета сколько километров проедет машина двигаясь с максимальной скоростью и сколько топлива она израсходует за это время
        double distance = maxSpeed * hour;
        double fuel1 = distance *0.01 * fuel;
        System.out.println("За время " + hour + " ч, автомобиль " + brand + " двигаясь с максимальной скоростью " + maxSpeed + " км/ч проедет " + distance + " км и израсходует " + fuel1 + " литров топлива");
        return distance + fuel1;
    }
}



