package desarrolladora;

public class Distribuidoras {
	String idDistribuidora;
	String nombre;
	int nEmpleados;
	String [] juegosPublicados;
	String direccion;
	String provincia;
	String pais;
	int telefono;
	String correoElectronico;
	
	//Constructor vacio
		public Distribuidoras()
		{
			this.idDistribuidora = "";
			this.nombre = "";
			this.nEmpleados = 0;
			this.juegosPublicados = new String[] {""};
			this.direccion = "";
			this.provincia = "";
			this.pais = "";
			this.telefono = 0;
			this.correoElectronico = "";
		}
		//Completo parametrizado
		public void Distribuidora(String paramIdDistribuidora,String paramNombre , int paramNEmpleados,
			String paramJuegosPublicados, String paramDireccion, String paramProvicia, String paramProvincia,
		String paramPais, int paramTelefono , String paramCorreoElectronico)
		{
			this.idDistribuidora =  paramIdDistribuidora;
			this.nombre = paramNombre;
			this.nEmpleados = paramNEmpleados;
			this.juegosPublicados = new String[] {paramJuegosPublicados};
			this.direccion = paramDireccion;
			this.provincia = paramProvicia;
			this.pais = paramPais;
			this.telefono = paramTelefono;
			this.correoElectronico = paramCorreoElectronico;
		}
		
	public String getIdDistribuidora() 
	{
		return idDistribuidora;
	}
	public void setIdPublicadora(String paramIdDistribuidora) 
	{
		this.idDistribuidora = paramIdDistribuidora;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String paramNombre) {
		this.nombre = paramNombre;
	}
	public int getnEmpleados() {
		return nEmpleados;
	}
	public void setnEmpleados(int paramEmpleados) {
		this.nEmpleados = paramEmpleados;
	}
	public String[] getJuegosPublicados() {
		return juegosPublicados;
	}
	public void setJuegosPublicados(String paramJuegosPublicados) {
		this.juegosPublicados = paramJuegosPublicados;
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
	public String obtenerIdentificacionDistribuidora()
	{
		return idDistribuidora + " " + nombre;
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
	public void setIdDistribuidora(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
