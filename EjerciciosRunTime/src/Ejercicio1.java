import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Runtime rt = Runtime.getRuntime();
		String command = "C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe";
		List<String> listaCommand = new ArrayList<String>();
		listaCommand.add(command);
		listaCommand.add("172.24.112.1:8080");
		//listaCommand.add("8080");
		try {
			ProcessBuilder pb = new ProcessBuilder(listaCommand);
			pb.start();
		} catch (Exception e) {
			e.getStackTrace();
		}
		/*
		try {
			rt.exec(command);
		} catch (Exception e) {
			
		}
		*/

	}

}
