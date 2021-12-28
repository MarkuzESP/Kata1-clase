package kata1;

import java.util.Date;

/** 
 * @author Marcos del Cristo Díaz Gil
 * Asignatura: Ingeniería del Software 2
 * Universidad de Las Palmas de Gran Canaria
 */
public class Kata1 {


    public static void main(String[] args) {
        // Datos para una persona cualquiera nacida un 31 de julio de 1992
        Person p = new Person ("Marcos", new Date(92, 6, 31)); 
        System.out.println(p.getName() + " tiene " + p.getAge() + " aÃ±os");
        
        /**
         * Date es una clase obsoleta que suma 1900 al año introducido. 
         * Sólo funciona con aÃ±os desde 1900 hasta 1999.
         * Años fuera de ese rango presentan información incoherente.
         */
    }
    
}
