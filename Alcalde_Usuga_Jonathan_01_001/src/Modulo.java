
public class Modulo {
	String iD;
	String nombre;
	int curso;
	boolean secundaria;
	boolean bachillerato;
	boolean fp;
	
	//Constructor vacío
	public Modulo()
	{
		this.iD = "";
		this.nombre = "";
		this.curso = 0;
		this.secundaria = false;
		this.bachillerato = false;
		this.fp = false;
	}
	//Constructor completo parametrizado
	public Modulo(String paramID, String paramNombre, int paramCurso,
			boolean paramSecundaria, boolean paramBachillerato, boolean paramFp)
	{
		this.iD = paramID;
		this.nombre = paramNombre;
		this.curso = paramCurso;
		this.secundaria = paramSecundaria;
		this.bachillerato = paramBachillerato;
		this.fp = paramFp;
	}
	
	//ObtenerID
	public String getiD() {
		return iD;
	}

	public void setiD(String paramID) {
		this.iD = paramID;
	}
	
	//ObtenerNombre
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String paramNombre) {
		this.nombre = paramNombre;
	}
	//ObtenerCurso
	public int getCurso() {
		return curso;
	}

	public void setCurso(int paramCurso) {
		this.curso = paramCurso;
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
	//Método obtenerIdentficaciónCompleta
	public String getIdentificacionCompleta(){
		return iD + " " + nombre + " " + curso; //Devuelve un String con el id,nombre,curso
	}
	
}
