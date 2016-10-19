package paquete;

public class Deposito {

	public Deposito(int valor, int cantidad) {
		super();
		this.valor = valor;
		this.cantidad = cantidad;
	}

	private int valor;
	private int cantidad = 0;

	public void sumar() {
		cantidad++;
	}

	public void restar() {
		cantidad--;
	}
	
	
	public int getCantidad(){
		return cantidad;
	}
	
	public int getValor(){
		return valor;
	}

}
