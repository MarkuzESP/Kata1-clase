package kata1;

import java.time.LocalDate;
import java.time.Period;
// A diferencia de las versiones anteriores que se importaba de .util,
// aquí se importa de .time

// Se usará LocalDate para el mismo ejercicio que el realizado anteriormente.

public class Person {

    private final String name;
    private final LocalDate birthdate;

            
    public Person(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }
    
    public String getName() {
        return name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }
    
    public int getAge(LocalDate fecha){
        // La idea es comparar entre la fecha actual y la fecha inicial del individuo
        // Al tomar los años se consigue el entero deseado.
        Period tiempo= Period.between(birthdate, fecha);
        return tiempo.getYears();
    }

}
