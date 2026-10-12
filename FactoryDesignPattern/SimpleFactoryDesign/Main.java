package FactoryDesignPattern.SimpleFactoryDesign;

public class Main {
    public static void main(String[] args) {
        BurgerFactory burgerFactory = new BurgerFactory();
        
        Burger basicBurger = burgerFactory.createBurger("Basic");
        basicBurger.prepare();
        
        Burger standardBurger = burgerFactory.createBurger("Standard");
        standardBurger.prepare();
        
        Burger premiumBurger = burgerFactory.createBurger("Premium");
        premiumBurger.prepare();
    }
}
