

import java.util.Collection;
import java.util.List;

/**
 * Created by bobweekend on 1/3/14.
 */

public class IncantationDO
{

    private String printid;
    private String artist;
    private String backflavor;
    private String broadcastbar;
    private String cardcreator;
    private String castphraseEN;
    private String castphraseST;
    private String coreeffect;
    private String fluency;
    private String frontflavor;
    private String harmonyCost;
    private String internalid;
    private String needHandsign;
    private String rarity;
    private String require;
    private String resonanceCost;
    private String rules;
    private String spherename;
    private String upgrade;

    private Aspect aspect;
    private Cardname cardname;
    private RitualPaths ritualPaths;
    private List<String> assistantdev;
    private List<NameValue> empowerments;

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
    public void setAssistantdev(List<String> assistantdev)
    {
        this.assistantdev = assistantdev;
        // set the dbstring version of this for presistance.
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
    public List<NameValue> getEmpowerments(){
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
