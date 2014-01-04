/**
 * Created by bobweekend on 12/29/13.
 */
public class TransmuteIncantation extends Incantation
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
    public castZone getZone()
    {
        return target.zone;
    }
}
