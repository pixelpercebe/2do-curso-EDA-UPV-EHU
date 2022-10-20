package puertoAlumnos;

public class Movimiento {
	
	private char tipo; //D: descarga, C: carga
	private String contenedor;//Código del contenedor
	private int parcela; //Parcela donde se deja o de donde se coge el contenedor

	public Movimiento(char tipo, String contenedor, int parcela) {
		this.tipo = tipo;
		this.contenedor = contenedor;
		this.parcela = parcela;
	}
	
	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getContenedor() {
		return contenedor;
	}

	public void setContenedor(String contenedor) {
		this.contenedor = contenedor;
	}

	public int getParcela() {
		return parcela;
	}

	public void setParcela(int parcela) {
		this.parcela = parcela;
	}



}
