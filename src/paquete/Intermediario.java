package paquete;

import java.util.Scanner;

public class Intermediario {
	
	Scanner scan;
	Clasificador clasificador;
	Visor visor;
	Retorno botonRetorno;
	Dispensador dispensador1;
	
	Seleccion boton1;
	Seleccion boton2;
	Seleccion boton3;
	Seleccion boton4;
	Seleccion boton5;
	Seleccion boton6;
	
	
	public Intermediario(){
		
		scan = new Scanner(System.in);
		clasificador = new Clasificador();
		visor = new Visor();
		botonRetorno = new Retorno(clasificador);
	
		dispensador1 = new Dispensador();
		boton1 = new Seleccion(clasificador);
		boton2 = new Seleccion(clasificador);
		boton3 = new Seleccion(clasificador);
		boton4 = new Seleccion(clasificador);
		boton5 = new Seleccion(clasificador);
		boton6 = new Seleccion(clasificador);
		
		
		crearDepositos();
		
		setClasificador(clasificador);
		clasificador.setIntermediario(this);
		
		
		
		
	}
	


	public void ejecucion(){

	//String nombreProducto = null;

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

	/*
	 * int bebida = 0; switch (bebida) { case 1: nombreProducto =
	 * "CocaCola"; break;
	 * 
	 * case 2: nombreProducto = "Aquarius"; break;
	 * 
	 * case 3: nombreProducto = "Fanta Limon"; break;
	 * 
	 * case 4: nombreProducto = "Fanta Naranja"; break;
	 * 
	 * case 5: nombreProducto = "Nestea"; break;
	 * 
	 * case 6: nombreProducto = "Agua"; break;
	 * 
	 * default: System.out.println("Introduce un n�mero del 1 al 6.");
	 * break; }
	 */
	}


public void insertarMoneda(){
	
	System.out.println("¿Qué moneda quieres introducir?\nEscribe:\n10 para moneda de 10cent.\n20 para moneda de 20cent.\n50 para moneda de 50cent.\n1 para moneda de 1EUR.\n2 para moneda de 2EUR.");
	int moneda = scan.nextInt();
	
	switch (moneda) {
	case 1:
		System.out.println("Has introducido moneda de 1EUR.");
		clasificador.insertarMoneda(moneda);
		break;
		
	case 2:
		System.out.println("Has introducido moneda de 2EUR.");
		clasificador.insertarMoneda(moneda);
		break;
		
	case 10:
		System.out.println("Has introducido moneda de 10cent.");
		clasificador.insertarMoneda(moneda);
		break;
		
	case 20:
		System.out.println("Has introducido moneda de 20cent.");
		clasificador.insertarMoneda(moneda);
		break;
		
	case 50:
		System.out.println("Has introducido moneda de 50cent.");
		clasificador.insertarMoneda(moneda);
		break;
		
	default:
		System.out.println("No has introducido un valor valido.");
		break;
	}
	
	
	
}


public void crearDepositos(){
	
	Deposito dep1 = new Deposito(10,3);
	Deposito dep2 = new Deposito(20,3);
	Deposito dep3 = new Deposito(50,3);
	Deposito dep4 = new Deposito(1,3);
	Deposito dep5 = new Deposito(2,3);
	
}



public void setClasificador(Clasificador clasificador) {
	this.clasificador = clasificador;
}







}
