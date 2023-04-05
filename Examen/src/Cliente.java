
public class Cliente {
	String DNI;
	String nombre;
	String apellido1;
	String apellido2;
	String fechaNacimiento;
	String ciudadNacimiento;
	int telefono;
	
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String DNI) {
		this.DNI = DNI;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido1()
	{
		return apellido1;
	}
	
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	
	public String getApellido2()
	{
		return apellido2;
	}
	public void setApellido2(String apellido2)
	{
		this.apellido2 = apellido2;
	}
	
	public String getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(String fechaNacimiento)
	{
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public String getCiudadNacimiento()
	{
		return ciudadNacimiento;
	}
	
	public void setCiudadNacimiento(String ciudadNacimiento)
	{
		this.ciudadNacimiento = ciudadNacimiento;
	}
	
	public int getTelefono()
	{
		return telefono;
	}
	
	public void setTelefono(int telefono)
	{
		this.telefono = telefono;
	}
	
}
