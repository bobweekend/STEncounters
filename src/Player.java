/**
 * Created by bobweekend on 12/28/13.
 */
import java.lang.Math;
import java.util.ArrayList;

public class Player {
    private int number;
    private String firstName;
    private int resonance;
    private int harmony;
    private int essence;
    private int standardActions;
    private int freeActions;
    private int interruptStone;
    private int totalFocus;
    private int usedFocus;
    private ArrayList<Incantation> enhanceZone;
    private ArrayList<Incantation> defenseZone;
    private ArrayList<Incantation> attackZone;
    public enum energy {RESONANCE,HARMONY,ESSENCE};
    public int getStandardActions() {
        return standardActions;
    }

    public int getFreeActions() {
        return freeActions;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getInterruptStone() {
        return interruptStone;
    }

    public int getWill() {
        return will;
    }

    private int will;

    public int getNumber() {
        return number;
    }

    protected Player()
    {
        /*
        NPC type player each could have its own rules so this is an empty place holder.
        it is the responsibility of the subclass to ensure correct initial states.
        */
    }

    public Player(String fn)
    {
        firstName=fn;
        resonance=0;
        harmony =0;
        essence = 10;
        will = 3;
        standardActions =2;
        freeActions = 1;
    }

    public int getTotalFocus() {
        return totalFocus;
    }

    public int getUsedFocus() {
        return usedFocus;
    }

    public void useWill(energy e)
    {
        if (will > 0)
        {
            will --;
            switch (e)
            {
                case RESONANCE:
                    resonance += 3;
                    break;
                case HARMONY:
                    harmony +=2;
                    break;
                case ESSENCE:
                    essence ++;
                    break;
            }
        }
    }
    public int harmonyDamage(int amt)
    {
        harmony-=amt;
        int ret = 0;
        int d10a;
        int d10b;
        int total;
        double tmp =java.lang.Math.random()* 10.0;
        d10a = (int) tmp;
        tmp =java.lang.Math.random()* 10.0;
        d10b =(int) tmp;
        total = d10a+d10b;
        if(harmony==  -7 || harmony ==-17)
        {

            if(total < Math.abs(harmony))
            {
                //discord event
                ret = -1;
                essence -=3;
            }

        }
        else if (harmony == 7 || harmony ==17)
        {
            // harmony event
            ret = 1;
            resonance += 3;
        }
        return ret;
    }

    public int initiative()
    {
        int d10a;
        int d10b;
        int total;
        int ret =0;
        double tmp =java.lang.Math.random()* 10.0;
        d10a = (int) tmp;
        tmp =java.lang.Math.random()* 10.0;
        d10b =(int) tmp;
        total = d10a+d10b;
        if(harmony <= -7)
        {
            if(total < Math.abs(harmony))
            {
                ret=-1;
                essence -=3;
            }
            //discord event
        }
        else if (harmony >=7)
        {
            // harmony event
            ret = 1;
            if(total < harmony)
            {
               resonance +=3;
            }
        }
        return ret;
    }

    public void essenceDamage(int amt)
    {
        essence-=amt;
    }
}
