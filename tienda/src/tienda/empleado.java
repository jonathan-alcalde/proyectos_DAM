package tienda;

public class empleado {
//atributos del objeto empleado
	private String DNIEmpleado;
	private String nomEmpleado;
	private String apeEmpleado;
	private int numEmpleado;
	private double salarioEmpleado;
	private String tipoContrato;
	private int antiguedad;
	private String fechan;
	
	// Constructores de la clase; vacio y completo parametrizado.
	// Vacio
	public empleado()
	{
		this.DNIEmpleado = "";
		this.nomEmpleado = "";
		this.apeEmpleado = "";
		this.numEmpleado = 0;
		this.salarioEmpleado = 0;
		this.tipoContrato = "";
		this.antiguedad = -99;
		this.fechan = "";
	}
	
	// Completo parametrizado
	public empleado(String paramDNIEmpleado, String paramNomEmpleado, String paramApeEmpleado, int paramNumEmpleado, 
			int paramSalarioEmpleado, String paramTipoContrato, int paramAntiguedad , String paramFechan)
	{
		this.DNIEmpleado = paramDNIEmpleado;
		this.nomEmpleado = paramNomEmpleado;
		this.apeEmpleado = paramApeEmpleado;
		this.numEmpleado = paramNumEmpleado;
		this.salarioEmpleado = paramSalarioEmpleado;
		this.tipoContrato = paramTipoContrato;
		this.antiguedad = paramAntiguedad;
		this.fechan = paramFechan;
	}
	
	//Gets & Sets
	//DNIEmpleado
	public String getDNIEmpleado()
	{
		return this.DNIEmpleado;
	}
	
	public void setDNIEmpleado(String paramDNIEmpleado)
	{
		this.DNIEmpleado = paramDNIEmpleado;
	}
	
	//Nombre de Empleado
	public String getNomEmpleado()
	{
		return this.nomEmpleado;
	}
	
	public void setNomEmpleado(String paramNomEmpleado)
	{
		this.fechan = paramNomEmpleado;
	}
	
	//Apellidos del Empleado
	public String getApeEmpleado()
	{
		return this.apeEmpleado;
	}
	
	public void setApeEmpleado(String paramApeEmpleado)
	{
		this.apeEmpleado = paramApeEmpleado;
	}
	
	//NumEmpleado
	public int getNumEmpleado()
	{
		return this.numEmpleado;
	}
	
	public void setNumEmpleado(int paramNumEmpleado)
	{
		this.numEmpleado = paramNumEmpleado;
	}
	
	//salario empleado
	public double getSalarioEmpleado()
	{
		return this.salarioEmpleado;
	}
	
	public void setSalarioEmpleado(double paramSalarioEmpleado)
	{
		this.salarioEmpleado = paramSalarioEmpleado;
	}
	
	//TipoContrato
	public String getTipoContrato()
	{
		return this.tipoContrato;
	}
	
	public void setTipoContrato(String paramTipoContrato)
	{
		this.tipoContrato = paramTipoContrato;
	}
	
	//antiguedad
	public int getAntiguedad()
	{
		return this.antiguedad;
	}
	
	public void setAntiguedad(int paramAntiguedad)
	{
		this.antiguedad = paramAntiguedad;
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
