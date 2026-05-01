package lecture13;

public class GunPowerUp extends HeightUp{


    public GunPowerUp(ICharacter c) {
        super(c);
    }

    @Override
    public String getAbilities() {
        return character.getAbilities()+"with Gun";
    }
}
