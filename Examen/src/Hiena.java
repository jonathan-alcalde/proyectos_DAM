
public class Hiena extends Carnívoro {
	int nDientes;
	int nEjemplares;
	String alimentoPreferido;
	
	public Hiena()
	{
		nDientes = 0;
		nEjemplares = 0;
		alimentoPreferido = ("");
	}
	public Hiena(int nDientes,int nEjemplares, String alimentoPreferido)
	{
		this.nDientes = nDientes;
		this.nEjemplares = nEjemplares;
		this.alimentoPreferido = alimentoPreferido;
	}
	public int getnDientes() {
		return nDientes;
	}
	public void setnDientes(int nDientes) {
		this.nDientes = nDientes;
	}
	public int getnEjemplares() {
		return nEjemplares;
	}
	public void setnEjemplares(int nEjemplares) {
		this.nEjemplares = nEjemplares;
	}
	public String getAlimentoPreferido() {
		return alimentoPreferido;
	}
	public void setAlimentoPreferido(String alimentoPreferido) {
		this.alimentoPreferido = alimentoPreferido;
	}
	
	public void hienaFunciona()
	{
		System.out.println("Clase Hiena Funciona");
	}
}
