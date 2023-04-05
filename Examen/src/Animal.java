
public class Animal {
 String nombre;
 char sexo;
 String alimentacion;
 String fechaN;
 public Animal()
 {
	 this.nombre = (" ");
	 this.sexo = 'M';
	 this.alimentacion = ("");
	 this.fechaN = ("");
 }
 
 public Animal(String paramNombre, char paramSexo,String paramAlimentacion,
		String paramFechaN )
 {
	 this.nombre = paramNombre;
	 this.sexo = paramSexo;
	 this.alimentacion = paramAlimentacion;
	 this.fechaN = paramFechaN;
 }
 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}
	public char getSexo()
	{
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	
	public void setAlimentacion(String Alimentacion)
	{
		this.alimentacion = Alimentacion;
	}
	
	public String getFechaN() {
		return fechaN;
	}
	
	public void setfechaN(String fechaN)
	{
		this.fechaN = fechaN;
	}
 
 public void funciona()
 {
	System.out.println("Clase Animal Funciona"); 
 }
}
