package desarrolladora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Desarrolladora {
	String idDesarrolladora;
	String nombre;
	int empleados;
	String fechadeCreacion;
	String [] videojuegos;
	String idPublicadora;
	String direccion;
	String provincia;
	String pais;
	int telefono;
	String correoElectronico;
	
	//Constructor vacío
	public Desarrolladora() {
		this.idDesarrolladora = "";
		this.nombre = " ";
		this.empleados = 0;
		this.fechadeCreacion = " ";
		this.videojuegos = new String[] {""} ;
		this.idPublicadora = " ";
		this.direccion = " ";
		this.provincia =" " ;
		this.pais = " ";
		this.telefono = 0;
		this.correoElectronico = " ";
	}
	
	//ConstructorCompletoParametrizado
	public Desarrolladora(String paramIdDesarrolladora , String paramNombre, int paramEmpleados,
		String paramFechadeCreacion, String paramVideojuegos, String paramIdPublicadora, String paramDireccion,
		String paramProvincia, String paramPais, int paramTelefono, String paramCorreoElectronico) {
			this.idDesarrolladora = paramIdDesarrolladora;
			this.nombre = paramNombre;
			this.empleados = paramEmpleados;
			this.fechadeCreacion = paramFechadeCreacion;
			this.videojuegos = new String[] {paramVideojuegos} ;
			this.idPublicadora = paramIdPublicadora;
			this.direccion = paramDireccion;
			this.provincia = paramProvincia;
			this.pais = paramPais;
			this.telefono = paramTelefono;
			this.correoElectronico = paramCorreoElectronico;
	}
	
	public String getIdDesarrolladora() {
		return idDesarrolladora;
	}
	public void setIdDesarrolladora(String paramIdDesarrolladora) {
		this.idDesarrolladora = paramIdDesarrolladora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String paramNombre) {
		this.nombre = paramNombre;
	}
	public int getEmpleados() {
		return empleados;
	}
	public void setEmpleados(int paramEmpleados) {
		this.empleados = paramEmpleados;
	}
	public String getFechadeCreacion() {
		return fechadeCreacion;
	}
	public void setFechadeCreacion(String paramFechadeCreacion) {
		this.fechadeCreacion = paramFechadeCreacion;
	}
	public String[] getVideojuegos() {
		return videojuegos;
	}
	public void setVideojuegos(String paramVideojuegos) {
		this.videojuegos = new String [] {paramVideojuegos};
	}
	public String getIdPublicadora() {
		return idPublicadora;
	}
	public void setIdPublicadora(String paramIdPublicadora) {
		this.idPublicadora = paramIdPublicadora;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String paramDireccion) {
		this.direccion = paramDireccion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String paramProvincia) {
		this.provincia = paramProvincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String paramPais) {
		this.pais = paramPais;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int paramTelefono) {
		this.telefono = paramTelefono;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String paramCorreoElectronico) {
		this.correoElectronico = paramCorreoElectronico;
	}
	
	//obtenerIdentificacion
	public String obtenerIdentificacionDesarrolladora()
	{
		return idDesarrolladora + " " + nombre;
	}
	
	//obtenerDireccion
	public String obtenerDireccionCompleta()
	{
		return direccion + "," + provincia  + "," + pais;
	}
	
	//ObtenerContacto
	public String obtenerContacto()
	{
		return correoElectronico + " " + telefono;
	}
	
	//AñosDesarrolladora
	public int getAnhosDesarrolladora()
	{
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechaNac = LocalDate.parse(fechadeCreacion, fmt);

		LocalDate ahora = LocalDate.now();

		 

		Period periodo = Period.between(fechaNac, ahora);
		return periodo.getYears();
	}
	
	
	
}
