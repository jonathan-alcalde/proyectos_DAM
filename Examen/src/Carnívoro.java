
public class Carn�voro extends Animal {
 boolean depredador;
 boolean carronero;
 
 public Carn�voro() {
	 depredador = false;
	 carronero = false;
 }
 
 public Carn�voro(boolean paramDepredador, boolean paramCarronero) {
	 depredador = paramDepredador;
	 carronero = paramCarronero;
 }
 
 
 public boolean isDepredador() {
	return depredador;
}

public void setDepredador(boolean depredador) {
	this.depredador = depredador;
}

public boolean isCarronero() {
	return carronero;
}

public void setCarronero(boolean carronero) {
	this.carronero = carronero;
}

public void carnivoroFunciona() {
	 System.out.println("Carn�voro funciona");
 }
 
}
