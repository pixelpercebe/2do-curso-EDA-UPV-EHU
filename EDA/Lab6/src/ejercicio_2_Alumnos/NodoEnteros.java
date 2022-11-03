package ejercicio_2_Alumnos;

public class NodoEnteros {
	int info;
	NodoEnteros left;
	NodoEnteros right;
	int etiquetaSuma;
	int etiquetaNumHojas;

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
	
	public void imprimirEtiquetas() {
		System.out.println("Nodo "+this.info+": etiquetaSuma="+this.etiquetaSuma+" etiquetaNumHojas="+this.etiquetaNumHojas);
		if(this.hasLeft()) this.left.imprimirEtiquetas();
		if(this.hasRight()) this.right.imprimirEtiquetas();
	}
	
	//EJERCICIO: etiquetar
	//TO DO
}
