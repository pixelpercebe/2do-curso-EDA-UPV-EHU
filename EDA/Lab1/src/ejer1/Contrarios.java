package ejer1;

public class Contrarios {
	
	public int cuantosContrarios1(int tabla[]) {
		//Pre: tabla ordenada ascendentemente, sin elementos repetidos
		int cont = 0;
		for(int i=0; i<tabla.length-1; i++)
		{
			for(int j=i+1; j<tabla.length; j++) {
				if(tabla[i]==-tabla[j]) {
					cont++;
				}
			}
		}
		return cont;	
	}
	
	public int cuantosContrarios2(int tabla[]) {
		//Pre: tabla ordenada ascendentemente, sin elementos repetidos
		int cont = 0;
		//TO DO

		
		//FIN TO DO
		return cont;
	}

}
