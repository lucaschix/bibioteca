import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

	private String nombre;
	private String direccion;
	private List<Libro> libros;
	private List<Empleado> empleados;
	private List<Categoria> categorias;

	public Biblioteca() {
		this.libros = new ArrayList<>();
		this.empleados = new ArrayList<>();
		this.categorias = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public List<Libro> getLibros() {
		return libros;
	}

	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	public List<Categoria> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categoria> categorias) {
		this.categorias = categorias;
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
		System.out.println("El bibliotecario agrego un libro");
	}

	public void modificarLibro(Libro libro, String nuevoNombre, String nuevoAutor, int nuevoISBN) {
		libro.setTitulo(nuevoNombre);
		libro.setAutor(nuevoAutor);
		libro.setISBN(nuevoISBN);
		System.out.println("Felicidades modificaste un libro, ahora nadie sabe como buscarlo si no es el bibliotecario, nuevo libro: " + libro.getTitulo());
	}

	public void eliminarLibro(Libro libro) {
		libros.remove(libro);
		System.out.println("Libro eliminado (el libro fue cambiado de forma ilegal por un trabajador de la ufro a cambio de un completo y una Cristal), nombre del libro: " + libro.getTitulo()); // Assuming Libro class has a getTitulo method
	}

	public Libro obtenerLibroDisponible(String nombreLibro) {
		for (Libro libro : libros) {
			if (libro.getTitulo().equals(nombreLibro)) {
				return libro;
			}
		}
		return null;
	}
}