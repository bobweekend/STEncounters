/**
 * Created by blallen on 1/6/14.
 */

import java.util.ArrayList;

public class GM
{
    private ArrayList<Player> playerList;
    public int resonanceRoll()
    {
        int d10a;
        int resonance = 0;
        double tmp =java.lang.Math.random()* 10.0;
        d10a = (int) tmp + 1;
        switch (d10a)
        {
            case 1:
            case 2:
            case 3:
                resonance =1;
                break;
            case 4:
            case 5:
            case 6:
                resonance =2;
                break;
            case 7:
            case 8:
                resonance = 3;
                break;
            case 9:
                resonance = 4;
                break;
            case 10:
                resonance = 5;
                break;
        }
        return resonance;
    }
    public void addPlayer(Player p)
    {
        playerList.add(p);
    }

    public Player whosTurn()
    {
        Player p = playerList.get(0);
        return p;
    }

}
