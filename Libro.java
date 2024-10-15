public class Libro {

	private String titulo;
	private String autor;
	private int ISBN;
	private int año_de_publicacion;

	public String getTitulo() {
		return this.titulo;
	}

	/**
	 * 
	 * @param titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return this.autor;
	}

	/**
	 * 
	 * @param autor
	 */
	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getISBN() {
		// TODO - implement Libro.getISBN
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ISBN
	 */
	public void setISBN(int ISBN) {
		// TODO - implement Libro.setISBN
		throw new UnsupportedOperationException();
	}

	public int getAño_de_publicacion() {
		return this.año_de_publicacion;
	}

	/**
	 * 
	 * @param año_de_publicacion
	 */
	public void setAño_de_publicacion(int año_de_publicacion) {
		this.año_de_publicacion = año_de_publicacion;
	}

}