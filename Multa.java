public class Multa {

	private int monto;
	private int fecha;
	private String estado;
	private Prestamo prestamo;
	public Multa(int monto, Prestamo prestamo, int fecha, String estado) {
		this.monto = monto;
		this.prestamo = prestamo;
		this.fecha= fecha;
		this.estado=estado;

	}

	public int getMonto() {
		return this.monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}

	public int getFecha() {
		return this.fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Prestamo getPrestamo() {
		return prestamo;
	}
	public void setPrestamo(Prestamo prestamo) {
		this.prestamo = prestamo;
	}

	public void pagarMulta(){
		this.estado="pagada";
		System.out.println("Multa pagada.");

	}

}