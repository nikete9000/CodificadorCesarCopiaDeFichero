import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String command = "CMD /C DIR";
		Process p = null;
		try {
			p = rt.exec(command);
			try (BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()))){
				String line;
				while((line=bfr.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
	}
}
