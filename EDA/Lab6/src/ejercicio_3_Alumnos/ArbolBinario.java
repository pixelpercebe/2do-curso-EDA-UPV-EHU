package ejercicio_3_Alumnos;

import java.util.LinkedList;



public class ArbolBinario<T> {
	
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
	
	public void imprimirArbol() {
		if (this.isEmpty())
			System.out.println("*");
		else {
			this.root.imprimirArbol();
			System.out.println();
		}

	}
	
	
	//Devuelve una lista con el camino desde la raíz hasta la hoja más profunda.
	//En caso de empate, el camino que esté más a la izquierda.	
	public LinkedList<T> caminoMasLargoHastaHoja(){
		//TO DO
		return null; //CORREGIR SI NECESARIO
	}
		

}
