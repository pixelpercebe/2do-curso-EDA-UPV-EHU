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
	//Ejemplo: si la lista contiene 'hola', replicarVocales(2) la convertirá en 'hooolaaa'
	public void replicarVocales(int veces) {
		//TODO
		char capitalLetter;
		Node<Character> current = first;
		while ((current != null)) {
			capitalLetter = (Character.toUpperCase(current.info));
			if (capitalLetter == 'A' || capitalLetter == 'E' || capitalLetter == 'I' || capitalLetter == 'O' || capitalLetter == 'U') {
				for (int i = 0; i < veces; i++) {
					Node<Character> newNode = new Node<>(current.info);
					newNode.info = current.info;
					newNode.prev = current;
					if (current != last)
					{
						newNode.next = current.next;
						current.next.prev = newNode;
						current.next = newNode;
						current = current.next;
					}
					else
					{
						current.next = newNode;
						current = newNode;
						last = newNode;
					}
				}
				current = current.next;
			}
			 else
				current = current.next;
		}
	}
	
	
	public void entrecomillar() {
		//TODO
		Node<Character> comillas1 = new Node<>('"');
		Node<Character> comillas2 = new Node<>('"');

		comillas1.next = first;
		first.prev = comillas1;
		first = comillas1;

		comillas2.prev = last;
		last.next = comillas2;
		last = comillas2;
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
