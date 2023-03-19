package dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public class DaoImpl implements IDao {
    @Override
    public Date getDate() {
        Date date = new Date();
        return date;
    }
}
