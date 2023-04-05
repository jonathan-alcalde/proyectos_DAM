package paises;

public class pais {
	String nombre;
	String capital;
	double PIB;
	int prefijoTlfn;
	String DominioInternet;
	double IDH;
	double superficieTerreno;
	String gentilicio;
	
	public pais() {
		this.nombre = " ";
		this.capital = " ";
		this.PIB = 0;
		this.prefijoTlfn = 0;
		this.DominioInternet = " ";
		this.IDH = 0;
		this.superficieTerreno = 0;
		this.gentilicio = " ";
	}
	public pais(String paramNombre, String paramCapital, double paramPIB, String paramDominioInternet, int paramPrefijoTlfn,
			double paramIDH, double paramSuperficieTerreno, String paramGentilicio) {
		this.nombre = paramNombre;
		this.capital = paramCapital;
		this.PIB = paramPIB;
		this.DominioInternet = paramDominioInternet;
		this.prefijoTlfn = paramPrefijoTlfn;
		this.IDH = paramIDH;
		this.superficieTerreno = paramSuperficieTerreno;
		this.gentilicio = paramGentilicio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public double getPIB() {
		return PIB;
	}
	public void setPIB(double pIB) {
		PIB = pIB;
	}
	public int getPrefijoTlfn() {
		return prefijoTlfn;
	}
	public void setPrefijoTlfn(int prefijoTlfn) {
		this.prefijoTlfn = prefijoTlfn;
	}
	public String getDominioInternet() {
		return DominioInternet;
	}
	public void setDominioInternet(String dominioInternet) {
		DominioInternet = dominioInternet;
	}
	public double getIDH() {
		return IDH;
	}
	public void setIDH(double iDH) {
		IDH = iDH;
	}
	public double getSuperficieTerreno() {
		return superficieTerreno;
	}
	public void setSuperficieTerreno(double superficieTerreno) {
		this.superficieTerreno = superficieTerreno;
	}
	public String getGentilicio() {
		return gentilicio;
	}
	public void setGentilicio(String gentilicio) {
		this.gentilicio = gentilicio;
	}
	
	static void mostrarInformacion(pais paramPais) {
		System.out.println("Nombre:" + paramPais.nombre);
		System.out.println("Capital:" + paramPais.capital);
		System.out.println("PIB:" + paramPais.PIB);
		System.out.println("Prefijo Telefónico:" + paramPais.prefijoTlfn);
		System.out.println("Dominio de Internet:" + paramPais.DominioInternet);
		System.out.println("Índice de Desarrollo Humano:" + paramPais.IDH);
		System.out.println("Superficio:" + paramPais.superficieTerreno + "km2");
		System.out.println("Gentilicio:" + paramPais.gentilicio);
	}
}

