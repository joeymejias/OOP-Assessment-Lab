/**
 * Created by drewmahrt on 4/27/16.
 */

//TODO: Make Skeleton a subclass of monster, and implement the aboutMe method.
//Example output of the aboutMe method: "I am a Zombie with 4 health and do 10 damage!"

public class Zombie extends Monster{
    private static Zombie zombie = null;

    public Zombie(){
        super(1500, 100);
    }

    public static Zombie getInstance(){
        if (zombie == null){
            zombie = new Zombie();
        }
        return zombie;
    }

    @Override
    public String aboutMe() {
        return "I am a Zombie with " + getHealth() + " health and do " + getDamage() + " damage!";
    }
}
