package lecture13;

public class HeightUp extends CharacterDecorator{

    public HeightUp(ICharacter c) {
       super(c);
    }

    public String getAbilities() {
        return character.getAbilities() + " with HeightUp";
    }
}
