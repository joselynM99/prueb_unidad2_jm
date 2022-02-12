package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;


@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPaciente(Paciente cita) {
		this.entityManager.persist(cita);
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

}
