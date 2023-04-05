import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Alumno {
	String dNI;
	String nombre;
	String fechaNacimiento;
	int numeroMatricula;
	int telefono;
	

	//constructor vacio
	public Alumno()
	{
		this.dNI = "";
		this.nombre = "";
		this.fechaNacimiento = "";
		this.numeroMatricula = 0;
		this.telefono = 0;
	}
	//constructor completo parametrizado
	public Alumno(String paramDNI, String paramNombre, String paramFechaNacimiento,
			int paramNumeroMatricula, int paramTelefono)
	{
		this.dNI = paramDNI;
		this.nombre = paramNombre;
		this.fechaNacimiento = paramFechaNacimiento;
		this.numeroMatricula = paramNumeroMatricula;
		this.telefono = paramTelefono;
	}
	//Getter y Setters
	//ObtenerDNI
	public String getDNI()
	{
		return this.dNI;
	}
	public void setDNI(String paramDNI)
	{
		this.dNI = paramDNI;
	}
	//ObtenerNombre
	public String getNombre()
	{
		return this.nombre;
	}
	public void setNombre(String paramNombre)
	{
		this.nombre = paramNombre;
	}
	//ObtenerNumeroMatricula
	public int getNumeroMatricula()
	{
		return this.numeroMatricula;
	}
	public void setNumeroMatricula(int paramNumeroMatricula)
	{
		this.numeroMatricula  = paramNumeroMatricula;
	}
	
	//ObtenerTelefono
	public int getTelefono()
	{
		return this.telefono;
	}
	public void setTelefono(int paramTelefono)
	{
		this.telefono  = paramTelefono;
	}
	
	//ObtenerFechaNacimiento
	public String getFechaNacimiento()
	{
		return this.fechaNacimiento;
	}
	public void setFechaNacimiento(String paramFechaNacimiento)
	{
		this.fechaNacimiento  = paramFechaNacimiento;
	}
	//ObtenerEdad
	public int getEdad()
	{
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechaNac = LocalDate.parse(fechaNacimiento, fmt);

		LocalDate ahora = LocalDate.now();

		 

		Period periodo = Period.between(fechaNac, ahora);
		return periodo.getYears();
	}
	

	

	

	
	

	
}
