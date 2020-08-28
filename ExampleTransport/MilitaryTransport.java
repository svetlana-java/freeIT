package ExampleTransport;

public class MilitaryTransport extends AirTransport{
    boolean bailout; // наличие системы катапультирования (true/false)
    int rocket; // кол-во ракет на борту

    public  MilitaryTransport(int power, int maxSpeed, int weight, String brand, double span, double minrunway, boolean bailout, int rocket ) {
        super(power, maxSpeed, weight, brand,span,minrunway);
        this.bailout = bailout;
        this.rocket = rocket;

        }
    @Override
    public double powerKv() {
        double power2 = power * 0.74;
        return power2;
    }
        @Override
        public void description(){
            System.out.println("Объект milplane класса MilitaryTransport имеет следующие характеристики: мощность - " + power + " л.с.; мощность в киловатах - " + powerKv() + "; максимальная скорость - " +
                    maxSpeed + " км/ч; масса - " + weight + " кг; марка - " + brand + "; размах крыльев " + span + " м; минимальная длина взлётно-посадочной полосы для взлёта - " + minrunway + " м;" +
                    "; наличие системы катапультирования - " + bailout + "; кол-во ракет на борту - " + rocket);
        }
        public void shot (){
        if (rocket>0){
            System.out.println("Ракета пошла...");
        }if (rocket == 0){
            System.out.println("Боеприпасы отсутствуют"); }
        }
        public void getBailout() {
            if (bailout = false) {
                System.out.println("У вас нет системы катапультирования");
            }
            if (bailout = true) {
                System.out.println("Катапультирование прошло успешно");
            }

        }}