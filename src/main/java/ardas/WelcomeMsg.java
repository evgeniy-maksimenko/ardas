package ardas;


import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Locale;

public class WelcomeMsg implements Welcome{

    final static Logger logger = Logger.getLogger(WelcomeMsg.class);


    int HOUR;
    int AM_PM;
    final int AM = 0;
    final int PM = 1;
    String[] ArrayTextDef = 
            new String[] {"Good night, World!", "Good morning, World!", "Good day, World!", "Good evening, World!"};
    String[] ArrayTextRU  = 
            new String[] {"Доброй ночи, МИР!", "Доброе утро, МИР!", "Добрый день, МИР!", "Добрый вечер, МИР!"};
    String tagRu  = "ru_RU";
    String tagDef = "en_EN";
    String local;


    // =================================================================================================================
    
    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    public int getHOUR() {
        return HOUR;
    }

    public void setHOUR(int HOUR) {
        this.HOUR = HOUR;
    }

    public int getAM_PM() {
        return AM_PM;
    }

    public void setAM_PM(int AM_PM) {
        this.AM_PM = AM_PM;
    }

    // =================================================================================================================
    
    
    public WelcomeMsg(){
        setLocal(Locale.getDefault().toString());
    }

    public WelcomeMsg(String init){
        init();
    }
    
    // =================================================================================================================

    @Override
    public void init() {
        setLocal(Locale.getDefault().toString());
        
        Calendar calendar = Calendar.getInstance();
        setHOUR(calendar.get(Calendar.HOUR));
        setAM_PM(calendar.get(Calendar.AM_PM));
    }

    @Override
    public String getMsg(){
        String result = "";
        
        if(getHOUR() < 0 || getHOUR() > 12) {
            throw new IllegalArgumentException();
        }

        if(getAM_PM() < 0 || getAM_PM() > 1) {
            throw new IllegalArgumentException();
        }

        if(getHOUR() >= 0 && getHOUR() < 6 && getAM_PM() == AM) {
            return getLocalTxt()[0];
        }

        if(getHOUR() >= 6 && getHOUR() < 9 && getAM_PM() == AM) {
            return getLocalTxt()[1];
        }

        if(getHOUR() >= 9 && getHOUR() <= 12 && getAM_PM() == AM) {
            return getLocalTxt()[2];
        }

        if(getHOUR() >= 0 && getHOUR() < 7 && getAM_PM() == PM) {
            return getLocalTxt()[2];
        }

        if(getHOUR() >= 7 && getHOUR() < 11 && getAM_PM() == PM) {
            return getLocalTxt()[3];
        }

        if(getHOUR() >= 11 && getHOUR() <= 12 && getAM_PM() == PM) {
            return getLocalTxt()[0];
        }

        return result;
    }
    
    @Override
    public String[] getLocalTxt() {
        return local.equals(tagRu) ? ArrayTextRU : ArrayTextDef;
    }

    @Override
    public void display(){
        String msg = getMsg();
        System.out.println(msg);
        logger.debug(msg);
    } 
    
}
