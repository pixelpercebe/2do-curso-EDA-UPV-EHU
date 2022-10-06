package ejer1Alumnos;


public class Palabra {
	private Node<Character> first;
	private Node<Character> last;
	
	
	//Constructora: dado un string lo convierte en lista doblemente encadenada	
	public Palabra(String valores) {
		if (valores.length() > 0) {
			Node<Character> newNode = new Node<Character>(valores.charAt(0));
			first = newNode;
			last = newNode;
			for (int i = 1; i < valores.length(); i++) {
				newNode = new Node<Character>(valores.charAt(i));
				last.next = newNode;
				newNode.prev = last;
				last = last.next;
			}
		}
	}
	
	
	//METODOS A COMPLETAR EN EL LAB 3: replicarVocales, entrecomillar
	
	//Hace tantas copias de las vocales como indica 'veces'
	//Ejemplo: si la lista contiene 'hola', replicarVocales(2) la convertir� en 'hooolaaa'
	public void replicarVocales(int veces) {
		//TO DO
		
		
		
	}
	
	
	public void entrecomillar() {
		//TO DO
		
	}
	
	
	//METODOS AUXILIARES PARA PRUEBAS
	
	public void imprimirAlDerecho() {
		Node<Character> current = first;
		System.out.print("[");
		while(current!=null) {
			System.out.print(current.info+" ");
			current = current.next;
		}
		System.out.println("]");
	}
	
	public void imprimirAlReves() {
		Node<Character> current = last;
		System.out.print("[");
		while(current!=null) {
			System.out.print(current.info+" ");
			current = current.prev;
		}
		System.out.println("]");
	}


}
