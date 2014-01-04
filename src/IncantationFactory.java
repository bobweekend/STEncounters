/**
 * Created by bobweekend on 12/29/13.
 */
import java.io.IOException;
import java.net.URL;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.IOUtils;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

public class IncantationFactory
{
    public IncantationFactory()
    {
        // set up any connection information to the data source for the cards.
        //nothing needed using gson library.
    }
    public Incantation getIncantation(int cardNumber) throws JsonSyntaxException, MalformedURLException, IOException
    {
        Incantation ret = null;
        IncantationBaseDO source;
        //make call to http://www.becomemagi.com/arcanum/getCard.php?p=[cardnumber]
        // depending on the type create a new one of that type from the supplied jason.

        String url = "http://www.becomemagi.com/arcanum/getCard.php?p="+cardNumber;
        Gson gson = new Gson();
        try
        {
           source = gson.fromJson(IOUtils.toString(new URL(url)), IncantationDO.class);
        }
        catch (Exception e)
        {
            source = gson.fromJson(IOUtils.toString(new URL(url)), IncantationRitDO.class);
        }

        if (source.getCoreeffect().equals("Attack"))
        {
            ret = new AttackIncantation();
            ret.zone = Incantation.castZone.ATTACK;
        }
        else
        if (source.getCoreeffect().equals("Defense"))
        {
            ret = new DefenseIncantation();
            ret.zone = Incantation.castZone.DEFENSE;
        }
        else if  (source.getCoreeffect().equals("Component"))
        {
            ret = new ComponentIncantation();
            ret.zone = Incantation.castZone.DEFENSE;
        }
        else if  (source.getCoreeffect().equals("Transmute"))
        {
            ret = new TransmuteIncantation();
            //ret.zone = Incantation.castZone.  Set by target.
        }
        else if  (source.getCoreeffect().equals("Abjuration"))
        {
            ret = new AbjurationIncantation();
           // ret.zone = Incantation.castZone. set by target
        }
        else if  (source.getCoreeffect().equals("Enhance"))
        {
            ret = new EnhancementIncantation();
            ret.zone = Incantation.castZone.ENHANCEMENT;
        }
        else if  (source.getCoreeffect().equals("Ally"))
        {
            ret = new AllyIncantation();
            ret.zone = Incantation.castZone.DEFENSE;
        }
        ret.title= source.getCardname().getValue();
        ret.fluency = Integer.valueOf(source.getFluency()).intValue();
        ret.castPhrase=source.getCastphraseST();
        ret.harmonyCost = Integer.valueOf(source.getHarmonyCost()).intValue();
        ret.resonanceCost = Integer.valueOf(source.getResonanceCost()).intValue();

        if(source.getSpherename().equals("Mind"))
        {
            ret.spellSphere = Incantation.sphere.MIND;
        }
        else if(source.getSpherename().equals("Soul"))
        {
            ret.spellSphere = Incantation.sphere.SOUL;
        }
        else if(source.getSpherename().equals("Quantum"))
        {
            ret.spellSphere = Incantation.sphere.QUANTUM;
        }
        else if(source.getSpherename().equals("Bio"))
        {
            ret.spellSphere = Incantation.sphere.BIO;
        }
        else if(source.getSpherename().equals("Forces"))
        {
            ret.spellSphere = Incantation.sphere.FORCES;
        }
        else if(source.getSpherename().equals("Matter"))
        {
            ret.spellSphere = Incantation.sphere.MATTER;
        }
        System.out.println("Class =" + ret.getClass());
        System.out.println("zone =" + ret.getZone());
        System.out.println(""+ ret.toString());


//boring part of copying the DO to the actual object.


        // parse the rules and build the card list
        // do a bunch of crap here...

        return ret;
    }
}
