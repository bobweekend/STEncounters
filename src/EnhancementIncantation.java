/**
 * Created by bobweekend on 12/29/13.
 */
public class EnhancementIncantation extends Incantation
{
    public  boolean checkDiscardCondition()
    {
        return (chips == 0);
    }
}
