package lecture13;

public class StarPowerUp extends CharacterDecorator{
    public StarPowerUp(ICharacter character) {
        super(character);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities()+"with Star Power (Limited Time)";
    }
}
