package tienda;

public class teclado {
 //Atributos de la clase Teclado
	private String nomTec;
	private String marca;
	private String tipoConexion;
	private double longitudCable;
	private int altura;
	private int anchura;
	private int profundidad;
	private int peso;
	private double precio;
	
	public teclado()
	{
	this.nomTec ="";
	this.marca="";
	this.tipoConexion="";
	this.longitudCable=0;
	this.altura=0;
	this.anchura=0;
	this.profundidad=0;
	this.peso=0;
	this.precio=0;
	}
	
	public teclado(String paramNomTec, String paramMarca, String paramTipoConexion, double paramLongitudCable,
			int paramAltura, int paramAnchura, int paramProfundidad, int paramPeso, double paramPrecio)
	{
		this.nomTec = paramNomTec;
		this.marca=paramMarca;
		this.tipoConexion=paramTipoConexion;
		this.longitudCable=paramLongitudCable;
		this.altura=paramAltura;
		this.anchura=paramAnchura;
		this.profundidad=paramProfundidad;
		this.peso=paramPeso;
		this.precio=paramPrecio;
	}
	
	//Nombre Teclado
	public String getNomTec()
	{
		return this.nomTec;
	}
	
	public void setNomTec(String paramNomTec)
	{
		this.nomTec = paramNomTec;
	}
	
	//Nombre Marca
	public String getMarca()
	{
		return this.marca;
	}
	
	public void setMarca(String paramMarca)
	{
		this.marca = paramMarca;
	}
	
	//Tipo de Conexion
	public String getTipoConexion()
	{
		return this.tipoConexion;
	}
	
	public void setTipoConexion(String paramTipoConexion)
	{
		this.tipoConexion = paramTipoConexion;
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
	
	//Profundidad
	public int getProfundidad()
	{
		return this.profundidad;
	}
	
	public void setProfundidad(int paramProfundidad)
	{
		this.profundidad = paramProfundidad;
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
