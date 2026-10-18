package DecoratorDesignPattern;

public class MainClass {
    public static void main(String[] args) {
        ICharacter mario = new ConcreteCharacter();
        System.out.println(" Without any modifications " + mario.getAbilities());
        
        mario = new HeightUp(mario);
        System.out.println(" With Heightup modification " + mario.getAbilities());

        mario = new GunPowerUp(mario);
        System.out.println(" With GunPower modification " + mario.getAbilities());

        mario = new StarPowerUp(mario);
        System.out.println(" With Starpower Modification " + mario.getAbilities());
    }
}
