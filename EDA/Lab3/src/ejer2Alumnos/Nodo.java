package ejer2Alumnos;

public class Nodo<T> {
	T info;
	Nodo<T> next;
	Nodo<T> prev;

	public Nodo(T info) {
		this.info = info;
	}
}
