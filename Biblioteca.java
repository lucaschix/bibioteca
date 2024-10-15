import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {

	private String nombre;
	private String direccion;
	private List<Libro> libros;
	public Biblioteca(){
		this.libros = new ArrayList<>();
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
	public List<Libro> getLibros() { return libros; }
	public void setLibros(List<Libro> libros) { this.libros = libros; }

	public boolean Agregar_libro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa  titulo, autor, ISBN, genero, cantidad y disponivilidad(true/false) del libro que desea agregar");
		String titulo = scanner.nextLine();
		String autor = scanner.nextLine();
		String ISBN = scanner.nextLine();
		String año_depublicacion = scanner.nextLine();
        Libro libro = new Libro(titulo, autor, ISBN,año_depublicacion);
		this.libros.add(libro);
		System.out.println("Libro agregado con éxito.");
		return true;
	}
	public void eliminarlibro(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el tiulo del libro que deseas eliminar");
		String Titulo = scanner.nextLine();
		for(Libro libro : this.libros ){
			if(libro.getTitulo().equals(Titulo)){
				this.libros.remove(libro);
				System.out.println("libro eliminado");
				break;
			}
		}
	}
	public void modificar_libro(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el título del libro que deseas modificar");
		String titulo = scanner.nextLine();
		for(Libro libro : this.libros ){
			if(libro.getTitulo().equals(titulo)){
				System.out.println("Ingresa el nuevo título,Autor y año de publicacion del libro");
				String nuevoTitulo = scanner.nextLine();
				String nuevoAutor = scanner.nextLine();
				String nuevoAñoDePublicacion = scanner.nextLine();
				libro.setTitulo(nuevoTitulo);
				libro.setAutor(nuevoAutor);
				libro.setAño_de_publicacion(nuevoAñoDePublicacion);
				System.out.println("Libro modificado con éxito.");
				break;
			}
		}
	}


}