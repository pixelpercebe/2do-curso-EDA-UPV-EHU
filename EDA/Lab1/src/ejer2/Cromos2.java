package ejer2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Cromos2 {
	private int MAXAMIGOS;
	private int MAXCROMOS;
	private ArrayList<Integer> cromos[];
	
	
	public Cromos2(String nomFich) throws IOException {
		cargarCromosDesdeFichero(nomFich);
	}
	
	//Carga de los ejemplos. No modificar
	private void cargarCromosDesdeFichero(String nomFich) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(nomFich));		
		String split[];
		
		//Leo el nº máximo de amigos y el nº máximo de cromos de la colección
		String linea = br.readLine();
		split = linea.split("\\s+");
		MAXAMIGOS = Integer.parseInt(split[0]);
		MAXCROMOS = Integer.parseInt(split[1]);
		
		//Creo la lista para almacenar la información
		cromos = new ArrayList[MAXAMIGOS];
		for(int i=0;i<MAXAMIGOS;i++) cromos[i]=new ArrayList<Integer>();	
		
		//Leo los cromos de cada amigo
		linea = br.readLine();
		
		while (linea != null) {
			split = linea.split("\\s+");//Divido la linea en sus diferentes componentes
			int amigo = Integer.parseInt(split[0]); //El primer número es el identificador de amigo
			for(int i=1; i<split.length; i++) { //El resto de números son los identificadores de los cromos
				int numcromo = Integer.parseInt(split[i]);
				cromos[amigo].add(numcromo);
			}
			linea = br.readLine();
		}
		br.close();
		
	}
	
	
	public void cuantosNoTieneNadie1() {
	
        int cont = 0;   
       
        for(int i=0; i<MAXCROMOS;i++) {
        	
        	boolean encontrado = false;
        	int j = 0;
        	while(j<MAXAMIGOS && !encontrado) {
        		int k=0;
        		while(k<cromos[j].size() && !encontrado) {
        			if(cromos[j].get(k)==i) {
        				encontrado = true; 
        			}
        			k++;
        		}        		
        		j++;
        	}
        	if (!encontrado) cont++;
        }		
        
		System.out.println("\tNumero de cromos que no tiene nadie: "+cont);
	}
	
	public void cuantosNoTieneNadie2() {

		int cont = 0;

		//TO DO

        //FIN TO DO
		System.out.println("\tNumero de cromos que no tiene nadie: "+cont);
	}
	
	public void cuantasApariciones(int numCromo) {
		int cont = 0;
		//TO DO

		//FIN TO DO
		System.out.println("\tEl cromo "+numCromo+" aparece "+cont+" veces");
	}



}
