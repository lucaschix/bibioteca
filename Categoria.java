import java.util.List;

public class Categoria {

	private String nombre;
	private String descripcion;
	private List<Libro> libros;
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	/**
	 * 
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Libro> getLibros() { return libros; }

	public void setLibros(List<Libro> libros) { this.libros = libros; }
}