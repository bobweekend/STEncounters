/**
 * Created by bobweekend on 12/29/13.
 */
public class AttackIncantation extends Incantation
{
    public  boolean checkDiscardCondition()
    {
        return (chips == 0);
    }
    public  void initialize()
    {

    }
}
