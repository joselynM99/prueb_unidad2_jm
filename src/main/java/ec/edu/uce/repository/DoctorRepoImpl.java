package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarDoctor(Doctor cita) {
		this.entityManager.persist(cita);
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
