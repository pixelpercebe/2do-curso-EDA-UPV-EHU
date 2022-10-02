package mysinglylinkedlist;


import auxiliares.Persona;

public class PruebaMySinglyLinkedList {

	public PruebaMySinglyLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Lista de Personas
		MySinglyLinkedList<Persona> lista = new MySinglyLinkedList<Persona>();
		
		System.out.println("Size: "+lista.size());
		
		
		lista.addLast(new Persona("Miren"));
		
	
		System.out.println(lista.toString());		
		System.out.println("Size: "+lista.size());
		
		//COMPLETAR CON PRUEBAS ADICIONALES

	}

}
