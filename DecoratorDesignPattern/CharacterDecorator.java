package DecoratorDesignPattern;

// has-a charcter and is-a character
public abstract class CharacterDecorator implements ICharacter{
    protected ICharacter character;
    public CharacterDecorator(ICharacter character){
        this.character = character;
    }
}
