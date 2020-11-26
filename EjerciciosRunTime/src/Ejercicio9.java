import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio9 {

	public static void main(String[] args) {
		ProcessBuilder pb = new ProcessBuilder("PowerShell","DIRR");
		try {
			Process p= pb.start();
			int status = p.waitFor();
			System.out.println("La salida ha sido "+status);
			if (status==0) {
				try (BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getInputStream()));
						BufferedWriter bfw = new BufferedWriter(new FileWriter("salida_ejercicio9.txt"))){
					String line;
					while ((line=bfr.readLine())!=null) {
						bfw.write(line);
						bfw.newLine();
					}
				} catch (IOException e) {
					e.getStackTrace();
				}
			}
			else {
				try (BufferedReader bfr = new BufferedReader(new InputStreamReader(p.getErrorStream()));
						BufferedWriter bfw = new BufferedWriter(new FileWriter("log_ejercicio9.txt"))){
					String line;
					while ((line=bfr.readLine())!=null) {
						bfw.write(line);
						bfw.newLine();
					}
				} catch (IOException e) {
					e.getStackTrace();
				}
			}
			
		} catch (IOException | InterruptedException e1) {
			e1.printStackTrace();
		}
		

	}

}
