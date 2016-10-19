package paquete;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Clasificador {

	public Intermediario inter;

	private int saldo = 0;
	private int numMonedas = 0;
	Visor visor;
	HashMap<Integer, Deposito> depositos;
	HashMap<String, Dispensador> dispensadores;

	public Clasificador() {

	}

	public void insertarMoneda(int moneda) {
		depositos.get(moneda).sumar();
		saldo = saldo + moneda;
		numMonedas++;
		visor.mostrarSaldo(saldo);
	}

	public void retornarMonedas() {
		if (numMonedas == 0) {
			visor.mostrarError("No hay monedas que retornar.");

		} else {
			Map depOrdenado = new TreeMap<>(depositos);
			Set ref = depOrdenado.keySet();
			Iterator it = ref.iterator();
			while (it.hasNext()) {
				System.out.println((Integer) it.next());
			}

			System.out.println("\n");
		}

	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setVisor(Visor visor) {
		this.visor = visor;
	}

	public void seleccionarProducto(String nombreProducto) {

	}

	public void setIntermediario(Intermediario intermediario) {
		this.inter = intermediario;
	}

	public void setDepositos(HashMap<Integer, Deposito> depositos) {
		this.depositos = depositos;
	}

}
