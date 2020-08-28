package Example26HouseHold;

public class Refrigerator extends OverSize {        // класс-наследник OverSize

    @Override
    public void plugIn() {
        System.out.println("Холодильник включен в розетку");
    }
}
