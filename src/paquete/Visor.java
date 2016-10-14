package paquete;

public class Visor {

	public void mostrarBienvenida(){
		System.out.println("Bienvenido.\n");
	}
	
	public void mostrarSaldo(int saldo){
		System.out.println("\nSALDO: " + saldo + "cent.\n");
	}
	
	public void mostrarPrecio(int precio){
		System.out.println(precio);
	}
	
	public void mostrarError(String error){
		System.err.println(error + "\n");
	}
	
	public void mostrarDespedida(){
		System.out.println("Gracias por su compra.");
	}
	
}
