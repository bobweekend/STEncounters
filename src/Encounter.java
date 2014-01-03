import java.util.ArrayList;

/**
 * Created by bobweekend on 12/28/13.
 */
public abstract class Encounter extends Player
{
    public enum chipColor {RED,YELLOW,BLACK};
    public void Encounter()
    {

    }

    protected ArrayList<chipColor> chip;

    public chipColor draw()
    {
        // pick a random chip from the bag removing it from the list.
        return chipColor.RED;
    }

    public abstract void reload();

    public abstract int target();

}
