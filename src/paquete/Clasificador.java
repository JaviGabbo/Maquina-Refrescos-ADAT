package paquete;

import java.util.HashMap;

public class Clasificador {
	
	public Intermediario inter;
	
	
	private int saldo = 0;
	private int numMonedas = 0;
	Visor visor;
	HashMap<Integer, Deposito> depositos;
	HashMap<String, Dispensador> dispensadores;
	
	public Clasificador() {
		
		
	}
	
	
	public void insertarMoneda(int moneda){
		depositos.get(moneda).sumar();
		saldo = saldo + moneda;
		visor.mostrarSaldo(saldo);
	}
	
	public void retornarMonedas(){
		if (numMonedas == 0) {
			visor.mostrarError("No hay monedas que retornar.");
		} else {
			System.out.println("wohoohaaa");
		}
		
	}
	
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public void setVisor(Visor visor) {
		this.visor = visor;
	}


	
	
	public void seleccionarProducto(String nombreProducto){
		
		
	}


	public void setIntermediario(Intermediario intermediario){
		this.inter = intermediario;
	}
	
	
	public void setDepositos(HashMap<Integer, Deposito> depositos){
		this.depositos = depositos;
	}
	
	

}
