/**
 * Created by bobweekend on 12/29/13.
 */
public class AbjurationIncantation extends Incantation
{
    private Incantation target;

    public void setTarget(Incantation target)
    {
        this.target = target;
    }

    public  boolean checkDiscardCondition()
    {
       return target.checkDiscardCondition();
    }
    public  void initialize()
    {

    }

    public castZone getZone()
    {
        return target.zone;
    }
}
