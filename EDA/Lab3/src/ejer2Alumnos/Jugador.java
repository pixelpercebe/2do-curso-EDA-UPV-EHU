package ejer2Alumnos;

public class Jugador {
	private String nombre;
	private int puntos;

	public Jugador(String nombre) {
		this.setNombre(nombre);
		this.setPuntos(10);
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString() {
		return this.nombre+"("+this.puntos+")";
	}


}
