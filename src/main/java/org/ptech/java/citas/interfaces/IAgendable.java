package org.ptech.java.citas.interfaces;

import java.time.LocalDateTime;

import org.ptech.java.citas.entities.Consultorio;

public interface IAgendable {
    //proponer un metodo para agendar una cita
    public boolean agenarCita(LocalDateTime fecha, Consultorio c);

    //proponer un metodo para reagendar cita 

    public boolean reAgendarCita(LocalDateTime nuevaFecha, Consultorio nuevoc);
    // cancelar una cita
    public boolean cancelarCita();

}
