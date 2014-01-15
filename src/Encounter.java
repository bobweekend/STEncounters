import java.util.ArrayList;
import java.util.Random;

/**
 * Created by bobweekend on 12/28/13.
 */
public abstract class Encounter extends Player
{
    public enum chipColor {RED,YELLOW,BLACK, GREEN}
    protected ArrayList<chipColor> bag;
    private ArrayList<Player> attackers;
    protected int additionalRes;


    protected void Encounter()
    {
        bag = new ArrayList<chipColor>();
        attackers = new ArrayList<Player>();
    }

    public chipColor draw()
    {
        Random rnd = new Random();
        int chip = rnd.nextInt(bag.size()-1);
        chipColor cc;
        // pick a random chip from the bag removing it from the bag. Removing it in the process
        cc = bag.get( chip);
        bag.remove(chip);
        chipDrawn(cc);
        return cc;
    }
    public void addResonance(int res)
    {
        resonance += res + additionalRes;
    }

    public abstract void reload(); // Checks to see if reload is needed than reloads. reload includes initial load

    public abstract int target();
    protected abstract void chipDrawn(chipColor chip);
    public abstract String actionToPreform();
}
