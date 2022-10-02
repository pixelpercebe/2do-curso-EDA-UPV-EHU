package auxiliares;

public class Persona implements Comparable<Persona>{
	String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public boolean equals(Object obj) 
	  {
	    if (this == obj) return true;
	    if (obj == null) return false;
	    if (this.getClass() != obj.getClass()) return false;
	    Persona that = (Persona) obj;
	    return this.nombre.equals(that.nombre);
	  }	
	

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.nombre);
	}
	
	@Override
	public String toString() {
		return this.nombre;
	}

}
