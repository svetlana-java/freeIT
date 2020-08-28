package Example26HouseHold;

public class Teapot extends SmallSize { // класс- наследник SmallSize;
    @Override
    public void plugIn(){
        System.out.println("Чайник не включен в розетку");
    }
}
