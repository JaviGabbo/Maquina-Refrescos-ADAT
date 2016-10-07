package paquete;

public class Retorno extends Tecla{

	Clasificador clasificador;

	public Retorno(Clasificador clasificador) {
		super();
		this.clasificador = clasificador;
	}



	@Override
	public void pulsar() {
		clasificador.retornarMonedas();
	}
	
	
	
	
}
