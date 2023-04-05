package tienda;

public class placaBase {
//Atributos de la clase Placa BAse
	private String nomPlacaBase;
	private int ancho;
	private int profundidad;
	private String socket;
	private String tipoRAM;
	private int maxRAM;
	private boolean ethernet;
	private boolean wifi;
	private int numM2;
	private int numPCIE1;
	private int numPCIE16;
	private int numPCI;
	private String tipoBIOS;
	private boolean jumper;
	private String factorForma;
	private String chipset;
	private double precio;
	
	//Constructor Vacío
	public placaBase()
	{
		this.nomPlacaBase = "";
		this.ancho = 0;
		this.profundidad = 0;
		this.socket = "";
		this.tipoRAM = "";
		this.maxRAM = 0;
		this.ethernet = false;
		this.wifi = false;
		this.numM2 = 0;
		this.numPCIE1 = 0;
		this.numPCIE16 = 0;
		this.numPCI = 0;
		this.tipoBIOS = "";
		this.jumper = false;
		this.factorForma = "";
		this.chipset = "";
		this.precio = 0;
	}
	
	//Constructor completo parametrizado
	public placaBase(String paramNomPlacaBase, int paramAncho, int paramProfundidad, String paramSocket, String paramTipoRAM, int paramMaxRAM,
			boolean paramEthernet, boolean paramWifi, int paramNumM2, int paramNumPCIE1, int paramNumPCIE16, int paramPCI, String paramTipoBIOS, boolean paramJumper,
			String paramFactorForma, String paramChipset, double paramPrecio)
	{
		this.nomPlacaBase = paramNomPlacaBase;
		this.ancho = paramAncho;
		this.profundidad = paramProfundidad;
		this.socket = paramSocket;
		this.tipoRAM = paramTipoRAM;
		this.maxRAM = paramMaxRAM;
		this.ethernet = paramEthernet;
		this.wifi = paramWifi;
		this.numM2 = paramNumM2;
		this.numPCIE1 = paramNumPCIE1;
		this.numPCIE16 = paramNumPCIE16;
		this.numPCI = paramPCI;
		this.tipoBIOS =paramTipoBIOS;
		this.jumper = paramJumper;
		this.factorForma = paramFactorForma;
		this.chipset = paramChipset;
		this.precio = paramPrecio;
	}
	
	//Nombre de la Placa Base
	public String getNomPlacaBase()
	{
		return this.nomPlacaBase;
	}
	
	public void setNomPlacaBase(String paramNomPlacaBase)
	{
		this.nomPlacaBase = paramNomPlacaBase;
	}
	
	//Ancho
	public int getAncho()
	{
		return this.ancho;
	}
	
	public void setAncho(int paramAncho)
	{
		this.ancho = paramAncho;
	}
	
	//Profundidad
	public int getProfundidad()
	{
		return this.profundidad;
	}
	
	public void setProfundidad(int paramProfundidad)
	{
		this.ancho = paramProfundidad;
	}
	
	//Socket
	public String getSocket()
	{
		return this.socket;
	}
	
	public void setSocket(String paramSocket)
	{
		this.socket = paramSocket;
	}
	
	//Tipo de RAM
	public String getTipoRAM()
	{
		return this.tipoRAM;
	}
	
	public void setTipoRAM(String paramTipoRAM)
	{
		this.tipoRAM = paramTipoRAM;
	}
	
	//MaxRAM
	public int getMaxRAM()
	{
		return this.maxRAM;
	}
	
	public void setMaxRAM(int paramMaxRAM)
	{
		this.maxRAM = paramMaxRAM;
	}
	
	//Ethernet
	public boolean getEthernet()
	{
		return this.ethernet;
	}
	
	public void setEthernet(boolean paramEthernet)
	{
		this.ethernet= paramEthernet;
	}
	
	//Wifi
	public boolean getWifi()
	{
		return this.wifi;
	}
	
	public void setWifi(boolean paramWifi)
	{
		this.wifi= paramWifi;
	}
	
	//numM2
	public int getNumM2()
	{
		return this.numM2;
	}
	
	public void setNumM2(int paramNumM2)
	{
		this.numM2 = paramNumM2;
	}
	
	//numPCIE1
	public int getNumPCIE1()
	{
		return this.numPCIE1;
	}
	
	public void setNumPCIE1(int paramNumPCIE1)
	{
		this.numPCIE1 = paramNumPCIE1;
	}
	
	//numPCIE16
	public int getNumPCIE16()
	{
		return this.numPCIE16;
	}
	
	public void setNumPCIE16(int paramNumPCIE16)
	{
		this.numPCIE16 = paramNumPCIE16;
	}
	
	//numPCI
	public int getNumPCI()
	{
		return this.numPCI;
	}
	
	public void setNumPCI(int paramNumPCI)
	{
		this.numPCI = paramNumPCI;
	}
	
	//Tipo Bios
	public String getTipoBIOS()
	{
		return this.tipoBIOS;
	}
	
	public void setTipoBIOS(String paramTipoBIOS)
	{
		this.tipoBIOS = paramTipoBIOS;
	}
	
	//Jumper
	public boolean getJumper()
	{
		return this.jumper;
	}
	
	public void setJumper(boolean paramJumper)
	{
		this.jumper= paramJumper;
	}
	
	//Factor de forma
	public String getFactorForma()
	{
		return this.factorForma;
	}
	
	public void setFactorForma(String paramFactorForma)
	{
		this.factorForma= paramFactorForma;
	}
	
	//Chipset
	public String getChipset()
	{
		return this.chipset;
	}
	
	public void setChipset(String paramChipset)
	{
		this.chipset = paramChipset;
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
