package FactoryDesignPattern.SimpleFactoryDesign;

public class BasicBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Basic Burger");
    }
}
