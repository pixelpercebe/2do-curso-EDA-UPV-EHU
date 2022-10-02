package arraylist;

import auxiliares.Persona;

public class PruebaMiArrayList {

	public PruebaMiArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//ArrayList de Personas
		MiArrayList<Persona> lista = new MiArrayList<Persona>();

		//comprueba que la lista esta vacia
		System.out.println("Size: "+lista.size());
		System.out.println(lista.isEmpty());
		System.out.println("----------------------");
		//Crea elementos
		Persona persona1 = new Persona("Alberto");
		Persona persona2 = new Persona("Maria");
		Persona persona3 = new Persona("JOSE ANTONIO");

		//añade varios elementos
		lista.add(persona1);
		lista.add(persona2);
		lista.add(new Persona("Miren"));

		//comprueba si se han añadido los elementos correctamente
		System.out.println(lista);
		System.out.println("Size: "+lista.size());
		System.out.println(lista.isEmpty());
		System.out.println("----------------------");

		//comprobar la posicion en el arraylist de un elemento
		System.out.println(lista.indexOf(persona2));
		System.out.println(lista.indexOf(persona3));
		System.out.println("----------------------");
		//comprueba si la lista contiene un elemento
		System.out.println(lista.contains(persona1));
		System.out.println(lista.contains(persona2));
		System.out.println(lista.contains(persona3));
		System.out.println("----------------------");


		//elimina un elemento de la lista
		System.out.println(lista.remove(3));
		System.out.println(lista.remove(1));
		System.out.println(lista);
		System.out.println("Size: "+lista.size());

		//COMPLETAR CON PRUEBAS ADICIONALES
		

	}

}
