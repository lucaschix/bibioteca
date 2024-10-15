public class Prestamo {

	private int fecha_prestamo;
	private int fecha_entrega;
	private Usuario usuario;
	private Libro libro;

	public int getFecha_prestamo() {
		// TODO - implement Prestamo.getFecha_prestamo
		throw new UnsupportedOperationException();
	}


	public void setFecha_prestamo(int fecha_prestamo) {
		this.fecha_prestamo = fecha_prestamo;
	}

	public int getFecha_entrega() {
		// TODO - implement Prestamo.getFecha_entrega
		throw new UnsupportedOperationException();
	}


	public void setFecha_entrega(int fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}
	public Usuario getUsuario() { return usuario; }
	public void setUsuario(Usuario usuario) { this.usuario = usuario; }
	public Libro getLibro() { return libro; }
	public void setLibro(Libro libro) { this.libro = libro; }
}