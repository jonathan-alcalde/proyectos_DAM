package tienda;

public class moviles {
 //atributos de la clase moviles
	private String marca;
	private String SO;
	private String procesador;
	private int anchoPantalla;
	private int largoPantalla;
	private String tipoSIM;
	private int numCamaras;
	private boolean wifi;
	private boolean bluethoot;
	private String vBluethoot;
	private boolean nfc;
	private String tipoUSB;
	private boolean lectorDeHuella;
	private boolean reconocimientoFacial;
	private int mAh;
	private double precio;
	
	public moviles()
	{
		this.marca = "";
		this.SO = "";
		this.procesador = "";
		this.anchoPantalla = 0;
		this.largoPantalla = 0;
		this.tipoSIM = "";
		this.numCamaras = 0;

		this.wifi = false;
		this.bluethoot = false;
		this.vBluethoot = "";
		this.nfc = false;
		this.tipoUSB = "";
		this.lectorDeHuella = false;
		this.reconocimientoFacial = false;
		this.mAh = 0;
		this.precio = 0;
	}
	public moviles(String paramMarca,String paramSO,String paramProcesador,int paramAnchoPantalla,int paramLargoPantalla,String paramTipoSIM,int paramNumCamaras,
boolean paramWifi,boolean paramBluethoot,String paramVBluethoot,boolean paramNfc,String paramTipoUSB,boolean paramLectorDeHuella,boolean paramReconocimientoFacial,int paramMAh,double paramPrecio )
	{
		this.marca = paramMarca;
		this.SO = paramSO;
		this.procesador = paramProcesador;
		this.anchoPantalla = paramAnchoPantalla;
		this.largoPantalla = paramLargoPantalla;
		this.tipoSIM = paramTipoSIM;
		this.numCamaras = paramNumCamaras;
		this.wifi = paramWifi;
		this.bluethoot = paramBluethoot;
		this.vBluethoot = paramVBluethoot;
		this.nfc =  paramNfc;
		this.tipoUSB = paramTipoUSB;
		this.lectorDeHuella = paramLectorDeHuella;
		this.reconocimientoFacial = paramReconocimientoFacial;
		this.mAh = paramMAh;
		this.precio = paramPrecio;
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
	
	//Sistema Operativo
	public String getSO()
	{
		return this.SO;
	}
	
	public void setSO(String paramSO)
	{
		this.SO = paramSO;
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
	
	//AnchoPantalla
	public int getAnchoPantalla()
	{
		return this.anchoPantalla;
	}
	
	public void setAncho(int paramAnchoPantalla)
	{
		this.anchoPantalla = paramAnchoPantalla;
	}
	
	//LargoPantalla
	public int getLargoPantalla()
	{
		return this.largoPantalla;
	}
	
	public void setLargoPantalla(int paramLargoPantalla)
	{
		this.largoPantalla = paramLargoPantalla;
	}
	
	//Tipo SIM
	public String getTipoSIM()
	{
		return this.tipoSIM;
	}
	
	public void setTipoSIM(String paramTipoSIM)
	{
		this.tipoSIM = paramTipoSIM;
	}
	
	//Nombre numero de camaras
	public int getNumCamaras()
	{
		return this.numCamaras;
	}
	
	public void setNumCamaras(int paramNumCamaras)
	{
		this.numCamaras = paramNumCamaras;
	}
	
	
	
	
	
	
	
}
