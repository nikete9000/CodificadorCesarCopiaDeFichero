import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mainCopiaFichero {

	public static void main(String[] args) {
		try (BufferedReader bfr = new BufferedReader(new FileReader("ficheros\\fichero_a_cifrar.txt"));
				BufferedWriter bfw = new BufferedWriter(new FileWriter("ficheros\\fichero_copia.txt"))){
			String linea=bfr.readLine();
			while (linea!=null) {
				bfw.write(linea);
				linea=bfr.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
