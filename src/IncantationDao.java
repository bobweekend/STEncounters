import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;

/**
 * Created by bobweekend on 1/11/14.
 */
public class IncantationDao
{
    private ConnectionSource connectionSource;
    private Dao<IncantationDODB, String> incDao;



    public ConnectionSource getConnectionSource()
    {
        return connectionSource;
    }

    public Dao<IncantationDODB, String> getIncDao()
    {
        return incDao;
    }


    public IncantationDao(ConnectionSource connectionSource) throws SQLException
    {
        this.connectionSource = connectionSource;
        incDao = DaoManager.createDao(connectionSource, IncantationDODB.class);

    }

    public void createIfNotExist() throws SQLException
    {
        TableUtils.createTableIfNotExists(connectionSource, IncantationDODB.class);
    }

    public IncantationDODB getIncantationDO(int cardNumber) throws SQLException
    {
        IncantationDODB retVal = null;
        retVal = incDao.queryForId(""+cardNumber);
        return retVal;
    }


}
