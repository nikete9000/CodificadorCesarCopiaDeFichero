import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejercicio8 {

	public static void main(String[] args) {
		try {
			ProcessBuilder pb = new ProcessBuilder("CMD","/C","DIR");
			for (int i = 1; i < pb.command().size(); i++) {
				System.out.println(pb.command().get(i));
			}
			System.out.println(pb.environment());
			System.out.println(pb.environment().get("LOCALAPPDATA"));
			System.out.println(pb.environment().get("JAVA_HOME"));
			
			pb.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			ProcessBuilder pb = new ProcessBuilder("CMD","/?","DIR");
			for (int i = 1; i < pb.command().size(); i++) {
				System.out.println(pb.command().get(i));
			}
			Process p = pb.start();
			try (BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()))){
				String line;
				while ((line=bfr.readLine())!=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				
			}
		} catch (IOException e) {
			
		}
	}

}
