package ec.edu.uce.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.PacienteSencillo;

@Service
public class GestorCitaImpl implements IGestorCita {

	@Autowired
	private ICitaMedicaService citaService;

	@Autowired
	private IPacienteService pacService;

	@Override
	public void insertarNuevaCita(CitaMedica cita) {
		this.citaService.insertarCitaMedica(cita);

	}

	@Override
	public void actualizacioCitaMedica(CitaMedica cita) {
		this.citaService.insertarCitaMedica(cita);

	}

	@Override
	public List<PacienteSencillo> buscarPorFechaGenero(LocalDateTime fecha, String genero) {

		return this.pacService.buscarPorFechaGenero(fecha, genero);
	}

}
