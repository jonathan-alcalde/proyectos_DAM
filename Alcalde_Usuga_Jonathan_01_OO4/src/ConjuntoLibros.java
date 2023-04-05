public class ConjuntoLibros {
	public Libro [] conjuntoLibros = new Libro[10];
	private int cantlibros;
	
	public Libro[] getConjuntoLibros() {
		return conjuntoLibros;
	}

	public void setConjuntoLibros(Libro[] conjuntoLibros) {
		this.conjuntoLibros = conjuntoLibros;
	}

	public int getCantlibros() {
		return cantlibros;
	}

	public void setCantlibros(int cantlibros) {
		this.cantlibros = cantlibros;
	}
	
	public void añadirLibro(Libro paramLibro ) {
		if(cantlibros >= conjuntoLibros.length)
		{
			System.out.println("No se pueden añadir mas libros");
		}
		
		
		conjuntoLibros[cantlibros] = paramLibro;
		cantlibros++;
	}
	
	public void eliminarLibroPorTitulo(String paramTitulo){
		for(int i = 0; i < conjuntoLibros.length-1; i++)
		{
			if(conjuntoLibros[i].titulo.contentEquals(paramTitulo)) {
				conjuntoLibros[i] = new Libro();
			}
		}
	}
	
	public String eliminarLibroPorAutor(String paramAutor){
		for(int i = 0; i < this.conjuntoLibros.length; i++)
		{
			if(this.conjuntoLibros[i].autor.equals(paramAutor)) {
				this.conjuntoLibros[i] = new Libro();
			}
		}
		return "Libro eliminado";
	}
	
	public Libro getMejorLibro() {
        if(cantlibros==0) {
            return null;
        }
        Libro mejorLibro = conjuntoLibros[0];
        for(int i=1;i<cantlibros;i++)
        {
            if(mejorLibro.getCalificacion()<conjuntoLibros[i].getCalificacion()) {
                mejorLibro=conjuntoLibros[i];
            }

        }
        return mejorLibro;
    }
    
	
		public ConjuntoLibros ordenarPorCalificacion(ConjuntoLibros conjuntoLibros){
			Libro elementoActual = new Libro();
			Libro elementoSiguiente = new Libro();
			 for (int i = 0; i < this.conjuntoLibros.length; i++){
			        for (int y = 0; y < this.conjuntoLibros.length - 1; y++) {
			             elementoActual = this.conjuntoLibros[y];
			            elementoSiguiente = this.conjuntoLibros[y + 1];
			            if (elementoActual.calificacion > elementoSiguiente.calificacion) {
			               this.conjuntoLibros[y] = elementoSiguiente;
			                this.conjuntoLibros[y + 1] = elementoActual;
			            }
			        }
			    }
			 for (int x = 0; x < conjuntoLibros.conjuntoLibros.length; x++){
				 System.out.println(this.conjuntoLibros[x].titulo);
			 }
			 return conjuntoLibros;
			}
	
		
	}

