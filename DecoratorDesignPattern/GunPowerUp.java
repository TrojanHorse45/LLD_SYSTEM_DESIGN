package DecoratorDesignPattern;

public class GunPowerUp extends CharacterDecorator{
    public GunPowerUp(ICharacter character){
        super(character);
    }
    @Override
    public String getAbilities(){
        return character.getAbilities() + " with Gunpower up";
    }
}
