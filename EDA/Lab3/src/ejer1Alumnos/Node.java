package ejer1Alumnos;


public class Node<T> {

	T info;
	Node<T> next;
	Node<T> prev;

	public Node(T data) {
		this.info = data;
	}	

}
