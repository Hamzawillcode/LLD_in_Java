package lecture13;

public class DecoratorPattern {
    static void main() {
        ICharacter mario=new Mario();
        System.out.println("Basic Character: " + mario.getAbilities());
        mario=new HeightUp(mario);//here type is of mario hence ability of mario
        System.out.println("After HeightUp: " + mario.getAbilities());
        //mario became heightup mario
        mario = new GunPowerUp(mario);
        //mario in the constructor
        System.out.println("After GunPowerUp: " + mario.getAbilities());
        mario = new StarPowerUp(mario);
        System.out.println("After StarPowerUp: " + mario.getAbilities());
    }

}
