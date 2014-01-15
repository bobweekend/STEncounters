/**
 * Created by blallen on 1/6/14.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GM
{
    private ArrayList<Player> playerList;
    private int currentPlayer;
    private int round;
    public int resonanceRoll()
    {
        Random  rnd = new Random();
        int d10a;
        int resonance = 0;
        d10a = rnd.nextInt(9)+1;

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
            case 9:
                resonance = 3;
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
        Player p = playerList.get(currentPlayer);
        return p;
    }

    public void calcualteInititive()
    {
        // sort the list descending order harmony >resonance>essence
        PlayerComparator pc = new PlayerComparator();
        Collections.sort(playerList,Collections.reverseOrder(pc));
        currentPlayer = 0;
    }

    public int nextPlayer()
    {
        currentPlayer ++;
        if (currentPlayer > playerList.size())
        {
          currentPlayer = -1;
            // signal end of round.
        }
        return currentPlayer;
    }


}
