
public class Libro {
	String titulo;
	String autor;
	int numeroPaginas;
	int calificacion;
	
	public Libro() {
		this.titulo = "  ";
		this.autor = "   ";
		this.numeroPaginas = 0;
		this.calificacion = -1;
	}
	
	public Libro(String paramTitulo,String paramAutor,int paramNumeroPaginas, int paramCalificacion) {
		this.titulo = paramTitulo;
		this.autor = paramAutor;
		this.numeroPaginas = paramNumeroPaginas;
		this.calificacion = paramCalificacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String paramTitulo) {
		this.titulo = paramTitulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String paramAutor) {
		this.autor = paramAutor;
	}

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int paramNumeroPaginas) {
		this.numeroPaginas = paramNumeroPaginas;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int paramCalificacion) {
		this.calificacion = paramCalificacion;
	}

	
	
}
