package ejercicio_4_Alumnos;


public class Nodo<T extends Comparable<T>> {

	T info;
	Nodo<T> left;
	Nodo<T> right;

	// Métodos básicos

	public Nodo(T info) {
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
	
	public void imprimirArbol() {
		if(this.isLeaf()) System.out.print("[ "+this.info+" ] ");
		else {
			System.out.print("[ "+info+" ");
			if(this.hasLeft()) this.left.imprimirArbol();
			else System.out.print("* ");
			if(this.hasRight()) this.right.imprimirArbol();
			else System.out.print("* ");
			System.out.print("] ");
		}		
	}
	
	
	//EJERCICIO: contarMayoresQueDescendientes
	    //TO DO
	
	
	
	
}
