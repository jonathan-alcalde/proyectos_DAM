package tienda;

public class grafica {
	//Atributos de la clase Gráfica
	private String nomGrafica;
	private double frecuencia;
	private String tipoMemoria;
	private int capacidad;
	private String salidas;
	private double precio;
	
	// Constructores de la clase; vacio y completo parametrizado.
	// Vacio
	public grafica()
	{
		this.nomGrafica = "";
		this.frecuencia = 0;
		this.tipoMemoria = "";
		this.capacidad = 0;
		this.salidas = "";
		this.precio = 0;
	}
	
	// Completo parametrizado
	public grafica(String paramNomGrafica, double paramFrecuencia, String paramTipoMemoria, int paramCapacidad, 
			String paramSalidas, double paramPrecio)
	{
		this.nomGrafica = paramNomGrafica;
		this.frecuencia = paramFrecuencia;
		this.tipoMemoria = paramTipoMemoria;
		this.capacidad = paramCapacidad;
		this.salidas = paramSalidas;
		this.precio = paramPrecio;
	}
	
	//Gets & sets
	//nomGrafica
	public String getNomGrafica()
	{
		return this.nomGrafica;
	}
	
	public void setNomGrafica(String paramNomGrafica)
	{
		this.nomGrafica = paramNomGrafica;
	}
	
	//frecuencia
	public double getFrecuencia()
	{
		return this.frecuencia;
	}
	
	public void setFrecuencia(double paramFrecuencia)
	{
		this.frecuencia = paramFrecuencia;
	}
	
	//Tipo Memoria
	public String getTipoMemoria()
	{
		return this.tipoMemoria;
	}
	
	public void setTipoMemoria(String paramTipoMemoria)
	{
		this.tipoMemoria = paramTipoMemoria;
	}
	
	//Capacidad
	public int getCapacidad()
	{
		return this.capacidad;
	}
	
	public void setCapacidad(int paramCapacidad)
	{
		this.capacidad = paramCapacidad;
	}
	
	//Salidas
	public String getSalidas()
	{
		return this.salidas;
	}
	
	public void setSalidas(String paramSalidas)
	{
		this.salidas = paramSalidas;
	}
	
	//Precio
	public double getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(double paramPrecio)
	{
		this.precio = paramPrecio;
	}
}
