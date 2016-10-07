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
		
	}
	
	public void ejecucion(){

	//String nombreProducto = null;

	visor.mostrarBienvenida();
	int opcion = 0;

	do {

		System.out.println(
				"¿Qué quieres hacer?\nPulsa 1 para insertar moneda.\nPulsa 2 para retornar moneda.\nPulsa 3 para seleccionar bebida.\nPulsa 4 para salir.");
		System.out.println();

		opcion = scan.nextInt();

		switch (opcion) {
		case 1:
			
			break;

		case 2:

			break;

		case 3:

			break;
			
		case 4:

			break;

		default:
			System.out.println("Introduce una opción válida.");
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
	 * default: System.out.println("Introduce un número del 1 al 6.");
	 * break; }
	 */
	}


public void insertarMoneda(){}

}
