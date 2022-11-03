package ejercicio_4_Alumnos;



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
	
	public void imprimirArbol() {
		if (this.isEmpty())
			System.out.println("*");
		else {
			this.root.imprimirArbol();
			System.out.println();
		}

	}
	
	

	public int contarMayoresQueDescendientes() {
		//TO DO
		return -1; //CORREGIR SI NECESARIO
	}
	
}