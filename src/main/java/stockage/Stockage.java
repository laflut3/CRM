package stockage;

import com.sun.jdi.connect.spi.Connection;
import stockage.sql.SQLUtils;

import java.util.List;

public abstract class Stockage<T> {

    public Connection connection(){
        SQLUtils utils = SQLUtils.getInstance();
        Connection connection = (Connection) utils.getConnection();
        return connection;
    }

    public abstract void create(T element);

    public abstract void update(T element);

    public abstract void deleteById(int id);

    public abstract T getById(int id);

    public abstract List<T> getAll();
}
