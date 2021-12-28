package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Person {

    private final String name;
    private final Calendar birthdate;
    private final long millisPerYear =(long) (1000*60*60*24*365.25);
            
    public Person(String name, Calendar birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }

    public Calendar getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        Calendar fechaHoy = GregorianCalendar.getInstance();
        return (int)(milliSecondsToYear(fechaHoy.getTimeInMillis() -
                birthdate.getTimeInMillis()));
    }

    private long milliSecondsToYear (long miles) {
        return miles / millisPerYear;
    }
}
