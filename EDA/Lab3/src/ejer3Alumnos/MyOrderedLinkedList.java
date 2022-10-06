package ejer3Alumnos;


public class MyOrderedLinkedList<T extends Comparable<T>> {

	private Node<T> first;
	private Node<T> last;
	private int size;

	
	public MyOrderedLinkedList() {
		size = 0;
	}



	
	//Inserts the specified element in the correct position.
	//Pre: the elements of the list are in ascending order
	public void addOrdered(T elem) {
		
			//TO DO
	}
	
	//Removes the first appearance of elem, if any.
	//Returns the removed element (null if the list does not contain elem)
	public T removeFirstAppearance(T elem) {
		//TO DO
		
		return null; //CORREGIR SI NECESARIO
	}
	
	
	
	/////////////////////////////
	// AUXILIARES PARA PRUEBAS //
	/////////////////////////////
	
	//Returns a string representation of this collection. The string representation
    // consists of a list of the collection's elements, enclosed in square 
    // brackets ("[]"). Adjacent elements are separated by the characters ", " 
    // (comma and space). 
	@Override
	public String toString() {
		//TO DO		
	    Node<T> actual = first;
	    String resultado = "[";
	    while(actual!=null) {
	    	resultado += actual.info.toString();
	    	if(actual!=last) resultado+=", ";
	    	actual=actual.next;
	    }
	    resultado+="]";
		return resultado;
	}
	
	//Imprime la lista pero al revés.
	public String toStringPeroAlReves() {
		//TO DO		
	    Node<T> actual = last;
	    String resultado = "[";
	    while(actual!=null) {
	    	resultado += actual.info.toString();
	    	if(actual!=first) resultado+=", ";
	    	actual=actual.prev;
	    }
	    resultado+="]";
		return resultado;
	}

}
