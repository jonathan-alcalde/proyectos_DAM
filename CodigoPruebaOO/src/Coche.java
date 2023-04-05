
public class Coche 
{
	// Atributos de la clase coche.
	private String matricula;
	private String marca;
	private String modelo;
	private double potenciaKW;
	private int numeroPasajeros;
	private double peso;
	private boolean averiado;
	private String DNIPropietario;
	private char segmento;
	private String color;
	
	// Constructores de la clase; vacio y completo parametrizado.
	// Vacio
	public Coche()
	{
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.potenciaKW = 0;
		this.numeroPasajeros = 0;
		this.peso = 0;
		this.averiado = false;
		this.DNIPropietario = "";
		this.segmento = ' ';
		this.color = "";
	}
	
	// Completo parametrizado
	public Coche(String paramMatricula, String paramMarca, String paramModelo, double paramPotenciaKW, int paramNumeroPasajeros, 
			double paramPeso, boolean paramAveriado, String paramDNIPropietario, char paramSegmento, String paramColor)
	{
		this.matricula = paramMatricula;
		this.marca = paramMarca;
		this.modelo = paramModelo;
		this.potenciaKW = paramPotenciaKW;
		this.numeroPasajeros = paramNumeroPasajeros;
		this.peso = paramPeso;
		this.averiado = paramAveriado;
		this.DNIPropietario = paramDNIPropietario;
		this.segmento = paramSegmento;
		this.color = paramColor;
	}
	
	// Gets & Sets

	//Matrícula
	public String getMatricula()
	{
		return this.matricula;
	}
	
	public void setMatricula(String paramMatricula)
	{
		this.matricula = paramMatricula;
	}
	
	//Marca
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setMarca(String paramMarca)
	{
		this.marca = paramMarca;
	}
	
	//Modelo
	public String getModelo()
	{
		return this.modelo;
	}
	
	public void setModelo(String paramModelo)
	{
		this.modelo = paramModelo;
	}
	
	//PotenciaKW
	public double getPotenciaKW()
	{
		return this.potenciaKW;
	}
	
	public void setPotenciaKW(double paramPotenciaKW)
	{
		this.potenciaKW = paramPotenciaKW;
	}
	
	//NumeroPasajeros
	public int getNumeroPasajeros()
	{
		return this.numeroPasajeros;
	}
	
	public void setNumeroPasajeros(int paramNumeroPasajeros)
	{
		this.numeroPasajeros = paramNumeroPasajeros;
	}

	//Peso
	public double getPeso()
	{
		return this.peso;
	}
	
	public void setPeso(double paramPeso)
	{
		this.peso = paramPeso;
	}
	
	//Averiado
	public boolean getAveriado()
	{
		return this.averiado;
	}
	
	public void setAveriado(boolean paramAveriado)
	{
		this.averiado = paramAveriado;
	}
	
	//DNIPropietario
	public String getDNIPropietario()
	{
		return this.DNIPropietario;
	}
	
	public void setDNIPropietario(String paramDNIPropietario)
	{
		this.DNIPropietario = paramDNIPropietario;
	}
	
	//Segmento
	public char getSegmento()
	{
		return this.segmento;
	}
	
	public void setSegmento(char paramSegmento)
	{
		this.segmento = paramSegmento;
	}
	
	//DNIPropietario
	public String getColor()
	{
		return this.color;
	} 
	
	public void setColor(String paramColor)
	{
		this.color = paramColor;
	}
	

	
	//
	// Metodos libre funcionalidad
	public String metodoPrueba(String paramFrase)
	{
		return paramFrase;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
