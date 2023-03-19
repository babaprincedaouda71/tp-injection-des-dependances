package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.concurrent.DelayQueue;

@Service
public class MetierImpl implements IMetier {
    private IDao dao ;

    public MetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        Date date = dao.getDate();
        double res = 21 * 0.12;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
