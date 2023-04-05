package desarrolladora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Videojuegos {
	String idJuego;
	String nombreJuego;
	int precio;
	int ventas;
	String genero;
	String idDesarrolladora;
	String fechaSalida;
	String plataformas;
	String idDistribuidora;
	String motor;
	
	//ConstructorVacío
	public Videojuegos(){
		this.idJuego = " ";
		this.nombreJuego = " ";
		this.precio = 0;
		this.ventas = 0;
		this.genero = " "; 
		this.idDesarrolladora = " ";
		this.fechaSalida = "00/00/00";
		this.plataformas = new String[] {" "};
		this.idDistribuidora = " ";
		this.motor = " ";
	}
	
	//ConstructorCompletoParametrizado
	public Videojuegos(String paramIdJuego, String paramNombreJuego, int paramPrecio,
			int paramVentas, String paramGenero , String paramIdDesarrolladora ,
			String paramFechaSalida, String paramPlataformas, String paramIdDistribuidora, String paramMotor) {
		this.idJuego = paramIdJuego;
		this.nombreJuego = paramNombreJuego;
		this.precio = paramPrecio;
		this.ventas = paramVentas;
		this.genero = paramGenero;
		this.idDesarrolladora = paramIdDesarrolladora;
		this.fechaSalida = paramFechaSalida;
		this.plataformas = new String[] {paramPlataformas};
		this.idDistribuidora = paramIdDistribuidora;
		this.motor = paramMotor;
		
	}

	public String getIdJuego() {
		return this.idJuego;
	}

	public void setIdJuego(String paramIdJuego) {
		this.idJuego = paramIdJuego;
	}

	public String getNombreJuego() {
		return this.nombreJuego;
	}

	public void setNombreJuego(String paramNombreJuego) {
		this.nombreJuego = paramNombreJuego;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int paramPrecio) {
		this.precio = paramPrecio;
	}

	public int getVentas() {
		return this.ventas;
	}

	public void setVentas(int paramVentas) {
		this.ventas = paramVentas;
	}

	public String getGenero() {
		return this.genero;
	}

	public void setGenero(String paramGenero) {
		this.genero = paramGenero;
	}

	public String getIdDesarrolladora() {
		return this.idDesarrolladora;
	}

	public void setIdDesarrolladora(String paramIdDesarrolladora) {
		this.idDesarrolladora = paramIdDesarrolladora;
	}

	public String getFechaSalida() {
		return this.fechaSalida;
	}

	public void setFechaSalida(String paramFechaSalida) {
		this.fechaSalida = paramFechaSalida;
	}

	public String getPlataformas() {
		return this.plataformas;
	}

	public void setPlataformas(String paramPlataformas) {
		this.plataformas = paramPlataformas;
	}

	public String getIdDistribuidora() {
		return this.idDistribuidora;
	}

	public void setIdDistribuidora(String paramIdDistribuidora) {
		this.idDistribuidora = paramIdDistribuidora;
	}

	public String getMotor() {
		return this.motor;
	}

	public void setMotor(String paramMotor) {
		this.motor = paramMotor;
	}
	 
	public int numeroJuego(){
		return (int)(Math.random()*500);
	}
	public  String ingresos(){
		int ingresos;
		ingresos = precio * ventas;
		return "Se han recaudado "+ ingresos;
	}
	
	public String identificacion(){
		return idJuego + " " + nombreJuego + " " + idDesarrolladora + " " + idDistribuidora;
	}
	
	public String informacionAdicional() {
		return genero + " " + fechaSalida +  " " + motor + " "+ plataformas;
	}
	
	public String añosAlaVenta() 	{
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechadeSalida = LocalDate.parse(fechaSalida, fmt);

		LocalDate ahora = LocalDate.now();

		 

		Period periodo = Period.between(fechadeSalida, ahora);
		return "Lleva a la venta " + periodo.getYears() + " años.";
		}
	}
