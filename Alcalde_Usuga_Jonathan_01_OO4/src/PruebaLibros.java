
public class PruebaLibros {

	public static void main(String[] args) {
		ConjuntoLibros c1 = new ConjuntoLibros();
		c1.getCantlibros();
		Libro l1 = new Libro("El último deseo", "Andrzej Sapkowski" , 250, 9);
		Libro l2 = new Libro("JoJo´s Bizarre Adventure:Stell Ball Run" , "Hirohiko Araki", 500,10);
		
		Libro bibliotecaFisica[] = c1.conjuntoLibros; 
		c1.añadirLibro(l1);
		c1.añadirLibro(l2);
		
		c1.getMejorLibro();
		
		c1.eliminarLibroPorAutor("Andrzej Sapkowski");
		c1.eliminarLibroPorTitulo("JoJo´s Bizarre Adventure:Stell Ball Run");
		
		Libro l3 = new Libro("La espada del destino","Andrzrej Sapkowski",254,10);
		c1.añadirLibro(l3);
		c1.getMejorLibro();
		

	}

}
