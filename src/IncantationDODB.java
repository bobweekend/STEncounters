
import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by bobweekend on 1/3/14.
 */


@DatabaseTable(tableName = "incantation")
public class IncantationDODB
{
    public void IncantationDODB()
    {

    }

    @DatabaseField(id = true)
    private String printid;
    @DatabaseField
    private Date lastUpdate;
    @DatabaseField(dataType = DataType.LONG_STRING)
    private String flat;

    public Date getLastUpdate()
    {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate)
    {
        this.lastUpdate = lastUpdate;
    }

    public String getPrintid()
    {
        return printid;
    }

    public void setPrintid(String printid)
    {
        this.printid = printid;
    }

    public String getFlat()
    {
        return flat;
    }

    public void setFlat(String flat)
    {
        this.flat = flat;
    }
}
