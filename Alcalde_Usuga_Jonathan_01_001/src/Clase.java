
public class Clase {
	String iD;
	int curso;
	char letra;
	int numeroAlumnos;
	boolean secundaria;
	boolean bachillerato;
	boolean fp;
	
	//constructor vacío
	public 	void clase()
	{
		this.iD = " ";
		this.curso =  0;
		this.letra = ' ';
		this.numeroAlumnos = 0;
		this.secundaria = false;
		this.bachillerato = false;
		this.fp = false;
	}
	
	//Constructor completo parametrizado

	
public Clase(String paramID, int paramCurso, char paramLetra,int paramNumeroAlumnos,
		 boolean paramSecundaria, boolean paramBachillerato, boolean paramFp) {
	this.iD = paramID;
	this.curso =  paramCurso;
	this.letra = paramLetra;
	this.numeroAlumnos = paramNumeroAlumnos;
	this.secundaria = paramSecundaria;
	this.bachillerato = paramBachillerato;
	this.fp = paramFp;
	}

	//Getters y setters
	//obtenerID
	public String getiD() {
		return iD;
	}

	public void setiD(String paramID) {
		this.iD = paramID;
	}
	
	//ObtenerCUrso
	public int getCurso() {
		return curso;
	}

	public void setCurso(int paramCurso) {
		this.curso = paramCurso;
	}
	
	//ObtenerLetra
	public char getLetra() {
		return letra;
	}

	public void setLetra(char paramLetra) {
		this.letra = paramLetra;
	}
	
	//ObtenerNumeroAlumnos
	public int getNumeroAlumnos() {
		return numeroAlumnos;
	}

	public void setNumeroAlumnos(int paramNumeroAlumnos) {
		this.numeroAlumnos = paramNumeroAlumnos;
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
	
	//obtenerNombreClaseCompleto
	public String obtenerNombreClaseCompleto()
	{
		return curso + " " + letra; //Devuelve un String con el curso y la letra.
	}

	
}
