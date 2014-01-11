import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;


import java.util.List;
@DatabaseTable(tableName ="namevalue")
public class NameValue
{
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(useGetSet = true)
   	private String name;
    @DatabaseField(useGetSet = true)
   	private String value;

    public NameValue()
    {
    }

    public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}
 	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    @Override
    public String toString()
    {
        return "NameValue{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
