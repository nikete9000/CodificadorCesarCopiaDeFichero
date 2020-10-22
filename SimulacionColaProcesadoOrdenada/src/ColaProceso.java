import java.util.LinkedList;
import java.util.Queue;

public abstract class ColaProceso {
	public static LinkedList<Proceso> cola;
	static {
		cola = new LinkedList<Proceso>();
	}
	private static void get() throws InterruptedException{
		long tiempoInicio=System.currentTimeMillis();
		long tiempoFin;
		Proceso p=cola.getFirst();
		System.out.println("Procesando proceso "+p.getNombre());
		Thread.sleep(p.getDuracion());
		tiempoFin=System.currentTimeMillis();
		System.out.println("Duracion: "+(tiempoFin-tiempoInicio));
		System.out.println("Termiando proceso "+p.getNombre());
		cola.removeFirst();

	}
	public static void put(Proceso process) {
		cola.add(process);
	}
	public static void sirve() throws InterruptedException {
		get();
	}
}
