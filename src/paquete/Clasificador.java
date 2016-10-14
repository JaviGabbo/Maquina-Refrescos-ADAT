package paquete;

import java.util.HashMap;

public class Clasificador {
	
	public Intermediario inter;
	
	
	int saldo = 0;
	Visor visor;
	HashMap<Integer, Deposito> depositos;
	HashMap<String, Dispensador> dispensadores;
	
	public Clasificador() {
		depositos = new HashMap<Integer, Deposito>();
		
	}
	
	
	public void insertarMoneda(int moneda){
		depositos.get(moneda).sumar();
		saldo = saldo + moneda;
		visor.mostrarSaldo(saldo);
	}
	
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}


	public void setVisor(Visor visor) {
		this.visor = visor;
	}


	
	
	
	
	
	public void retornarMonedas(){
		
		
	}
	
	
	public void seleccionarProducto(String nombreProducto){
		
		
	}


	public void setIntermediario(Intermediario intermediario){
		this.inter = intermediario;
	}
	
	

}
