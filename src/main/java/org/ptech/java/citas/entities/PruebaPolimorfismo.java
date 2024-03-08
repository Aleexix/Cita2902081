package org.ptech.java.citas.entities;

import java.time.LocalDate;

import org.ptech.java.citas.entities.enums.Especialidad;
import org.ptech.java.citas.entities.enums.TipoDocumento;
import org.ptech.java.citas.entities.enums.TipoSangre;

public class PruebaPolimorfismo {

    public static void main(String[] args) {
        //Intanciar un usuario
        Usuario u = new Medico(111, "Erick",   "Tatan", TipoDocumento.CC, 13244233635L, 578909L, Especialidad.CARDIOLOGIA);
        System.out.println( u.toString());

        Paciente p = new Paciente(121, "Alex", "Orostegui", TipoDocumento.CC, 563465476476L,"ufyutdytc@gmail.com", 455254636543L, LocalDate.now(), 1.72, 45.0, TipoSangre.A, '+');
        System.out.println(p.toString());

        Enfermero e = new Enfermero(1213, "johanzu", "ronaldo", TipoDocumento.CC, 36465L );
        e.addProcedure("Inyectar");
        System.out.println(e.toString());

        Consultorio c = new Consultorio(12, "Calle 127 c 95 a 77", 87586578);
        System.out.println(c.toString());

        

      
    }

}
