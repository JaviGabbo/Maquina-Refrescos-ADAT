package paquete;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Clasificador {

	public Intermediario inter;

	private int saldo = 0;
	private int numMonedas = 0;
	Visor visor;
	TreeMap<Integer, Deposito> depositos;
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

			Set set = depositos.entrySet();
			Iterator it = set.iterator();

			while (it.hasNext()) {

				Map.Entry entry = (Map.Entry) it.next();

				while (saldo != 0) {

					Integer key = (Integer) entry.getKey();
					Deposito value = (Deposito) entry.getValue();

					if (saldo >= key) {

						if (value.getCantidad() > 0) {
							saldo -= value.getValor();
							value.restar();
							System.out.println("Devuelve moneda de " + value.getValor() + "cent.\n");

						} else {
							entry = (Map.Entry) it.next();

						}
					} else {
						entry = (Map.Entry) it.next();
					}
				}

			}

		}

	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void setVisor(Visor visor) {
		this.visor = visor;
	}

	public void seleccionarProducto(String nombreProducto) {
		int precio = dispensadores.get(nombreProducto).getValor();
		int cantidad = dispensadores.get(nombreProducto).getCantidad();
		visor.mostrarPrecio(precio);
		visor.mostrarSaldo(saldo);

		if (saldo >= precio) {
			if (cantidad > 0) {
				visor.mostrarMensaje("Realizando compra\n.\n.\n.");
				saldo -= precio;
				System.out.println("Cantidad de producto: " + cantidad);
				dispensadores.get(nombreProducto).dispensar();
				retornarMonedas();
			} else {
				visor.mostrarMensaje("Sin existencias.");
				retornarMonedas();
			}
		} else {
			System.out.println("No hay saldo suficiente, te faltan " + (precio - saldo) + "cent.\n");
		}
	}

	public void setIntermediario(Intermediario intermediario) {
		this.inter = intermediario;
	}

	public void setDepositos(TreeMap<Integer, Deposito> depositos) {
		this.depositos = depositos;
	}

	public void setDispensadores(HashMap<String, Dispensador> dispensadores) {
		this.dispensadores = dispensadores;
	}

}
