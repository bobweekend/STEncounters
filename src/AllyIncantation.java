/**
 * Created by bobweekend on 1/3/14.
 */
public class AllyIncantation extends Incantation
{
    private Player npc;

    public AllyIncantation()
    {
        npc = new Player();
    }

    public  void initialize()
    {

    }

    public  boolean checkDiscardCondition()
    {
        return (chips == 0);
    }

    public Player getNpc()
    {
        return npc;
    }

}
