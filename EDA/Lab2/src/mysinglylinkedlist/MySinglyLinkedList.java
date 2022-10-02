package mysinglylinkedlist;

import java.util.NoSuchElementException;

public class MySinglyLinkedList<T extends Comparable<T>> {

	private LinearNode<T> first;
	private LinearNode<T> last;
	private int size;

	private class LinearNode<T> {
		T info;
		LinearNode<T> next;

		public LinearNode(T info) {
			this.info = info;
		}
	}
	
	public MySinglyLinkedList() {
		size = 0;
	}

	/*
	 * MÉTODOS YA IMPLEMENTADOS EN CLASE
	 */

	//Returns true if this list contains no elements, false otherwise.
	public boolean isEmpty() {
		return (first == null);
	}

	//Appends the specified element to the front of this list.
	public void addFirst(T elem) {
		LinearNode<T> newNode = new LinearNode<T>(elem);
		newNode.next = first;
		first = newNode;
		if(last==null) last = newNode;
		size++;
	}

	//Returns true if this list contains the specified element, false otherwise.
	public boolean contains(Object o) {
		T elem = (T)o;
		LinearNode<T> actual = first;
		while (actual != null) {
			if (elem.equals(actual.info))
				return true;
			actual = actual.next;
		}
		return false;
	}

	/*
	 * MÉTODOS A IMPLEMENTAR EN EL LABORATORIO 2
	 */
	
	//Removes the element at the first position in this list. 
    //Returns the removed element, or an exception if the list is empty
	public T removeFirst() throws NoSuchElementException {
		//TO DO
		return null;//CORREGIR SI ES NECESARIO
	}
	
	//Appends the specified element to the end of this list.
	public void addLast(T elem) {
		//TO DO
	}
	
	//Inserts the specified element in the correct position.
	//Pre: the elements of the list are ordered
	public void addOrdered(T elem) {
		//TO DO
	}
	
	
    //Returns the number of elements in this list. 	
	public int size(){
		//TO DO
		return -1; //CORREGIR SI ES NECESARIO
	}
	
	//Returns a string representation of this collection. The string representation
    // consists of a list of the collection's elements, enclosed in square 
    // brackets ("[]"). Adjacent elements are separated by the characters ", " 
    // (comma and space). 
	@Override
	public String toString() {
		//TO DO		
	
		return null;//CORREGIR SI ES NECESARIO
	}
	
	

	/*
	 * OTROS MÉTODOS (IMPLEMENTACIÓN OPCIONAL)
	 */
	
	/*
	
	//Returns the index of the first occurrence of the specified element in this
    // list, or -1 if this list does not contain the element.
	public int indexOf(Object o) {}
	
    //Removes the first occurrence of the specified element from this list, if it is 
    //present. Returns true if it has been removed, false otherwise.
	public boolean remove(Object o){}
	
	//Removes the element at the last position in this list. 
    //Returns the removed element, or throws an exception if list is empty
	public T removeLast() throws NoSuchElementException {}
	
	//Returns the first element in the list, or throws an exception if list is empty
	public T getFirst() throws NoSuchElementException {}
	
	//Returns the last element in the list, or throws an exception if list is empty
	public T getLast() throws NoSuchElementException {}
	
    //Replaces the element at the specified position in this list with the specified element. 
    // Returns the replaced element	
	public T set(int index, T elem) throws IndexOutOfBoundsException{}	
	
	
	*/


}
