package DecoratorDesignPattern;

public class StarPowerUp extends CharacterDecorator {
    public  StarPowerUp(ICharacter character){
        super(character);
    }
    @Override
    public String getAbilities(){
        return character.getAbilities() + " with Star power up power (limited time) ";
    }
}
