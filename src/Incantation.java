import java.util.ArrayList;

/**
 * Created by bobweekend on 12/28/13.
 */
public abstract class Incantation
{
    public enum sphere {SOUL, MIND, QUANTUM, BIO, FORCES, MATTER,META}
    public enum castZone {ATTACK, DEFENSE, ENHANCEMENT,CURSE,ALLY}
    public enum targets {SINGLE, AREA, GLOBAL}
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
    protected int actionsUsed;
    protected  targets targ;
    protected IncantationDO raw;

    public IncantationDO getRaw()
    {
        return raw;
    }

    public void setRaw(IncantationDO raw)
    {
        this.raw = raw;
    }

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
    public abstract void initialize();
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

    public void setSpellSphere(sphere spellSphere)
    {
        this.spellSphere = spellSphere;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setFluency(int fluency)
    {
        this.fluency = fluency;
    }

    public void setCastPhrase(String castPhrase)
    {
        this.castPhrase = castPhrase;
    }

    public void setZone(castZone zone)
    {
        this.zone = zone;
    }

    public void setActivateRequires(ArrayList<Incantation> activateRequires)
    {
        this.activateRequires = activateRequires;
    }

    public void setActivateDiscard(ArrayList<Incantation> activateDiscard)
    {
        this.activateDiscard = activateDiscard;
    }

    public void setSustainRequires(ArrayList<Incantation> sustainRequires)
    {
        this.sustainRequires = sustainRequires;
    }

    public void setSustainDiscard(ArrayList<Incantation> sustainDiscard)
    {
        this.sustainDiscard = sustainDiscard;
    }

    public void setRequiresFocus(boolean requiresFocus)
    {
        this.requiresFocus = requiresFocus;
    }

    public void setChips(int chips)
    {
        this.chips = chips;
    }

    public void setHarmonyCost(int harmonyCost)
    {
        this.harmonyCost = harmonyCost;
    }

    public void setResonanceCost(int resonanceCost)
    {
        this.resonanceCost = resonanceCost;
    }

    public void setTarg(targets targ)
    {
        this.targ = targ;
    }

    public int getActionsUsed()
    {
        return actionsUsed;
    }
}
