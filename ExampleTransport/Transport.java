package ExampleTransport;

public abstract class Transport {
 int power;  // мощность л.с.
 int maxSpeed; //  макс. скорость
 int weight;  //  масса
 String brand;  // марка

public Transport(int power, int maxSpeed, int weight, String brand){
 this.power = power;
 this.maxSpeed = maxSpeed;
 this.weight = weight;
 this.brand = brand;
}
 public abstract double powerKv(); // Расчёт мощности в киловаттах

 public abstract void description(); // Метод описания всех характеристик объекта

}
