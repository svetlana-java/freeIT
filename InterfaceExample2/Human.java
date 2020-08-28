package InterfaceExample2;

public class Human implements Jacket, Pants, Shoes {
    String name;
    String jacket;
    String pants;
    String shoes;

    public Human(String name, String jacket, String pants, String shoes) {
        this.name = name;
        this.jacket = jacket;
        this.pants = pants;
        this.shoes = shoes;
    }
    public Human() {
    }
    @Override
    public void dressJacket() {
        System.out.println(name + " надел " + jacket + " куртку "); }
    @Override
    public void unDressJacket() {
        System.out.println(name + " снял " + jacket + " куртку "); }
    @Override
    public void dressPants() {
        System.out.println(name + " надел " + pants + " штаны "); }
    @Override
    public void unDressPants() {
        System.out.println(name + " снял " + pants + " штаны "); }
        @Override
    public void dressShoes() {
        System.out.println(name + " обул " + shoes + " обувь "); }
    @Override
    public void unDressShoes() {
        System.out.println(name + " снял " + shoes + " обувь "); }

public void allDress(){
    dressJacket(); dressPants(); dressShoes();
}
public void unAllDress(){
    unDressJacket(); unDressPants(); unDressShoes();
}
}