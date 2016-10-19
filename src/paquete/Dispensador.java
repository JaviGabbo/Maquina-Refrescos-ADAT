package paquete;

public class Dispensador {

	public Dispensador(int precio, int cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}

	private int precio;
	private int cantidad;

	
	public void dispensar() {
		cantidad--;
	}

	
	public int getCantidad() {
		return cantidad;
	}

	
	public int getValor() {
		return precio;
	}
}