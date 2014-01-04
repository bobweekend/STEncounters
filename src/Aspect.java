

import java.util.List;

public class Aspect{
   	private List<NameValue> boost;
   	private List<NameValue> desc;
   	private List<NameValue> effect;

 	public List getBoost(){
		return this.boost;
	}
	public void setBoost(List boost){
		this.boost = boost;
	}
 	public List getDesc(){
		return this.desc;
	}
	public void setDesc(List desc){
		this.desc = desc;
	}
 	public List getEffect(){
		return this.effect;
	}
	public void setEffect(List effect){
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
