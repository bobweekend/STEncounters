/**
 * Created by bobweekend on 12/28/13.
 */
import java.util.Date;
public class TestDriver {
    public static void main(String[] args)
    {
        Player p;
        p = new Player("Bob");
        CardFactory incantFact = new CardFactory();
        Date d = new Date();
        try
        {
        Incantation I;

            System.out.println(d.toString());
            for(int j = 1;j<600;j++)
            {
              I = incantFact.getIncantation(j);
                System.out.println("Card Number = " + j);
                if(I== null)
                {
                    break;
                }
                else
                {
                    System.out.println(I.toString());
                }
            }
            d = new Date();
            System.out.println(d.toString());
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        d = new Date();
        System.out.println(d.toString());
    }
}
