package tienda;

public class ratones {
 //Atributos del objeto ratones
	private String nomRaton;
	private int altura;
	private int anchura;
	private int peso;
	private double longitudCable;
	private int dpi;
	private double precio;
	private String procesador;
	
	public ratones()
	{
		this.nomRaton = "";
		this.altura = 0;
		this.anchura = 0;
		this.peso = 0;
		this.longitudCable = 0;
		this.dpi = 0;
		this.precio = 0;
		this.procesador ="";
	}
	public ratones (String paramNomRaton, int paramAltura, int paramAnchura, int paramPeso, double paramLongitudCable, int paramDpi, int paramPrecio, String paramProcesador)
	{
		this.nomRaton = paramNomRaton;
		this.altura = paramAnchura;
		this.anchura = paramPeso;
		this.peso = paramPeso;
		this.longitudCable = paramLongitudCable;
		this.dpi = paramDpi;
		this.precio = paramPrecio;
		this.procesador = paramProcesador;
	}
	
	//Nombre del Ratón
	public String getNomRaton()
	{
		return this.nomRaton;
	}
	
	public void setNomRaton(String paramNomRaton)
	{
		this.nomRaton = paramNomRaton;
	}
	
	//Altura
	public int getAltura()
	{
		return this.altura;
	}
	
	public void setAltura(int paramAltura)
	{
		this.altura = paramAltura;
	}
	
	//Anchura
	public int getAnchura()
	{
		return this.anchura;
	}
	
	public void setAnchura(int paramAnchura)
	{
		this.anchura = paramAnchura;
	}
	
	//Peso
	public int getPeso()
	{
		return this.peso;
	}
	
	public void setPeso(int paramPeso)
	{
		this.peso = paramPeso;
	}
	
	//Longitud Cable
	public double getLongitudCable()
	{
		return this.longitudCable;
	}
	
	public void setLongitudCable(double paramLongitudCable)
	{
		this.longitudCable = paramLongitudCable;
	}
	
	//Dpi
	public int getDpi()
	{
		return this.dpi;
	}
	
	public void setDpi(int paramDpi)
	{
		this.dpi = paramDpi;
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
	
	//Procesador
	public String getProcesador()
	{
		return this.procesador;
	}
	
	public void setProcesador(String paramProcesador)
	{
		this.procesador = paramProcesador;
	}
	
}
