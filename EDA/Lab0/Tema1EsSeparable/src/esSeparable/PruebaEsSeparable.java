package esSeparable;

import auxiliares.ArrayCreator;
import auxiliares.Stopwatch;

public class PruebaEsSeparable {

    public static void main(String[] args) { 
    	Integer[] a;
    	Stopwatch timer;
    	Separable sepa = new Separable();
    	int N = 250;
    	
        while(true)	{        	
        	a = ArrayCreator.createArray(N); //Crea un array de N enteros, de manera aleatoria
        	timer = new Stopwatch(); //Pone en marcha el cronómetro
        	sepa.esSeparable1(a);            
            System.out.println(N+": "+timer.elapsedTime());  //Imprime el tiempo transcurrido
            N = 2*N; //Duplicamos el nº de elementos del array
        } 
    } 
}
