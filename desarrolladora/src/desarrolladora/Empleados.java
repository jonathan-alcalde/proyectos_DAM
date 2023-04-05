package desarrolladora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleados {
	int DNI;
	String nombre;
	String fechan;
	double salario;
	String grupo;
	String idDesarrolladora;
	String diaContratado;
	String finContrato;
	boolean español;
	boolean ingles;
	boolean otroIdioma;
	String [] lenguajesProgram;
	int telefono;
	String correoElectronico;
	
	
	public Empleados(){
		this.DNI = 0;
		this.nombre= "";
		this.fechan = "";
		this.salario = 0;
		this.grupo = "";
		this.idDesarrolladora = "";
		this.diaContratado = "00/00/00";
		this.finContrato= "00/00/00";
		this.español = false;
		this.ingles = false;
		this.otroIdioma = false;
		this.lenguajesProgram = new String[] {""};
		this.telefono = 0;
		this.correoElectronico = "";
	}
	
	public Empleados(int paramDNI, String paramNombre, String paramFechan, int paramSalario, String paramGrupo, 
			String paramIdDesarrolladora, String paramDiaContratado, String paramFinContrato,
			boolean paramEspañol, boolean paramIngles, boolean paramOtroIdioma,
			String paramLenguajesProgram, int paramTelefono, String paramCorreoElectronico) { 
		this.DNI = paramDNI;
		this.nombre= paramNombre;
		this.fechan = paramFechan;
		this.salario = paramSalario;
		this.grupo = paramGrupo;
		this.idDesarrolladora = paramIdDesarrolladora;
		this.diaContratado = paramDiaContratado;
		this.finContrato = paramFinContrato;
		this.español = paramEspañol;
		this.ingles = paramIngles;
		this.otroIdioma = paramOtroIdioma;
		this.lenguajesProgram = new String[] {paramLenguajesProgram};
		this.telefono = paramTelefono;
		this.correoElectronico = paramCorreoElectronico;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int paramDNI) {
		DNI = paramDNI;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String paramNombre) {
		this.nombre = paramNombre;
	}

	public String getFechan() {
		return fechan;
	}

	public void setFechan(String paramFechan) {
		this.fechan = paramFechan;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double paramSalario) {
		this.salario = paramSalario;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String paramGrupo) {
		this.grupo = paramGrupo;
	}

	public String getIdDesarrolladora() {
		return idDesarrolladora;
	}

	public void setIdDesarrolladora(String paramIdDesarrolladora) {
		this.idDesarrolladora = paramIdDesarrolladora;
	}
	
	public String getDiaContratado() {
		return this.diaContratado;
	}
	
	public void setDiaContratado(String paramDiaContratado) {
		this.diaContratado = paramDiaContratado;
	}
	
	public String getFinContrato() {
		return this.finContrato;
	}
	
	public void setFinContrato(String paramFinContrato) {
		this.finContrato= paramFinContrato;
	}

	public boolean isEspañol() {
		return español;
	}

	public void setEspañol(boolean paramEspañol) {
		this.español = paramEspañol;
	}

	public boolean isIngles() {
		return ingles;
	}

	public void setIngles(boolean paramIngles) {
		this.ingles = paramIngles;
	}

	public boolean isOtroIdioma() {
		return otroIdioma;
	}

	public void setOtroIdioma(boolean paramOtroIdioma) {
		this.otroIdioma = paramOtroIdioma;
	}

	public String[] getLenguajesProgram() {
		return this.lenguajesProgram;
	}

	public void setLenguajesProgram(String paramLenguajesProgram) {
		this.lenguajesProgram = paramLenguajesProgram;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int paramTelefono) {
		this.telefono = paramTelefono;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String paramCorreoElectronico) {
		this.correoElectronico = paramCorreoElectronico;
	}
	
	public String obtenerLetraDNI() {
		int numeroletra;
		char [] letras = new char [23];
		letras [0] = 'T';
		letras [1] = 'R';
		letras [2] = 'W';
		letras [3] = 'A';
		letras [4] = 'G';
		letras [5] = 'M';
		letras [6] = 'Y';
		letras [7] = 'F';
		letras [8] = 'P';
		letras [9] = 'D';
		letras [10] = 'X';
		letras [11] = 'B';
		letras [12] = 'N';
		letras [13] = 'J';
		letras [14] = 'Z';
		letras [15] = 'S';
		letras [16] = 'Q';
		letras [17] = 'V';
		letras [18] = 'H';
		letras [19] = 'L';
		letras [20] = 'C';
		letras [21] = 'K';
		letras [22] = 'E';
		numeroletra = this.DNI % 23;
		return "El DNI completo es : " + this.DNI + letras[numeroletra]; 
	} 
	
	public String obtenerInformacionEmpleado() {
		int edad;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechaNac = LocalDate.parse(fechan, fmt);

		LocalDate ahora = LocalDate.now();

		 

		Period periodo = Period.between(fechaNac, ahora);
		edad =  periodo.getYears();
		return "Nombre : " + nombre + " Edad" + edad + "Salario :" + salario 
				+ " Desarrolladora: " + idDesarrolladora + " Grupo trabajo: " + grupo;
	}
	
	public String contacto() {
	return telefono + " " + correoElectronico;
	}
	
	public String duracionContrato() {
		int duracionContrato;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate diaContr = LocalDate.parse(diaContratado, fmt);

		LocalDate diaFin = LocalDate.parse(finContrato, fmt);

		Period periodo = Period.between(diaContr, diaFin);
		 duracionContrato =  periodo.getMonths();
		return "El contrato dura " + duracionContrato ;
	}
	
	public String contactoEmpleado() {
		return correoElectronico + " " + telefono;
	}
	
	public String conocimientos(){
		return "Español " + español + " Ingles: " + ingles + " Otros Idiomas " + otroIdioma + 
				" lenguajes de programacion " + lenguajesProgram;
	}
	
	
	
	
}
