package ejer2;

import java.io.IOException;

public class PruebaCromos1 {

	public static void main(String[] args) throws IOException {
		Cromos1 c;
		String nomFich;
		
		for(int i=0; i<=4; i++) {
			System.out.println("Prueba #"+i+":");
			nomFich = "src/ficheros/kromoak"+i+".txt";
			c = new Cromos1(nomFich);
			c.cuantosNoTieneNadie();
			c.cuantasApariciones(0);
			c.cuantasApariciones(5);
			c.cuantasApariciones(10);
		}

		

	}

}
