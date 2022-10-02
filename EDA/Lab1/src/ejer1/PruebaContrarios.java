package ejer1;


import auxiliares.ArrayCreator;
import auxiliares.Stopwatch;

public class PruebaContrarios {
	
	public static void main(String[] args) { 	
		
		Contrarios c = new Contrarios();
		int[] a;
		Stopwatch timer;		
		int N=250;
		while(true) {
			a= ArrayCreator.createArrayNoRepOrdered(N); //Crea un array de N elementos ordenados ascendentemente
			timer = new Stopwatch(); //Pone en marcha el cronómetro
			c.cuantosContrarios1(a); //Llama a cuantosContrarios
			System.out.println(N+":"+timer.elapsedTime());	//Imprime el tiempo transcurrido	
			N=N*2; //Duplica el tamaño del array
		}
		
		
		
		
	}
    


}
