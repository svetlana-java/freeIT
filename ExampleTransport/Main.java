package ExampleTransport;

public class Main {
    public static void main(String[] args) {
LightTransport car = new LightTransport(100,200, 1000, "Audi", 4, 5, "седан", 4);
FreightTransport truck = new FreightTransport(200,150,33000, "МАЗ", 6, 10, 20000);
CivilTransport plane = new CivilTransport(400,850,40000,"Boeing",28,1200,96,true);
MilitaryTransport milPlane = new MilitaryTransport(500,900,25000,"Ил-22",29,900,true,0);
car.description();
car.time(2);
        System.out.println();
truck.description();
truck.getCargo(20001);
        System.out.println();
plane.description();
plane.getPassenger(50);
        System.out.println();
milPlane.description();
milPlane.getBailout();
milPlane.shot();
    }
}
