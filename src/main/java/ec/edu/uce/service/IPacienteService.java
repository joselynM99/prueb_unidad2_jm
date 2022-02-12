package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.PacienteSencillo;

public interface IPacienteService {
	
	void insertarPaciente(Paciente cita); // C

	Paciente buscarPaciente(Integer id); // R

	void actualizarPaciente(Paciente cita); // U

	void eliminarPaciente(Integer id); // D
	
	List<PacienteSencillo> buscarPorFechaGenero(LocalDateTime fecha, String genero);


}
