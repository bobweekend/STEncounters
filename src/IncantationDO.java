import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;

import java.util.Collection;
import java.util.List;

/**
 * Created by bobweekend on 1/3/14.
 */
@DatabaseTable(tableName = "incantation")
public class IncantationDO
{
    public void IncantationDO()
    {

    }

    @DatabaseField(id = true)
    private String printid;
    @DatabaseField(useGetSet = true)
    private String artist;
    @DatabaseField(useGetSet = true)
    private String backflavor;
    @DatabaseField(useGetSet = true)
    private String broadcastbar;
    @DatabaseField(useGetSet = true)
    private String cardcreator;
    @DatabaseField(useGetSet = true)
    private String castphraseEN;
    @DatabaseField(useGetSet = true)
    private String castphraseST;
    @DatabaseField(useGetSet = true)
    private String coreeffect;
    @DatabaseField(useGetSet = true)
    private String fluency;
    @DatabaseField(useGetSet = true)
    private String frontflavor;
    @DatabaseField(useGetSet = true)
    private String harmonyCost;
    @DatabaseField(useGetSet = true)
    private String internalid;
    @DatabaseField(useGetSet = true)
    private String needHandsign;
    @DatabaseField(useGetSet = true)
    private String rarity;
    @DatabaseField(useGetSet = true)
    private String require;
    @DatabaseField(useGetSet = true)
    private String resonanceCost;
    @DatabaseField(useGetSet = true)
    private String rules;
    @DatabaseField(useGetSet = true)
    private String spherename;
    @DatabaseField(useGetSet = true)
    private String upgrade;

    @DatabaseField(useGetSet = true, foreign = true )
    private Aspect aspect;
    @DatabaseField(useGetSet = true, foreign = true )
    private Cardname cardname;
    @DatabaseField(useGetSet = true, foreign = true )
    private RitualPaths ritualPaths;

    @ForeignCollectionField(eager = false)
    private Collection<String> assistantdev;

    @ForeignCollectionField(eager = false)
    private Collection<NameValue> empowerments;

    public RitualPaths getRitualPaths(){
        return this.ritualPaths;
    }
    public void setRitualPaths(RitualPaths ritualPaths){
        this.ritualPaths = ritualPaths;
    }

    public String getArtist(){
        return this.artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public Aspect getAspect(){
        return this.aspect;
    }
    public void setAspect(Aspect aspect){
        this.aspect = aspect;
    }
    public Collection<String> getAssistantdev(){
        return this.assistantdev;
    }
    public void setAssistantdev(List<String> assistantdev){
        this.assistantdev = assistantdev;
    }
    public String getBackflavor(){
        return this.backflavor;
    }
    public void setBackflavor(String backflavor){
        this.backflavor = backflavor;
    }
    public String getBroadcastbar(){
        return this.broadcastbar;
    }
    public void setBroadcastbar(String broadcastbar){
        this.broadcastbar = broadcastbar;
    }
    public String getCardcreator(){
        return this.cardcreator;
    }
    public void setCardcreator(String cardcreator){
        this.cardcreator = cardcreator;
    }
    public Cardname getCardname(){
        return this.cardname;
    }
    public void setCardname(Cardname cardname){
        this.cardname = cardname;
    }
    public String getCastphraseEN(){
        return this.castphraseEN;
    }
    public void setCastphraseEN(String castphraseEN){
        this.castphraseEN = castphraseEN;
    }
    public String getCastphraseST(){
        return this.castphraseST;
    }
    public void setCastphraseST(String castphraseST){
        this.castphraseST = castphraseST;
    }
    public String getCoreeffect(){
        return this.coreeffect;
    }
    public void setCoreeffect(String coreeffect){
        this.coreeffect = coreeffect;
    }
    public Collection<NameValue> getEmpowerments(){
        return this.empowerments;
    }
    public void setEmpowerments(List<NameValue> empowerments){
        this.empowerments = empowerments;
    }
    public String getFluency(){
        return this.fluency;
    }
    public void setFluency(String fluency){
        this.fluency = fluency;
    }
    public String getFrontflavor(){
        return this.frontflavor;
    }
    public void setFrontflavor(String frontflavor){
        this.frontflavor = frontflavor;
    }
    public String getHarmonyCost(){
        return this.harmonyCost;
    }
    public void setHarmonyCost(String harmonyCost){
        this.harmonyCost = harmonyCost;
    }
    public String getInternalid(){
        return this.internalid;
    }
    public void setInternalid(String internalid){
        this.internalid = internalid;
    }
    public String getNeedHandsign(){
        return this.needHandsign;
    }
    public void setNeedHandsign(String needHandsign){
        this.needHandsign = needHandsign;
    }
    public String getPrintid(){
        return this.printid;
    }
    public void setPrintid(String printid){
        this.printid = printid;
    }
    public String getRarity(){
        return this.rarity;
    }
    public void setRarity(String rarity){
        this.rarity = rarity;
    }
    public String getRequire(){
        return this.require;
    }
    public void setRequire(String require){
        this.require = require;
    }
    public String getResonanceCost(){
        return this.resonanceCost;
    }
    public void setResonanceCost(String resonanceCost){
        this.resonanceCost = resonanceCost;
    }
    public String getRules(){
        return this.rules;
    }
    public void setRules(String rules){
        this.rules = rules;
    }
    public String getSpherename(){
        return this.spherename;
    }
    public void setSpherename(String spherename){
        this.spherename = spherename;
    }
    public String getUpgrade(){
        return this.upgrade;
    }
    public void setUpgrade(String upgrade){
        this.upgrade = upgrade;
    }

    @Override
    public String toString()
    {
        return "IncantationDO{" +
                "artist='" + artist + '\'' +
                ", aspect=" + aspect +
                ", assistantdev=" + assistantdev +
                ", backflavor='" + backflavor + '\'' +
                ", broadcastbar='" + broadcastbar + '\'' +
                ", cardcreator='" + cardcreator + '\'' +
                ", cardname=" + cardname +
                ", castphraseEN='" + castphraseEN + '\'' +
                ", castphraseST='" + castphraseST + '\'' +
                ", coreeffect='" + coreeffect + '\'' +
                ", empowerments=" + empowerments +
                ", fluency='" + fluency + '\'' +
                ", frontflavor='" + frontflavor + '\'' +
                ", harmonyCost='" + harmonyCost + '\'' +
                ", internalid='" + internalid + '\'' +
                ", needHandsign='" + needHandsign + '\'' +
                ", printid='" + printid + '\'' +
                ", rarity='" + rarity + '\'' +
                ", require='" + require + '\'' +
                ", resonanceCost='" + resonanceCost + '\'' +
                ", rules='" + rules + '\'' +
                ", spherename='" + spherename + '\'' +
                ", upgrade='" + upgrade + '\'' +
                ", ritualPaths=" + ritualPaths +
                '}';
    }
}
