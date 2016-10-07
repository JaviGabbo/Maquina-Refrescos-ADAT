package paquete;

import java.util.HashMap;

public class Clasificador {
	
	int saldo = 0;
	Visor visor;
	HashMap<Integer, Deposito> depositos;
	HashMap<String, Dispensador> dispensadores;
	
	
	public void insertarMoneda(int moneda){
		depositos.get(moneda).sumar();
		saldo = saldo + moneda;
		visor.mostrarSaldo(saldo);
	}
	
	
	public void retornarMonedas(){
		
		
	}
	
	
	public void seleccionarProducto(String nombreProducto){
		
		
	}
	
	

}
