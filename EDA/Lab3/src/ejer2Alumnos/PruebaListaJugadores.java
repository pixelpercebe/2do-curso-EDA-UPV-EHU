package ejer2Alumnos;

public class PruebaListaJugadores {

	public PruebaListaJugadores() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//modificar para efectuar las pruebas que consideréis oportunas
		ListaDeJugadores p = new ListaDeJugadores();
		p.anadirJugador(new Jugador("Elena"));
		p.anadirJugador(new Jugador("Jon"));
		p.anadirJugador(new Jugador("Eva"));
		p.anadirJugador(new Jugador("Asier"));
		p.anadirJugador(new Jugador("Unai"));
		p.jugar();

	}

}
