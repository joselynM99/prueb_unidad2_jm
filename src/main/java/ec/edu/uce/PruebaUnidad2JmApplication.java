package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.IGestorCita;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2JmApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(PruebaUnidad2JmApplication.class);

	@Autowired
	private IPacienteService pacienteService;

	@Autowired
	private IDoctorService doctorServie;
	
	@AutoConfigureOrder
	private IGestorCita gestor;

	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2JmApplication.class, args);
	}

	public void run(String... args) throws Exception {

		LocalDateTime fecha1 = LocalDateTime.of(1999, Month.DECEMBER, 8, 10, 30);
		LocalDateTime fecha2 = LocalDateTime.of(1977, Month.DECEMBER, 8, 10, 30);
		LocalDateTime fecha3 = LocalDateTime.of(2022, Month.DECEMBER, 8, 10, 30);

		Paciente p1 = new Paciente();
		p1.setApellido("Moncayo");
		p1.setCedula("1750958874");
		p1.setCodigoSeguro("58949B");
		p1.setNombre("Joss");
		p1.setEstatura(155.30);
		p1.setGenero("Femenino");
		p1.setPeso(55.5);
		p1.setFachaNacimiento(fecha1);

		this.pacienteService.insertarPaciente(p1);

		Paciente p2 = new Paciente();
		p2.setApellido("Moncayo");
		p2.setCedula("17509985874");
		p2.setCodigoSeguro("58949CF");
		p2.setNombre("Jorge");
		p2.setEstatura(170.30);
		p2.setGenero("Masculino");
		p2.setPeso(80.5);
		p2.setFachaNacimiento(fecha2);

		this.pacienteService.insertarPaciente(p2);

		Doctor d1 = new Doctor();
		d1.setNombre("PAtricia");
		d1.setCedula("1784556666");
		d1.setApellido("Hernandez");
		d1.setCodigoSenecyt("854666adas");
		d1.setNumConsultorio("17B");
		d1.setGenero("Femenino");
		d1.setFecha(fecha1);

		Doctor d2 = new Doctor();
		d2.setNombre("PAtricia");
		d2.setCedula("1784556666");
		d2.setApellido("Hernandez");
		d2.setCodigoSenecyt("854666adas");
		d2.setNumConsultorio("17B");
		d2.setGenero("Femenino");
		d2.setFecha(fecha1);

		CitaMedica cita1 = new CitaMedica();

		cita1.setFechaCita(fecha3);
		cita1.setLugarCita("El Dorado");
		cita1.setNumeroCita("125N");
		cita1.setValorCita(new BigDecimal(25.0));
		
		//this.gestor.buscarPorFechaGenero(fecha3, "Masculino");
		

	}

}
