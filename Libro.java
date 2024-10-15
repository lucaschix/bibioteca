public class Libro {

	private String titulo;
	private String autor;
	private String ISBN;
	private int año_de_publicacion;


	public Libro(String Titulo, String Autor, String ISBN, String año_depublicacion){
		this.autor = Autor;
		this.titulo= Titulo;
		this.año_de_publicacion= año_depublicacion;
		this.ISBN= ISBN;

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
	public String getISBN() { return ISBN; }

	public void setISBN(String ISBN) { this.ISBN = ISBN; }

	public int getAño_de_publicacion() {
		return this.año_de_publicacion;
	}
	public void setAño_de_publicacion(int año_de_publicacion) {
		this.año_de_publicacion = año_de_publicacion;
	}
	public String toString(){
		return "Titulo:"+ this.titulo+"Autor: "+this.autor+"ISBN:"+ this.ISBN+"año de publicacion"+this.año_de_publicacion;
	}
}