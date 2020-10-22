
public class Proceso implements Comparable<Proceso>{
	private int duracion;
	private String nombre;
	
	public Proceso(int duracion, String nombre) {
		this.duracion=duracion;
		this.nombre=nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public int compareTo(Proceso otro) {
		return Integer.compare(this.duracion, otro.duracion);
	}
}
