import java.util.Comparator;

/**
 * Created by bobweekend on 1/11/14.
 */
public class PlayerComparator implements Comparator<Player>
{
    public int compare(Player p1, Player p2)
    {
        int bigger = 0;
        if(p1.getHarmony() == p2.getHarmony() )
        {
            if(p1.getResonance() == p2.getResonance() )
            {
                if(p1.getEssence() == p2.getEssence() )
                {
                    bigger = 0;
                }
                if(p1.getEssence() > p2.getEssence() )
                {
                    bigger = 1;
                }
                else
                {
                    bigger = 0;
                }
            }
            else if(p1.getResonance() > p2.getResonance() )
            {
                bigger = 1;
            }
            else
            {
                bigger = 0;
            }

        }
        else if (p1.getHarmony() > p2.getHarmony())
        {
            bigger = 1;
        }
        else
        {
            bigger = -1;
        }
        return bigger;
    }
}
