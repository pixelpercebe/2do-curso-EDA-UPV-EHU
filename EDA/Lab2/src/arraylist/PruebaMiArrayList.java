package arraylist;

import auxiliares.Persona;

public class PruebaMiArrayList {

	public PruebaMiArrayList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//ArrayList de Personas
		MiArrayList<Persona> lista = new MiArrayList<Persona>();
		
		System.out.println("Size: "+lista.size());
		
		//añade un elemento
		lista.add(new Persona("Miren"));
		Persona persona1 = new Persona("Alberto");
		Persona persona2 = new Persona("Maria");

		lista.add(persona1);
		lista.add(persona2);

		System.out.println(lista);
		System.out.println("Size: "+lista.size());
		System.out.println(lista.indexOf(persona2));
		
		//COMPLETAR CON PRUEBAS ADICIONALES
		

	}

}
