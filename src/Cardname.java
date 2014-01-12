

import java.util.List;

 class Cardname{

    private int id;

   	private String format;

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
