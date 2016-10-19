package paquete;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Intermediario {

	Scanner scan;
	Clasificador clasificador;
	Visor visor;
	Retorno botonRetorno;

	Seleccion boton1;
	Seleccion boton2;
	Seleccion boton3;
	Seleccion boton4;
	Seleccion boton5;
	Seleccion boton6;

	public Intermediario() {

		scan = new Scanner(System.in);
		clasificador = new Clasificador();
		visor = new Visor();
		botonRetorno = new Retorno(clasificador);

		
		boton1 = new Seleccion(clasificador);
		boton2 = new Seleccion(clasificador);
		boton3 = new Seleccion(clasificador);
		boton4 = new Seleccion(clasificador);
		boton5 = new Seleccion(clasificador);
		boton6 = new Seleccion(clasificador);

		crearDepositos();

		setClasificador(clasificador);
		clasificador.setIntermediario(this);
		clasificador.setVisor(visor);

	}

	public void ejecucion() {

		

		visor.mostrarBienvenida();
		int opcion = 0;

		do {

			System.out.println(
					"¿Que quieres hacer?\nPulsa 1 para insertar moneda.\nPulsa 2 para retornar moneda.\nPulsa 3 para seleccionar bebida.\nPulsa 4 para salir.");
			System.out.println();

			opcion = scan.nextInt();

			switch (opcion) {
			case 1:
				insertarMoneda();
				break;
				
			case 2:
				clasificador.retornarMonedas();
				break;

			case 3:

				break;

			case 4:

				break;

			default:
				System.out.println("Introduce una opcion valida.");
				break;

			}
		} while (opcion != 4);

	}

	public void insertarMoneda() {

		System.out.println(
				"¿Qué moneda quieres introducir?\nEscribe:\n5 para moneda de 5cent.\n10 para moneda de 10cent.\n20 para moneda de 20cent.\n50 para moneda de 50cent.\n100 para moneda de 1EUR.\n200 para moneda de 2EUR.");
		int moneda = scan.nextInt();

		if (moneda == 5 || moneda == 10 || moneda == 20 || moneda == 50 || moneda == 100 || moneda == 200) {
			clasificador.insertarMoneda(moneda);
		} else {
			System.out.println("No has introducido un valor valido.");
		}
	}

	public void crearDepositos() {
		
		TreeMap<Integer, Deposito> depositos = new TreeMap<Integer, Deposito>(Collections.reverseOrder());

		Deposito dep = new Deposito(5, 5);
		depositos.put(5, dep);
		
		Deposito dep1 = new Deposito(10, 5);
		depositos.put(10, dep1);

		Deposito dep2 = new Deposito(20, 5);
		depositos.put(20, dep2);

		Deposito dep3 = new Deposito(50, 5);
		depositos.put(50, dep3);

		Deposito dep4 = new Deposito(100, 5);
		depositos.put(100, dep4);

		Deposito dep5 = new Deposito(200, 5);
		depositos.put(200, dep5);
		
		clasificador.setDepositos(depositos);

	}
	
	
	public void crearDispensadores(){
		
		HashMap <String, Dispensador> dispensadores = new HashMap<String, Dispensador>();
		
		Dispensador cocacola = new Dispensador(60, 2);
		dispensadores.put("Coca Cola", cocacola);
		
		Dispensador nestea = new Dispensador(40, 2);
		dispensadores.put("Nestea", nestea);
		
		Dispensador pepsi = new Dispensador(80, 2);
		dispensadores.put("Pepsi", pepsi);
		
		Dispensador fanta = new Dispensador(70, 2);
		dispensadores.put("Fanta", fanta);
		
		Dispensador aquarius = new Dispensador(65, 2);
		dispensadores.put("Aquarius", aquarius);
		
		Dispensador monster = new Dispensador(120, 2);
		dispensadores.put("Monster", monster);
		
		Dispensador redbull = new Dispensador(100, 2);
		dispensadores.put("Red Bull", redbull);
		
		Dispensador agua = new Dispensador(30, 2);
		dispensadores.put("Agua", agua);
		
		clasificador.setDispensadores(dispensadores);
		
		
	}

	public void setClasificador(Clasificador clasificador) {
		this.clasificador = clasificador;
	}

}
