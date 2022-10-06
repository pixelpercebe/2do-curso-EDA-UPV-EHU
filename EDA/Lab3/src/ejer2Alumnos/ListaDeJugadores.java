package ejer2Alumnos;

import java.util.Random;
import java.util.Scanner;

public class ListaDeJugadores {
	private Nodo<Jugador> first;
	private Random rnd;

	public ListaDeJugadores() {	
	    rnd = new Random(System.currentTimeMillis());
	}

	
	
	//Simula el desarrollo de la partida siguiendo la descripción del enunciado
	public void jugar() {
		
		if (first != null) {
			Scanner sc = new Scanner(System.in);
			
			Nodo<Jugador> actual = first;
			while (first != first.next) {//mientras haya más de un jugador
				this.print();
				System.out.println("PULSA RETURN PARA TIRAR EL DADO:");
				sc.nextLine();
				
				int puntosRestar = lanzarDado();//nº de puntos que hay que restar al jugador actual
				
				//TO DO

			}
			this.print();
			System.out.println(first.info.getNombre() + " ha ganado la partida.");
			sc.close();
		}
		
	}
	
	
	//MÉTODOS AUXILIARES PARA PRUEBAS
	
	//Lanza el dado y devuelve el nº que ha salido
	public int lanzarDado() {
		return (rnd.nextInt(6) + 1);
	}
	
	//Imprime la lista de jugadores
	public void print() {
		if (first != null) {
			System.out.print("ESTADO ACTUAL: ");
			Nodo<Jugador> actual = first;
			while (actual.next != first) {
				System.out.print(actual.info.toString() + " ");
				actual = actual.next;
			}
			System.out.println(actual.info.toString() + " ");
		}
	}
	
	//Añade al jugador j en la primera posición de la lista
	public void anadirJugador(Jugador j) {
		// Lo pone como primero de la lista
		Nodo<Jugador> newNode = new Nodo<Jugador>(j);
		if (first == null) {
			first = newNode;
			newNode.next = newNode;
			newNode.prev = newNode;
		} else {
			newNode.next = first;
			newNode.prev = first.prev;
			first.prev = newNode;
			newNode.prev.next = newNode;
			first = newNode;

		}
	}


}
