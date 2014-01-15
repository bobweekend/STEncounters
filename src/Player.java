/**
 * Created by bobweekend on 12/28/13.
 */

import java.lang.Math;
import java.util.ArrayList;

public class Player
{
    protected int number;
    protected String firstName;
    protected int resonance;
    protected int harmony;
    protected int essence;
    protected int will;
    protected int standardActions;
    protected int freeActions;
    protected int interruptStone;
    protected int totalFocus;
    protected int usedFocus;
    protected ArrayList<Incantation> enhanceZone;
    protected ArrayList<Incantation> defenseZone;
    protected ArrayList<Incantation> attackZone;
    protected ArrayList<Incantation> curses;
    protected ArrayList<Incantation> codex;
    protected ArrayList<Incantation> preped;
    protected Specialization spec;
    protected Artifact art;

    public enum energy
    {
        RESONANCE, HARMONY, ESSENCE
    }


    public int getStandardActions()
    {
        return standardActions;
    }

    public int getFreeActions()
    {
        return freeActions;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public int getInterruptStone()
    {
        return interruptStone;
    }

    public int getWill()
    {
        return will;
    }

    public int getNumber()
    {
        return number;
    }

    public int getEssence()
    {
        return essence;
    }

    public int getResonance()
    {
        return resonance;
    }

    public int getHarmony()
    {
        return harmony;
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
        firstName = fn;
        resonance = 0;
        harmony = 0;
        essence = 10;
        will = 3;
        standardActions = 2;
        freeActions = 1;
    }

    public Specialization getSpec()
    {
        return spec;
    }

    public void setSpec(Specialization spec)
    {
        this.spec = spec;
    }

    public Artifact getArt()
    {
        return art;
    }

    public void setArt(Artifact art)
    {
        this.art = art;
    }

    public int getTotalFocus()
    {
        return totalFocus;
    }

    public int getUsedFocus()
    {
        return usedFocus;
    }

    public void useWill(energy e)
    {
        if (will > 0)
        {
            will--;
            switch (e)
            {
                case RESONANCE:
                    resonance += 3;
                    break;
                case HARMONY:
                    harmony += 2;
                    break;
                case ESSENCE:
                    essence++;
                    break;
            }
        }
    }

    public int harmonyDamage(int amt)
    {
        harmony -= amt;
        int ret = 0;
        int d10a;
        int d10b;
        int total;
        double tmp = java.lang.Math.random() * 10.0;
        d10a = (int) tmp + 1;
        tmp = java.lang.Math.random() * 10.0;
        d10b = (int) tmp + 1;
        total = d10a + d10b;
        if (harmony == -7 || harmony == -17)
        {

            if (total < Math.abs(harmony))
            {
                //discord event
                ret = -1;
                essence -= 3;
            }

        } else if (harmony == 7 || harmony == 17)
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
        int ret = 0;
        double tmp = java.lang.Math.random() * 10.0;
        d10a = (int) tmp;
        tmp = java.lang.Math.random() * 10.0;
        d10b = (int) tmp;
        total = d10a + d10b;
        if (harmony <= -7)
        {
            if (total < Math.abs(harmony))
            {
                ret = -1;
                essence -= 3;
            }
            //discord event
        } else if (harmony >= 7)
        {
            // harmony event
            ret = 1;
            if (total < harmony)
            {
                resonance += 3;
            }
        }
        return ret;
    }

    public void prep(ArrayList<Incantation> cards)
    {
        // could add a check to ensure a max of three cards are prepped.
        preped = cards;
    }

    public void maintenance()
    {

    }

    public void essenceDamage(int amt)
    {
        essence -= amt;
    }

    public void performMaintenance()
    {
        // check your zones in order and resolve effects
        //Attack Zone
        //Defense Zone
        // Enhance Zone
    }

    // happens after a card is activated.
    // Negative values indicate non-card actions.
    // -1 = exchange will for resonance
    // -2 = exchange will for harmony
    // -3 = exchange will for essence
    // -4 = meditate
    // -5 = miscast
    public int performAction(int cardNumber)
    {
        int actionsUsed = 0; // 0 indicates a free action

        if(cardNumber>0)
        {
            // check to see if card is prepped.
        }
        return actionsUsed;
    }

    public int performResponseAction(int cardNumber)
    {
        int actionsUsed = 0; // 0 indicates a free action


        return actionsUsed;
    }

    public void upgradeIncantation(Incantation card, ArrayList<String> cost)
    {
        // figure out later
    }

    public void upgradeRitual(Incantation card, ArrayList<String> cost)
    {
        // figure out later
    }

    public void addAttack(AttackIncantation attack)
    {
        attackZone.add(attack);
    }
    public void addDefence(DefenseIncantation defense)
    {
        defenseZone.add(defense);
    }
    public void addEnhancement(EnhancementIncantation enhancement)
    {
        if(enhanceZone.size()<4)
        {
            enhanceZone.add(enhancement);
        }

    }

    public void addCurse(Incantation curse)
    {
        //curses are resolved with enhancement. They do not count toward the 4 enhancements allowed.
        curses.add(curse);
    }
    public void addResonance(int res)
    {
        resonance += res;
    }
}
