import java.util.ArrayList;

/**
 * Created by bobweekend on 12/28/13.
 */
public abstract class Incantation
{
    public enum sphere {SOUL, MIND, QUANTUM, BIO, FORCES, MATTER};
    public enum castZone {ATTACK, DEFENSE, ENHANCEMENT,CURSE};
    public enum targets {SINGLE, AREA, GLOBAL};
    protected sphere spellSphere;
    protected  String title;
    protected int fluency;
    protected String castPhrase;
    protected castZone zone;
    protected ArrayList<Incantation> activateRequires;
    protected ArrayList<Incantation> activateDiscard;
    protected ArrayList<Incantation> sustainRequires;
    protected ArrayList<Incantation> sustainDiscard;
    protected boolean requiresFocus;
    protected int chips;
    protected int harmonyCost;
    protected int resonanceCost;
    protected  targets targ;

    public sphere getSpellSphere()
    {
        return spellSphere;
    }

    public String getTitle()
    {
        return title;
    }

    public int getFluency()
    {
        return fluency;
    }

    public String getCastPhrase()
    {
        return castPhrase;
    }

    public castZone getZone()
    {
        return zone;
    }

    public abstract boolean checkDiscardCondition();
    public targets getTargets()
    {
        return targ;
    }

    @Override
    public String toString()
    {
        return "Incantation{" +
                "spellSphere=" + spellSphere +
                ", title='" + title + '\'' +
                ", fluency=" + fluency +
                ", castPhrase='" + castPhrase + '\'' +
                ", zone=" + zone +
                ", activateRequires=" + activateRequires +
                ", activateDiscard=" + activateDiscard +
                ", sustainRequires=" + sustainRequires +
                ", sustainDiscard=" + sustainDiscard +
                ", requiresFocus=" + requiresFocus +
                ", chips=" + chips +
                ", harmonyCost=" + harmonyCost +
                ", resonanceCost=" + resonanceCost +
                ", targ=" + targ +
                '}';
    }
}
