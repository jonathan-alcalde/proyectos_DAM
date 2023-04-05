package tienda;

public class monitor {
	//Atributos de la clase monitor
	private String nomMonitor;
	private double diagonal;
	private String relAspecto;
	private String formaPantalla;
	private int tiempoRespuesta;
	private String tipoPantalla;
	private String resolucion;
	private int numHDMI;
	private int numDVI;
	private int numVGA;
	
	//vacio
	public monitor()
	{
		nomMonitor = "";
		diagonal = 0;
		relAspecto = "";
		formaPantalla = "";
		tiempoRespuesta = 0;
		tipoPantalla = "";
		resolucion = "";
		numHDMI = 0;
		numDVI = 0;
		numVGA = 0;
	}
	//Constructor completo parametrizado
	public monitor(String paramNomMonitor, double paramDiagonal, String paramRelAspecto,
			String paramFormaPantalla, int paramTiempoRespuesta, String paramTipoPantalla,
			String paramResolucion , int paramNumHDMI, int paramNumDVI, int paramNumVGA)
	{
		this.nomMonitor = paramNomMonitor;
		this.diagonal = paramDiagonal;
		this.relAspecto = paramRelAspecto;
		this.formaPantalla = paramFormaPantalla;
		this.tiempoRespuesta = paramTiempoRespuesta;
		this.tipoPantalla = paramTipoPantalla;
		this.resolucion = paramResolucion;
		this.numHDMI = paramNumHDMI;
		this.numDVI = paramNumDVI;
		this.numVGA = paramNumVGA;
	}
	//Nombre Monitor
	public String getNomMonitor()
	{
		return this.nomMonitor;
	}
	
	public void setNomMonitor(String paramNomMonitor)
	{
		this.nomMonitor = paramNomMonitor;
	}
	
	//Nombre Diagonal
	public double getDiagonal()
	{
		return this.diagonal;
	}
	
	public void setDiagonal(double paramDiagonal)
	{
		this.diagonal = paramDiagonal;
	}
	
	//Rel Aspecto
	public String getRelAspecto()
	{
		return this.relAspecto;
	}
	
	public void setRelAspecto(String paramRelAspecto)
	{
		this.relAspecto = paramRelAspecto;
	}
	
	//Forma Pantalla
	public String getFormaPantalla()
	{
		return this.formaPantalla;
	}
	
	public void setFormaPantalla(String paramFormaPantalla)
	{
		this.formaPantalla = paramFormaPantalla;
	}
	
	//Tiempo Respuesta
	public int getTiempoRespuesta()
	{
		return this.tiempoRespuesta;
	}
	
	public void setTiempoRespuesta(int paramTiempoRespuesta)
	{
		this.tiempoRespuesta = paramTiempoRespuesta;
	}
	
	//tipo Pantalla
	public String getTipoPantalla()
	{
		return this.tipoPantalla;
	}
	
	public void setTipoPantalla(String paramTipoPantalla)
	{
		this.tipoPantalla = paramTipoPantalla;
	}
	
	//Resolucion
	public String getResolucion()
	{
		return this.resolucion;
	}
	
	public void setResolucion(String paramResolucion)
	{
		this.resolucion = paramResolucion;
	}
	
	//numHDMI
	public int getNumHDMI()
	{
		return this.numHDMI;
	}
	
	public void setNumHDMI(int paramNumHDMI)
	{
		this.numHDMI = paramNumHDMI;
	}
	
	//numDVI
	public int getNumDVI()
	{
		return this.numDVI;
	}
	
	public void setNumDVI(int paramNumDVI)
	{
		this.numDVI = paramNumDVI;
	}
	
	//numVGA
	public int getNumVGA()
	{
		return this.numVGA;
	}
	
	public void setNumVGA(int paramNumVGA)
	{
		this.numVGA = paramNumVGA;
	}
}
