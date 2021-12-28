package kata1;

import java.time.LocalDate;
/** 
 * @author Marcos del Cristo Díaz Gil
 * Asignatura: Ingeniería del Software 2
 * Universidad de Las Palmas de Gran Canaria
 */
public class Kata1 {
//Para la versión 3 se usará la clase LocalDate
    public static void main(String[] args) {
        // Datos para una persona cualquiera nacida un 31 de julio de 1992
        LocalDate fecha = LocalDate.of(1992, 07, 31);
        // Hay múltiples formatos para introducir fecha (se pueden pasar como Strings)
        Person p = new Person ("Marcos", fecha); 
        System.out.println(p.getName() + " tiene " + p.getAge(LocalDate.now()) + " años");

    }
    
}
