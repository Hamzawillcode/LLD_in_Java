package lecture13;

abstract class CharacterDecorator implements ICharacter{
    protected ICharacter character;

    public CharacterDecorator(ICharacter character) {
        this.character = character;
    }
    @Override
    public String getAbilities() {
        return character.getAbilities();
    }
}
