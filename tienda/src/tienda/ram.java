package tienda;

public class ram {
	//Atributos de la clase RAM
	private String nomRAM;
	private double frecuencia;
	private int latencia;
	private double voltaje;
	private int temperaturaFuncionamiento;
	private double precio;
	
	// Constructores de la clase; vacio y completo parametrizado.
	// Vacio
	public ram()
	{
		this.nomRAM = "";
		this.frecuencia = 0;
		this.latencia = 0;
		this.voltaje = 0;
		this.temperaturaFuncionamiento = 0;
		this.precio = 0;
	}
	
	// Completo parametrizado
	public ram(String paramNomRAM, double paramFrecuencia, int paramLatencia, double paramVoltaje, 
			int paramTemperaturaFuncionamiento, double paramPrecio)
	{
		this.nomRAM = paramNomRAM;
		this.frecuencia = paramFrecuencia;
		this.latencia = paramLatencia;
		this.voltaje = paramVoltaje;
		this.temperaturaFuncionamiento = paramTemperaturaFuncionamiento;
		this.precio = paramPrecio;
	}
	//Get & Set
	//Nombre RAM
	public String getNomRAM()
	{
		return this.nomRAM;
	}
	
	public void setNomRAM(String paramNomRAM)
	{
		this.nomRAM = paramNomRAM;
	}
	
	//Frecuencia
	public double getFrecuencia()
	{
		return this.frecuencia;
	}
	
	public void setFrecuencia(double paramFrecuencia)
	{
		this.frecuencia = paramFrecuencia;
	}
	
	//Latencia
	public int getLatencia()
	{
		return this.latencia;
	}
	
	public void setLatencia(int paramLatencia)
	{
		this.latencia = paramLatencia;
	}
	
	//Voltaje
	public double getVoltaje()
	{
		return this.voltaje;
	}
	
	public void setVoltaje(double paramVoltaje)
	{
		this.voltaje = paramVoltaje;
	}
	
	//Temperatura de funcionamiento
	public int getTemperaturaFuncionamiento()
	{
		return this.temperaturaFuncionamiento;
	}
	
	public void setTemperaturaFuncionamiento(int paramTemperaturaFuncionamiento)
	{
		this.temperaturaFuncionamiento = paramTemperaturaFuncionamiento;
	}
	
	//precio
	public double getPrecio()
	{
		return this.precio;
	}
	
	public void setPrecio(double paramPrecio)
	{
		this.precio = paramPrecio;
	}
}
