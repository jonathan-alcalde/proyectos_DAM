package desarrolladora;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Plataforma {
	String idPlataforma;
	String nombrePlataforma;
	String compania;
	String fechaDeSalida;
	int precio;
	String [] videojuegos;
	int [] precioVideojuegos;
	
	public Plataforma()
	{
		idPlataforma = "";
		nombrePlataforma = "";
		compania = "";
		fechaDeSalida = "";
		precio = 0;
		
	}
	
	public String getIdPlataforma() {
		return idPlataforma;
	}
	public void setIdPlataforma(String paramIdPlataforma) {
		this.idPlataforma = paramIdPlataforma;
	}
	public String getNombrePlataforma() {
		return nombrePlataforma;
	}
	public void setNombrePlataforma(String paramNombrePlataforma) {
		this.nombrePlataforma = paramNombrePlataforma;
	}
	public String getCompania() {
		return compania;
	}
	public void setCompania(String paramCompania) {
		this.compania = paramCompania;
	}
	public String getFechaDeSalida() {
		return fechaDeSalida;
	}
	public void setFechaDeSalida(String paramFechaDeSalida) {
		this.fechaDeSalida = paramFechaDeSalida;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int paramPrecio) {
		this.precio = paramPrecio;
	}
	public String[] getVideojuegos() {
		return videojuegos;
	}
	public void setVideojuegos(String[] paramVideojuegos) {
		this.videojuegos = paramVideojuegos;
	}
	public int[] getPrecioVideojuegos() {
		return precioVideojuegos;
	}
	public void setPrecioVideojuegos(int[] paramPrecioVideojuegos) {
		this.precioVideojuegos = paramPrecioVideojuegos;
	}
	
	

	public String identificacionPlataforma()
	{
		return idPlataforma + " " + nombrePlataforma + " " + compania;
	}
	
	public String juegosDesarrollados() {
		return videojuegos +" "+precioVideojuegos;
	}
	
	public String precioPlataforma()
	{
		return idPlataforma + " " + nombrePlataforma + " " + precio;
	}
	public int getAnhos()
	{
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		LocalDate fechaNac = LocalDate.parse(fechaDeSalida, fmt);

		LocalDate ahora = LocalDate.now();

		 

		Period periodo = Period.between(fechaNac, ahora);
		return periodo.getYears();
	}

}
