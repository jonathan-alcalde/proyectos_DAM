package tienda;

public class clientes {
//Atributos de la clase cliente
	private String DNIcliente;
	private String nombreUsuario;
	private String nombre;
	private String apellidos;
	private String correoElectronico;
	private String fechan;
	
	// Constructores de la clase; vacio y completo parametrizado.
	// Vacio
	public clientes()
	{
		this.DNIcliente = "";
		this.nombreUsuario = "";
		this.nombre = "";
		this.apellidos = "";
		this.correoElectronico = "";
		this.fechan = "";
	}
	
	// Completo parametrizado
	public clientes(String paramDNIcliente, String paramNombreUsuario, String paramNombre, String paramApellidos, 
			String paramCorreoElectronico, String paramFechan)
	{
		this.DNIcliente = paramDNIcliente;
		this.nombreUsuario = paramNombreUsuario;
		this.nombre = paramNombre;
		this.apellidos = paramApellidos;
		this.correoElectronico = paramCorreoElectronico;
		this.fechan = paramFechan;
	}
	
	// Gets & Sets

	//DNIcliente
	public String getDNIcliente()
	{
		return this.DNIcliente;
	}
	
	public void setDNIcliente(String paramDNIcliente)
	{
		this.DNIcliente = paramDNIcliente;
	}

	//nombreUsuario
	public String getNombreUsuario()
	{
		return this.nombreUsuario;
	}
	
	public void setNombreUsuario(String paramNombreUsuario)
	{
		this.nombreUsuario = paramNombreUsuario;
	}
	
	//nombre
	public String getNombre()
	{
		return this.nombre;
	}
	
	public void setNombre(String paramNombre)
	{
		this.nombre = paramNombre;
	}
	
	//apellidos
	public String getApellidos()
	{
		return this.apellidos;
	}
	
	public void setApellidos(String paramApellidos)
	{
		this.apellidos = paramApellidos;
	}
	
	//Correo Electrónico
	public String getCorreoElectronico()
	{
		return this.correoElectronico;
	}
	
	public void setCorreoElectronico(String paramCorreoElectronico)
	{
		this.correoElectronico = paramCorreoElectronico;
	}
	
	//fechan
	public String getFechan()
	{
		return this.fechan;
	}
	
	public void setFechan(String paramFechan)
	{
		this.fechan = paramFechan;
	}
}
