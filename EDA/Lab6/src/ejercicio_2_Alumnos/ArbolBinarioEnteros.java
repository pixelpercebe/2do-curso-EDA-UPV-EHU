package ejercicio_2_Alumnos;

public class ArbolBinarioEnteros {
	
	NodoEnteros root;

	public ArbolBinarioEnteros() {
		
	}
	
	public boolean isEmpty() {
		return (root == null);
	}
	
	
	public void imprimirEtiquetas() {
		if(!this.isEmpty()) this.root.imprimirEtiquetas();
	}
	

	
	//Etiqueda cada nodo del �rbol con la suma de los valores de todos sus ascendientes, incluido �l mismo
	public void etiquetar() {
		//TO DO
	}

}
