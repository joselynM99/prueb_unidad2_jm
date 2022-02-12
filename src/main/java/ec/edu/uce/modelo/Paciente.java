package ec.edu.uce.modelo;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "paciente")
public class Paciente {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pacienteP")
	@SequenceGenerator(name = "seq_pacienteP", sequenceName = "seq_pacienteP", allocationSize = 1)
	@Column(name = "paci_id")
	private Integer id;

	@Column(name = "paci_cedula")
	private String cedula;

	@Column(name = "paci_nombre")
	private String nombre;

	@Column(name = "paci_apellido")
	private String apellido;

	@Column(name = "paci_facha_nacimiento")
	private LocalDateTime fachaNacimiento;

	@Column(name = "paci_codigo_seguro")
	private String codigoSeguro;

	@Column(name = "paci_estatura")
	private Double estatura;

	@Column(name = "paci_peso")
	private Double peso;

	@Column(name = "paci_genero")
	private String genero;
	
	@OneToMany(mappedBy = "paciente", cascade = CascadeType.ALL) // sale del atributo de DetalleFactura
	private List<CitaMedica> citaMedica;

	// metodos set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDateTime getFachaNacimiento() {
		return fachaNacimiento;
	}

	public void setFachaNacimiento(LocalDateTime fachaNacimiento) {
		this.fachaNacimiento = fachaNacimiento;
	}

	public String getCodigoSeguro() {
		return codigoSeguro;
	}

	public void setCodigoSeguro(String codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}

	public Double getEstatura() {
		return estatura;
	}

	public void setEstatura(Double estatura) {
		this.estatura = estatura;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<CitaMedica> getCitaMedica() {
		return citaMedica;
	}

	public void setCitaMedica(List<CitaMedica> citaMedica) {
		this.citaMedica = citaMedica;
	}

	@Override
	public String toString() {
		return "Paciente [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", fachaNacimiento=" + fachaNacimiento + ", codigoSeguro=" + codigoSeguro + ", estatura=" + estatura
				+ ", peso=" + peso + ", genero=" + genero + ", citaMedica=" + citaMedica + "]";
	}
	
	

}
