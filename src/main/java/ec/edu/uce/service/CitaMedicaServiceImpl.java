package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.repository.ICitaMedicaRepo;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService{
	
	@Autowired
	ICitaMedicaRepo citaRepo;

	@Override
	public void insertarCitaMedica(CitaMedica cita) {
		this.citaRepo.insertarCitaMedica(cita);
	}

	@Override
	public CitaMedica buscarCitaMedica(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarCitaMedica(CitaMedica cita) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarCitaMedica(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
