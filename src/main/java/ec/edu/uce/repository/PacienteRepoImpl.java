package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.PacienteSencillo;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPaciente(Paciente cita) {
		this.entityManager.persist(cita);
	}

	@Override
	public List<PacienteSencillo> buscarPorFechaGenero(LocalDateTime fecha, String genero) {

		TypedQuery<PacienteSencillo> myQuery = this.entityManager.createQuery(
				"SELECT NEW ec.edu.uce.modelo.PacienteSencillo(p.cedula, p.nombre, p.genero, p.fecha_nacimiento) FROM Paciente p p.fecha <=: fecha AND p.genero =: genero",
				PacienteSencillo.class);

		myQuery.setParameter("fecha", fecha);
		myQuery.setParameter("genero", genero);

		return myQuery.getResultList();

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
