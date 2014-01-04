/**
 * Created by bobweekend on 1/3/14.
 */
public class AllyIncantation extends Incantation
{
    public  boolean checkDiscardCondition()
    {
        return (chips == 0);
    }
}
