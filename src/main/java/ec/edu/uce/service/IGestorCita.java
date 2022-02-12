package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.PacienteSencillo;

public interface IGestorCita {
	
	void insertarNuevaCita(CitaMedica cita);
	
	void actualizacioCitaMedica(CitaMedica cita);
	
	List<PacienteSencillo> buscarPorFechaGenero(LocalDateTime fecha, String genero);

}
