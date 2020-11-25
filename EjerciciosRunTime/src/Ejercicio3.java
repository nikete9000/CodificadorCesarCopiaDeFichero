import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio3 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String command = "CMD /C DIR";
		Process p = null;
		try {
			p = rt.exec(command);
			try (BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
					BufferedWriter bfw = new BufferedWriter(new FileWriter("fichero.txt"))){
				String line;
				while((line=bfr.readLine())!=null) {
					bfw.write(line);
					bfw.newLine();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}		
		
	}

}
