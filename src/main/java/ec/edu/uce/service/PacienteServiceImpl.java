package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.PacienteSencillo;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepo pacienteRepo;

	@Override
	public void insertarPaciente(Paciente cita) {
		this.pacienteRepo.insertarPaciente(cita);
	}

	@Override
	public Paciente buscarPaciente(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarPaciente(Paciente cita) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarPaciente(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<PacienteSencillo> buscarPorFechaGenero(LocalDateTime fecha, String genero) {
		
		return this.pacienteRepo.buscarPorFechaGenero(fecha, genero);
	}

}
