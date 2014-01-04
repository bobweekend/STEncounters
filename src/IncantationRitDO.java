import java.util.List;

/**
 * Created by bobweekend on 1/3/14.
 */
public class IncantationRitDO extends  IncantationBaseDO
{
    private RitualPaths ritualPaths;

    public RitualPaths getRitualPaths(){
        return this.ritualPaths;
    }
    public void setRitualPaths(RitualPaths ritualPaths){
        this.ritualPaths = ritualPaths;
    }

}
