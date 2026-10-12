package FactoryDesignPattern.SimpleFactoryDesign;

public class BurgerFactory {
    Burger burger;
    public Burger createBurger(String type){
        switch(type){
            case "Basic":
                burger = new BasicBurger();
                return burger;
            case "Standard":
                burger = new StandardBurger();
                return burger;  
            case "Premium":
                burger = new PremiumBurger();
                return burger;
            default:
                throw new IllegalArgumentException("Invalid burger type: " + type);
        }   
    }
}
