public class Libro {

	private String titulo;
	private String autor;
	private int ISBN;
	private int año_de_publicacion;
	private Categoria categoria;


	public Libro(String Titulo, String Autor, int ISBN, int año_depublicacion, Categoria categoria){
		this.autor = Autor;
		this.titulo= Titulo;
		this.año_de_publicacion= año_depublicacion;
		this.ISBN= ISBN;
		this.categoria=categoria;
	}



	public String getTitulo() {
		return this.titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return this.autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getISBN() { return ISBN; }

	public void setISBN(int ISBN) { this.ISBN = ISBN; }

	public int getAño_de_publicacion() {
		return this.año_de_publicacion;
	}
	public void setAño_de_publicacion(int año_de_publicacion) {
		this.año_de_publicacion = año_de_publicacion;
	}
	private Categoria getCategoria() {
		return categoria;
	}

	private void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String toString(){
		return "Titulo:"+ this.titulo+"Autor: "+this.autor+"ISBN:"+ this.ISBN+"año de publicacion"+this.año_de_publicacion;
	}
}