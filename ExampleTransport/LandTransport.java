package ExampleTransport;

public   class  LandTransport extends Transport {
     int wheel;  // количество колес
     int fuel;  // расход топлива л\100км

    public LandTransport( int power, int maxSpeed, int weight, String brand,  int wheel, int fuel){
        super(power, maxSpeed, weight, brand);
        this.wheel = wheel;
        this.fuel = fuel;
    }

    @Override
    public double powerKv() {
        double power2 = power * 0.74;
        return power2;
    }
    @Override
    public void description() {
        System.out.println("Объект truck класса FreightTransport  имеет следующие характеристики: мощность - " + power + " л.с.; мощность в киловатах - " + powerKv() + "; максимальная скорость - " +
                maxSpeed + " км/ч; масса - " + weight + " кг; марка - " + brand + "; количество колес - " + wheel + "; расход топлива - " + fuel + " л/100 км;");
    }
}