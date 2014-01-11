import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;


import java.util.List;
@DatabaseTable(tableName ="cardname")
 class Cardname{
    @DatabaseField(generatedId = true)
    private int id;
    @DatabaseField(useGetSet = true)
   	private String format;
    @DatabaseField(useGetSet = true)
   	private String value;

    Cardname()
    {
    }

    public String getFormat(){
		return this.format;
	}
	public void setFormat(String format){
		this.format = format;
	}
 	public String getValue(){
		return this.value;
	}
	public void setValue(String value){
		this.value = value;
	}

    @Override
    public String toString()
    {
        return "Cardname{" +
                "format='" + format + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
