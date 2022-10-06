package ejer1Alumnos;

public class PruebaPalabra {


	public static void main(String[] args) {
		//modificar para efectuar las pruebas que consideréis oportunas
		Palabra lc = new Palabra("hola");
		lc.imprimirAlDerecho();
		lc.imprimirAlReves();

		lc.replicarVocales(2);
		lc.imprimirAlDerecho();
		lc.imprimirAlReves();

		lc.entrecomillar();
		lc.imprimirAlDerecho();
		lc.imprimirAlReves();

	}

}
