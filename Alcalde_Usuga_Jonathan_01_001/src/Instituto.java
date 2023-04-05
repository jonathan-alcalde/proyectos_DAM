
public class Instituto {
	String iD;
	String nombre;
	int capacidad;
	int numeroAlumno;
	String localidad;
	String calleNumero;
	boolean secundaria;
	boolean bachillerato;
	boolean fp;
	
	//Constructor vacío
	public Instituto()
	{
		this.iD = "00000000A";
		this.nombre = " ";
		this.capacidad = 0;
		this.numeroAlumno = 0;
		this.localidad = " ";
		this.calleNumero = " ";
		this.secundaria = false;
		this.bachillerato = false;
		this.fp = false;
	}
	
	//Constructor completo parametrizado
	public Instituto(String paramID, String paramNombre, int paramCapacidad,
		int paramNumeroAlumno, String paramLocalidad, String paramCalleNumero,
		boolean paramSecundaria, boolean paramBachillerato, boolean paramFp)
	{
		this.iD = paramID;
		this.nombre = paramNombre;
		this.capacidad = paramCapacidad;
		this.numeroAlumno = paramNumeroAlumno;
		this.localidad = paramLocalidad;
		this.calleNumero = paramCalleNumero;
		this.secundaria = paramSecundaria;
		this.bachillerato = paramBachillerato;
		this.fp = paramFp;
	}
	//Getters y setters
	//ObtenerID
	public String getID()
	{
		return this.iD;
	}
	
	public void setID(String paramID)
	{
		iD = paramID; 
	}
	//ObtenerNombre
	public String getNombre()
	{
		return this.iD;
	}
	
	public void setNombre(String paramNombre)
	{
		this.nombre = paramNombre;
	}
	//ObtenerCapacidadMaxima
	public int getCapacidadMaxima()
	{
		return this.capacidad;
	}
	public void setCapacidadMaxima(int paramCapacidad)
	{
		this.capacidad = paramCapacidad;
	}
	//obtenerCapacidadActual
	public int getCapacidadActual()
	{
		return this.numeroAlumno;
	}
	public void setCapacidadActual(int paramNumeroAlumno)
	{
		this.numeroAlumno = paramNumeroAlumno;
	}
	//ObtenerCalleNumero
	public String getCalleNumero()
	{
		return this.calleNumero;
	}
	public void setCalleNumero(String paramCalleNumero)
	{
		this.calleNumero = paramCalleNumero;
	}
	
	///obtenerLocalidad
	public String getLocalidad()
	{
		return this.localidad;
	}
	public void setLocalidad(String paramLocalidad)
	{
		this.localidad = paramLocalidad;
	}
	
	//esSecundaria
	public boolean isSecundaria() {
		return secundaria;
	}

	public void setSecundaria(boolean paramSecundaria) {
		this.secundaria = paramSecundaria;
	}
	
	//esBachillerato
	public boolean isBachillerato() {
		return bachillerato;
	}

	public void setBachillerato(boolean paramBachillerato) {
		this.bachillerato = paramBachillerato;
	}
	//esFP
	public boolean isFp() {
		return fp;
	}

	public void setFp(boolean paramFp) {
		this.fp = paramFp;
	}
	
	///método Obtener DirecciónCompleta
	public String ListarDireccionCompleta()
	{
		return localidad + "," +calleNumero; //Devuelve un String con localidad  y calle/numero
	}
	
	
	
	
	
	
}
