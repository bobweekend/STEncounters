/**
 * Created by bobweekend on 12/29/13.
 */
import java.io.IOException;
import java.net.URL;

import java.net.MalformedURLException;
import java.util.ListIterator;
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
        IncantationDO source;
        //make call to http://www.becomemagi.com/arcanum/getCard.php?p=[cardnumber]
        // depending on the type create a new one of that type from the supplied jason.

        String url = "http://www.becomemagi.com/arcanum/getCard.php?p="+cardNumber;
        Gson gson = new Gson();

           source = gson.fromJson(IOUtils.toString(new URL(url)), IncantationDO.class);

        System.out.println(source);
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

        // parse the rules and build the card list
        // do a bunch of crap here...
/*
*  activateRequires;
   activateDiscard;
   sustainRequires;
   sustainDiscard;
 */
        return ret;
    }

    private void parseAspect(IncantationDO spell, Incantation incant)
    {
       if(spell.getAspect()!= null )
       {
           if(spell.getAspect().getBoost() != null)
           {
               NameValue boost;
               ListIterator<NameValue> list = spell.getAspect().getBoost().listIterator();
               while(list.hasNext())
               {
                   boost = list.next();
//Big if elseif ...
                  if(boost.getName().equals("Adamant"))
                  {

                  }
                  else if(boost.getName().equals("Area"))
                  {
                     if (boost.getValue().equals("G"))
                      {
                         incant.setTarg(Incantation.targets.GLOBAL);
                      }
                      else
                      {
                          incant.setTarg(Incantation.targets.AREA);
                      }
                  }
                  else if(boost.getName().equals("Backlash"))
                  {

                  }
                  else if(boost.getName().equals("Bonded"))
                  {

                  }
                  else if(boost.getName().equals("Brittle"))
                  {

                  }
                  else if(boost.getName().equals("Charge"))
                  {

                  }
                  else if(boost.getName().equals("Cloaked"))
                  {

                  }
                  else if(boost.getName().equals("Curse"))
                   {

                   }
                   else if(boost.getName().equals("Curse Duration"))
                   {
                       incant.setChips(Integer.valueOf(boost.getValue()).intValue());
                   }
                  else if(boost.getName().equals("Dampen Harmony"))
                  {

                  }
                  else if(boost.getName().equals("Dampen Resonance"))
                  {

                  }
                  else if(boost.getName().equals("Discord"))
                  {

                  }
                  else if(boost.getName().equals("Dispel"))
                  {

                  }
                  else if(boost.getName().equals("Disrupt"))
                  {

                  }
                  else if(boost.getName().equals("Dmg"))
                  {

                  }
                  else if(boost.getName().equals("Durability"))
                  {
                      incant.setChips(Integer.valueOf(boost.getValue()).intValue());
                  }
                  else if(boost.getName().equals("Duration"))
                  {
                      incant.setChips(Integer.valueOf(boost.getValue()).intValue());

                  }
                  else if(boost.getName().equals("Eloquent"))
                  {

                  }
                  else if(boost.getName().equals("Essence Infusion"))
                  {

                  }
                  else if(boost.getName().equals("Evade"))
                  {

                  }
                  else if(boost.getName().equals("Exclusive"))
                  {

                  }
                  else if(boost.getName().equals("Free Action"))
                  {

                  }
                  else if(boost.getName().equals("Harmony Dmg"))
                  {

                  }
                  else if(boost.getName().equals("Harmony Infusion"))
                  {

                  }
                  else if(boost.getName().equals("Harmony Siphon"))
                  {

                  }
                  else if(boost.getName().equals("Impenetrable"))
                  {

                  }
                  else if(boost.getName().equals("Inexorable"))
                  {

                  }
                  else if(boost.getName().equals("Infuse Rift"))
                  {

                  }
                  else if(boost.getName().equals("Injunction"))
                  {

                  }
                  else if(boost.getName().equals("Legendary"))
                  {

                  }
                  else if(boost.getName().equals("Obliteration"))
                  {

                  }
                  else if(boost.getName().equals("Pierce"))
                  {

                  }
                  else if(boost.getName().equals("Quickcast"))
                  {

                  }
                  else if(boost.getName().equals("Refined"))
                  {

                  }
                  else if(boost.getName().equals("Requires"))
                  {

                  }
                  else if(boost.getName().equals("Resilient"))
                  {

                  }
                  else if(boost.getName().equals("Resonance Dmg"))
                  {

                  }
                  else if(boost.getName().equals("Resonance Infusion"))
                  {

                  }
                  else if(boost.getName().equals("Resonance Siphon"))
                  {

                  }
                  else if(boost.getName().equals("Response"))
                  {

                  }
                  else if(boost.getName().equals("Sealed"))
                  {

                  }
                  else if(boost.getName().equals("Shape-Shift"))
                  {

                  }
                  else if(boost.getName().equals("Shatter"))
                  {

                  }
                  else if(boost.getName().equals("Shed Discord"))
                  {

                  }
                  else if(boost.getName().equals("Shield"))
                  {

                  }
                  else if(boost.getName().equals("Siphon"))
                  {

                  }
                  else if(boost.getName().equals("Spell Loss"))
                  {

                  }
                  else if(boost.getName().equals("Subtle"))
                  {

                  }
                  else if(boost.getName().equals("Unblockable"))
                  {

                  }
                  else if(boost.getName().equals("Unique to Bearer"))
                  {

                  }
                  else if(boost.getName().equals("Unique to Caster"))
                  {

                  }
                  else if(boost.getName().equals("Unique to Codex"))
                  {

                  }
                  else if(boost.getName().equals("Veiled"))
                  {

                  }
                  else if(boost.getName().equals("Ward"))
                  {

                  }
                  else if(boost.getName().equals("Will Dmg"))
                  {

                  }
                  else if(boost.getName().equals("Will Infusion"))
                  {

                  }
                  else if(boost.getName().equals("Will Siphon"))
                  {

                  }
               }
           }
       }
    }
    private void parseRequire(IncantationDO spell)
    {

    }
    private void parseRules(IncantationDO spell)
    {

    }
}
