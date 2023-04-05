
public class Leon extends Carnívoro{
	int nDientes;
	int nEjemplares;
	String alimentoPreferido;
	
	public Leon ()
	{
		this.nDientes = 0;
		this.nEjemplares = 0;
		this.alimentoPreferido = ("");
	}
	
	
	public Leon (int nDientes, int nEjemplares , String alimentoPreferido)
	{
		this.nDientes = nDientes;
		this.nEjemplares = nEjemplares;
		this.alimentoPreferido = alimentoPreferido;
	}
	
	public int getNDientes() {
		return nDientes;
	}
	public void setNDientes(int nDientes)
	{
		this.nDientes = nDientes;
	}
	
	public int getNEjemplares() {
		return nEjemplares;
	}
	public void setNEjemplares(int nEjemplares)
	{
		this.nEjemplares = nEjemplares;
	}
	public String getalimentoPreferido()
	{
		return alimentoPreferido;
	}
	public void setAlimentoPreferido(String alimentoPreferido)
	{
		this.alimentoPreferido = alimentoPreferido;
	}
	
	
	public void leonFunciona() {
		System.out.println("Clase Leon Funciona");
	}
}
