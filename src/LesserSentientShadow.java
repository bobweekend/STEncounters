import java.util.ArrayList;
import java.util.Random;

/**
 * Created by bobweekend on 1/14/14.
 */
public class LesserSentientShadow extends Encounter
{
    private enum possibleActions {REMOVECURSE, FOCUSED,DARK,PURGE,CLAW,DARKNESS}
    private int redChips;
    private int yellowChips;
    private possibleActions act;
    public void LesserSentientShadow(int numberPlayers)
    {
        firstName = "Lesser Sentient Shadow";
        resonance = 0;
        harmony = 0;
        essence = 10+(2*(numberPlayers-1));
        will = 0;
        standardActions = 2;
        freeActions = 1;
        additionalRes = numberPlayers;
        redChips = 0;
        yellowChips = 0;

    }

    public void reload() // Checks to see if reload is needed than reloads. reload includes initial load
    {
        //bag resets when 3 red and 1 yellow drawn
        if(bag.size() == 0 || (redChips >=3 && yellowChips >=1))
        {
            bag = new ArrayList<chipColor>();
            bag.add(chipColor.RED);
            bag.add(chipColor.RED);
            bag.add(chipColor.RED);
            bag.add(chipColor.RED);
            bag.add(chipColor.YELLOW);
            bag.add(chipColor.YELLOW);
            redChips = 0;
            yellowChips = 0;
        }
    }

    public int target()
    {
        // -2 indicates area  All damage attacks are area.
        return -2;
    }

    protected  void chipDrawn(chipColor chip)
    {
        if(chip == chipColor.RED)
        {
            redChips++;
        }
        else if (chip == chipColor.YELLOW)
        {
            yellowChips++;
        }

    }
    public String actionToPreform()
    {
        String action = null;
        chipColor chip;
        reload();
        chip = draw();
        if(chip == chipColor.YELLOW)
        {
            if(resonance >=3)
            {
                if(curses.size() > 0)
                {
                    //we have curses need to check if soul or mind
                    action="Ability Chart A";
                    act = possibleActions.REMOVECURSE;
                }
            }
            if (resonance >=2 && action == null)
            {
                //check attackers for active focus.
                action = "Ability Chart B";
                act = possibleActions.FOCUSED;
            }
            else if(action == null)
            {
                // do 1 harmony damage to all attackers. Subtle.
                action = "Dark Lash";
                act= possibleActions.DARK;
            }
        }
        else if (chip == chipColor.RED)
        {

            if(resonance >=4)
            {
                action = "Purge the Light";
                act = possibleActions.PURGE;
            } else if (resonance >=2)
            {
                action = "Spectral Claw";
                act = possibleActions.CLAW;
            }
            else
            {
                action = "Draw Darkness";
                act = possibleActions.DARKNESS;
            }

        }

     return action;
    }
    public int performAction(int placeHolder)
    {
        int actionsUsed = 1;
        Random rnd = new Random();
        int d10a;

        switch(act)
        {
            case REMOVECURSE:
                //Ability chart A. d10
                d10a = rnd.nextInt(9)+1;
                switch (d10a)
                {
                    case 1:
                    case 2:
                    case 3:
                        //dispell all curses
                        curses = new ArrayList<Incantation>();
                        break;
                    case 4:
                    case 5:
                    case 6:
                        //only get here is you have curses;
                        curses.remove(curses.size()-1);
                        break;
                    case 7:
                    case 8:
                    case 9:
                        resonance++;
                        break;
                    case 10:
                        resonance -=2;
                        break;
                }

                break;
            case FOCUSED:
                d10a = rnd.nextInt(9)+1;
                switch (d10a)
                {
                    case 1:
                    case 2:
                    case 3:
                        //disrupt with subtle
                        break;
                    case 4:
                    case 5:
                    case 6:
                        //disrupt not subtle.
                        break;
                    case 7:
                    case 8:
                    case 9:
                        // area 1 damage,
                        resonance++;
                        break;
                    case 10:
                        break;
                }

                break;
            case DARK:
                break;
            case PURGE:
                break;
            case CLAW:
                break;
            case DARKNESS:
                break;
        }

        return actionsUsed;
    }

}

