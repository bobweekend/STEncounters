/**
 * Created by bobweekend on 12/29/13.
 */
public class IncantationFactory
{
    public IncantationFactory()
    {
        // set up any connection information to the data source for the cards.
    }
    public Incantation getIncantation(int cardNumber)
    {
        Incantation ret;
        //make call to http://www.becomemagi.com/arcanum/getCard.php?p=[cardnumber]
        // depending on the type create a new one of that type from the supplied jason.
        ret = new AttackIncantation(); // place holder so this will compile.
        // parse the rules and build the card list
        // do a bunch of crap here...

        return ret;
    }
}
