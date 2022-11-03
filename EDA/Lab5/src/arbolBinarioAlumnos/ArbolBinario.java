package arbolBinarioAlumnos;

import java.util.LinkedList;



public class ArbolBinario<T extends Comparable<T>> {
	
	Nodo<T> root;

	//Métodos básicos
	
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
	//Devuelve la lista de elementos en inorden (lista vacía si no tiene elementos)	
	public LinkedList<T> elementosEnInOrden(){
		//TO DO
		return null; //CORREGIR SI NECESARIO
	}
	
	
	//EJERCICIO 2
	//Devuelve si el elemento está en el árbol y en qué nivel (-1 si no está, cualquiera de los niveles en que esté si está repetido)	
	public ResultadoContainsYNivel containsYNivel(T elem) {
		//TO DO
		return null; //CORREGIR SI NECESARIO
	}	
	
	
	//EJERCICIO 3
	//Devuelve la altura del árbol (-1 si no tiene elementos)	
	public int altura() {
		//TO DO
		return -1; //CORREGIR SI NECESARIO
	}
	
	
	//EJERCICIO 4
	//Devuelve una lista con el camino desde la raíz hasta la hoja situada más a la izquierda (lista vacía si no tiene elementos)
	public LinkedList<T> obtenerCaminoHojaIzquierda(){
		//TO DO
		return null; //CORREGIR SI NECESARIO
	}
	
	

}
