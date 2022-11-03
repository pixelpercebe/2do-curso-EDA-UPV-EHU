package arbolBinarioAlumnos;

import java.util.LinkedList;

public class Nodo<T> {

	T info;
	Nodo<T> left;
	Nodo<T> right;

	// M�todos b�sicos

	public Nodo(T info) {
		this.info = info;
	}

	// Devuelve si el nodo es hoja
	public boolean isLeaf() {
		return (left == null && right == null);
	}

	// Devuelve si el nodo tiene sub�rbol izquierdo
	public boolean hasLeft() {
		return (left != null);
	}

	// Devuelve si el nodo tiene sub�rbol derecho
	public boolean hasRight() {
		return (right != null);
	}

	// EJERCICIO 1
	public LinkedList<T> elementosEnInOrden() {
		//TODO
		return null;
	}

	// EJERCICIO 2
	public ResultadoContainsYNivel containsYNivel(T elem, int nivel) {
		//TODO
		return null; //CORREGIR SI NECESARIO
	}

	// EJERCICIO 3
	public int altura() {
		//TODO
		return -1; //CORREGIR SI NECESARIO
	}

	// EJERCICIO 4
	public LinkedList<T> obtenerCaminoHojaIzquierda() {
		//TODO
		return null; //CORREGIR SI NECESARIO
	}
}