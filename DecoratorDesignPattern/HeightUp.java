package DecoratorDesignPattern;

public class HeightUp extends CharacterDecorator{
    public HeightUp(ICharacter character){
        super(character);
    }
    @Override
    public String getAbilities(){
        return character.getAbilities() + " with HeightUp functionality ";
    }
}
