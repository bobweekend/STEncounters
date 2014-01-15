/**
 * Created by bobweekend on 12/29/13.
 */
public class DefenseIncantation extends Incantation
{
    public  boolean checkDiscardCondition()
    {
        return (chips == 0);
    }
    // examime the raw data for additional stuff.
    public  void initialize()
    {

    }
}
