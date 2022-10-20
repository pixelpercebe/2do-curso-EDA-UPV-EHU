package ejer2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Cromos1 {
	private int MAXAMIGOS;
	private int MAXCROMOS;
	private int[][] cromos;

	public Cromos1(String nomFich) throws IOException {
		cargarCromosDesdeFichero(nomFich);

	}

	//Carga de los ejemplos. ¡¡¡NO MODIFICAR!!!
	public void cargarCromosDesdeFichero(String nomFich) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(nomFich));
		String split[];

		// Leo el nº máximo de amigos y el nº máximo de cromos de la colección
		String linea = br.readLine();
		split = linea.split("\\s+");
		
		
		MAXAMIGOS = Integer.parseInt(split[0]);
		MAXCROMOS = Integer.parseInt(split[1]);

		// Creo la matriz para almacenar la información, por defecto se inicializa a
		// cero
		cromos = new int[MAXAMIGOS][MAXCROMOS];

		// Leo los cromos de cada amigo
		linea = br.readLine();

		while (linea != null) {
			split = linea.split("\\s+");// Divido la linea en sus diferentes componentes
			int amigo = Integer.parseInt(split[0]); // El primer número es el identificador de amigo
			for (int i = 1; i < split.length; i++) { // El resto de números son los identificadores de los cromos
				int numcromo = Integer.parseInt(split[i]);
				cromos[amigo][numcromo]++;
			}
			linea = br.readLine();
		}	
		br.close();
	}

	
	public void cuantosNoTieneNadie() {
		
		int cont = 0;
		// TO DO

		// FIN TO DO
		System.out.println("\tNumero de cromos que no tiene nadie: " + cont);
	}

	public void cuantasApariciones(int numCromo) {
		int cont = 0;
		// TO DO
	
		// FIN TO DO
		System.out.println("\tEl cromo " + numCromo + " aparece " + cont + " veces");
	}

}
