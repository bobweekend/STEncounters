/**
 * Created by bobweekend on 12/29/13.
 */
public class DefenseIncantation extends Incantation
{
    public  boolean checkDiscardCondition()
    {
        return (chips == 0);
    }
}
