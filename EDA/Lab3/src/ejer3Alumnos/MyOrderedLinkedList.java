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
		//TODO
		Node<T> newnode = new Node<>(elem);

		if (first == null && last == null)
		{
			this.first = newnode;
			this.last = newnode;
		}
		else
		{
			Node<T> actual = last;
			newnode.prev = actual;
			actual.next = newnode;
			this.last = newnode;
		}
		this.size += 1;

	}
	
	//Removes the first appearance of elem, if any.
	//Returns the removed element (null if the list does not contain elem)
	public T removeFirstAppearance(T elem) {
		//TODO
		Node<T> actual = first;
		T aux;
		while (actual != null && !actual.info.equals(elem))
		{
			actual = actual.next;
		}

		if (actual != null && actual.info.equals(elem))
		{
			aux = actual.info;
			if (this.size > 1 && actual == first)
			{
				actual.next.prev = null;
				first = actual.next;
			}
			else if (this.size > 1 && actual == last)
			{
				actual.prev.next = null;
				last = actual.prev;
			}
			else if (this.size == 1)
			{
				this.first = null;
				this.last = null;
			}
			this.size  -= 1;
			return aux;
		}
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
