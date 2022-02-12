package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CitaMedica;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCitaMedica(CitaMedica cita) {
		this.entityManager.persist(cita);		
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
