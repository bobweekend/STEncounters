import java.util.ArrayList;

/**
 * Created by bobweekend on 12/28/13.
 */
public abstract class Encounter extends Player
{
    public enum chipColor {RED,YELLOW,BLACK, GREEN};
    protected ArrayList<chipColor> bag;
    private ArrayList<Player> attackers;
    public void Encounter()
    {
        bag = new ArrayList<chipColor>();
        attackers = new ArrayList<Player>();
    }

    public chipColor draw()
    {
        // pick a random chip from the bag removing it from the bag. Removing it in the process
        return chipColor.RED;
    }

    public abstract void reload(); // Checks to see if reload is needed than reloads.

    public abstract int target();
}
