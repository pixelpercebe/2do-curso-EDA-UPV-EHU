package arbolBinarioAlumnos;

import java.util.LinkedList;



public class ArbolBinario<T extends Comparable<T>> {
	
	Nodo<T> root;

	//M�todos b�sicos
	
	public ArbolBinario() {
		this.root = null;
	}
	
	public ArbolBinario(T info) {
		this.root = new Nodo<T>(info);
	}


	public ArbolBinario(Nodo<T> root) {
		this.root = root;
	}

	public boolean isEmpty() {
		return (root == null);
	}
	
	//EJERCICIO 1
	//Devuelve la lista de elementos en inorden (lista vac�a si no tiene elementos)	
	public LinkedList<T> elementosEnInOrden(){
		//TO DO
		return null; //CORREGIR SI NECESARIO
	}
	
	
	//EJERCICIO 2
	//Devuelve si el elemento est� en el �rbol y en qu� nivel (-1 si no est�, cualquiera de los niveles en que est� si est� repetido)	
	public ResultadoContainsYNivel containsYNivel(T elem) {
		//TO DO
		return null; //CORREGIR SI NECESARIO
	}	
	
	
	//EJERCICIO 3
	//Devuelve la altura del �rbol (-1 si no tiene elementos)	
	public int altura() {
		//TO DO
		return -1; //CORREGIR SI NECESARIO
	}
	
	
	//EJERCICIO 4
	//Devuelve una lista con el camino desde la ra�z hasta la hoja situada m�s a la izquierda (lista vac�a si no tiene elementos)
	public LinkedList<T> obtenerCaminoHojaIzquierda(){
		//TO DO
		return null; //CORREGIR SI NECESARIO
	}
	
	

}
