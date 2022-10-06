package ejer3Alumnos;

public class PruebaMyOrderedLinkedList {

	public PruebaMyOrderedLinkedList() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//Lista de strings
		MyOrderedLinkedList<String> lista = new MyOrderedLinkedList<String>();
		System.out.println("Lista inicial:");
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		System.out.println("Añado ojo:");
		lista.addOrdered("ojo");
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		
		System.out.println("Elimino primera aparición de ojo:");
		System.out.println("Elemento eliminado: "+lista.removeFirstAppearance("ojo"));
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");

		System.out.println("Añado ojo:");
		lista.addOrdered("ojo");
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		System.out.println("Añado casa:");
		lista.addOrdered("casa");
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		
		System.out.println("Añado parque:");
		lista.addOrdered("parque");
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		
		System.out.println("Añado ojo:");
		lista.addOrdered("ojo");
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		System.out.println("Elimino primera aparición de ojo:");
		System.out.println("Elemento eliminado: "+lista.removeFirstAppearance("ojo"));
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		System.out.println("Elimino primera aparición de ojo:");
		System.out.println("Elemento eliminado: "+lista.removeFirstAppearance("ojo"));
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		System.out.println("Elimino primera aparición de casa:");
		System.out.println("Elemento eliminado: "+lista.removeFirstAppearance("casa"));
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
		
		System.out.println("Elimino primera aparición de parque:");
		System.out.println("Elemento eliminado: "+lista.removeFirstAppearance("parque"));
		System.out.println("Al derecho: "+lista.toString());
		System.out.println("Al reves: "+lista.toStringPeroAlReves()+"\n");
				


	}

}
