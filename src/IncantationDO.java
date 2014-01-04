
import java.util.List;

public class IncantationDO extends IncantationBaseDO{
   	private List<NameValue> ritualPaths;

 	public List<NameValue> getRitualPaths()
    {
		return this.ritualPaths;
	}
	public void setRitualPaths(List<NameValue> ritualPaths){
		this.ritualPaths = ritualPaths;
	}

    @Override
    public String toString()
    {
        return  super.toString() + "IncantationDO{" +
                "ritualPaths=" + ritualPaths +
                '}';
    }
}
