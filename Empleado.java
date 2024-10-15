public class Empleado {

	private String nombre;
	private String identificacion;
	private String cargo;
	private Biblioteca biblioteca;

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

	public String getIdentificacion() {
		return this.identificacion;
	}

	/**
	 * 
	 * @param identificacion
	 */
	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}

	public String getCargo() {
		return this.cargo;
	}

	/**
	 * 
	 * @param cargo
	 */
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Biblioteca getBiblioteca() { return biblioteca; }
	public void setBiblioteca(Biblioteca biblioteca) { this.biblioteca = biblioteca; }

}