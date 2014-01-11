import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;

import java.util.Collection;
import java.util.List;
@DatabaseTable(tableName ="aspect")
   public class Aspect{

    public Aspect()
    {
    }

    @DatabaseField(generatedId = true)
    private int id;
    @ForeignCollectionField(eager = false)
    private Collection<NameValue> boost;
    @ForeignCollectionField(eager = false)
    private Collection<NameValue> desc;
    @ForeignCollectionField(eager = false)
    private Collection<NameValue> effect;

 	public Collection getBoost(){
		return this.boost;
	}
	public void setBoost(List boost){
		this.boost = boost;
	}
 	public Collection getDesc(){
		return this.desc;
	}
	public void setDesc(List desc){
		this.desc = desc;
	}
 	public Collection getEffect(){
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
