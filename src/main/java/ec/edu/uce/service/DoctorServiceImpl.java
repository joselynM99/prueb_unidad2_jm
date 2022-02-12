package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.repository.IDoctorRepo;

@Service
public class DoctorServiceImpl implements IDoctorService{
	
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public void insertarDoctor(Doctor cita) {
		this.doctorRepo.insertarDoctor(cita);
	}

	@Override
	public Doctor buscarDoctor(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizarDoctor(Doctor cita) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarDoctor(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
