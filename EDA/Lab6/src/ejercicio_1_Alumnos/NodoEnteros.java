package ejercicio_1_Alumnos;

public class NodoEnteros {

	int info;
	NodoEnteros left;
	NodoEnteros right;

	public NodoEnteros(int info) {
		this.info = info;
	}

	// Devuelve si el nodo es hoja
	public boolean isLeaf() {
		return (left == null && right == null);
	}

	// Devuelve si el nodo tiene subárbol izquierdo
	public boolean hasLeft() {
		return (left != null);
	}

	// Devuelve si el nodo tiene subárbol derecho
	public boolean hasRight() {
		return (right != null);
	}
	
	//EJERCICIO 1: sumarNivel
	//TO DO
	public int sumarNivel(int nivelBuscado, int nivelActual) {
		int suma = 0;
		if (nivelActual == nivelBuscado)
			suma = suma + this.info;
		else {
			if (this.hasLeft())
				suma += this.left.sumarNivel(nivelBuscado, nivelActual + 1);

			if (this.hasRight())
				suma += this.right.sumarNivel(nivelBuscado,nivelActual + 1);
		}
	return suma;
	}


}
