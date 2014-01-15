

import java.util.List;

   public class Aspect{

    public Aspect()
    {
    }

    private List<NameValue> boost;
    private List<NameValue> desc;
    private List<NameValue> effect;

 	public List getBoost(){
		return this.boost;
	}
	public void setBoost(List<NameValue> boost){
		this.boost = boost;
	}
 	public List getDesc(){
		return this.desc;
	}
	public void setDesc(List<NameValue> desc){
		this.desc = desc;
	}
 	public List getEffect(){
		return this.effect;
	}
	public void setEffect(List<NameValue> effect){
		this.effect = effect;
	}

    @Override
    public String toString()
    {
        return "Aspect{" +
                "boost=" + boost +
                ", desc=" + desc +
                ", effect=" + effect +
                '}';
    }
}
