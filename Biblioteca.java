import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

	private String nombre;
	private String direccion;
	private ArrayList<Libro> libros;
	private ArrayList<Empleado> empleados;
	private ArrayList<Categoria> categorias;

	public Biblioteca(){
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
	public ArrayList<Libro> getLibros() { return libros; }
	public void setLibros(ArrayList<Libro> libros) {
		this.libros = libros;
	}
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}

	public void agregarLibro(Libro libro) {
		libros.add(libro);
		System.out.println("Su libro se agrego, este fue: " + libro.getLibros());
	}

	public void modificarLibro(Libro libro, String nuevoNombre, String nuevoAutor, int nuevoISBN, int nuevoAnio) {
		libro.setLibro(nuevoNombre);
		libro.setAutor(nuevoAutor);
		libro.setISBN(nuevoISBN);
		libro.setYearPublicacion(nuevoAnio);
		System.out.println("El libro de modifico, nuevo libro: " + libro.getLibro());
	}

	public void eliminarLibro(Libro libro) {
		libros.remove(libro);
		System.out.println("El libro se uso para el fuego, adios: " + libro.getLibro());
	}

	public Libro obtenerLibroDisponible(String nombreLibro) {
		for (Libro libro : libros) {
			if (libro.getLibro().equals(nombreLibro)) {
				return libro;
			}
		}
		return null;
	}

}