import java.security.PublicKey;

/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Dragon a subclass of Monster, implement the aboutMe method.
//Example output for aboutMe: "I am a Dragon with 3 health and do 8 damage!"

public class Dragon extends Monster{
    private static Dragon dragon = null;

    private Dragon(){
        super(5000, 500);
    }

    public static Dragon getInstance(){
        if (dragon == null){
            dragon = new Dragon();
        }
        return dragon;
    }

    @Override
    public String aboutMe() {
        return "I am a Dragon with " + this.getHealth() + " and do " + this.getDamage() + " damage!";
    }
}
