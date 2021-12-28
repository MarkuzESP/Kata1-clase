package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;



/** 
 * @author Marcos del Cristo Díaz Gil
 * Asignatura: Ingeniería del Software 2
 * Universidad de Las Palmas de Gran Canaria
 */
public class Kata1 {


    public static void main(String[] args) {
        Calendar fecha; 
        fecha = GregorianCalendar.getInstance();
        fecha.set(1992, 7, 31);
        // Datos para una persona cualquiera nacida un 31 de julio de 1992
        Person p = new Person ("Marcos", fecha); 
        System.out.println(p.getName() + " tiene " + p.getAge() + " años");
        // Utilizar Calendar resuelve varias limitaciones del formato Date

    }
    
}
