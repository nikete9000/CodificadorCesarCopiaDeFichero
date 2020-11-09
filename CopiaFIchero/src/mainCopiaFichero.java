import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mainCopiaFichero {

	public static void main(String[] args) {
		try (BufferedReader bfr = new BufferedReader(new FileReader("ficheros\\fichero_a_cifrar.txt"));
				BufferedWriter bfw = new BufferedWriter(new FileWriter("ficheros\\fichero_copia.txt"))){
			String linea;
			while ((linea=bfr.readLine()) !=null) {
				bfw.write(codificador(linea));
				bfw.newLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	private static String codificador(String linea) {
		StringBuilder codificado=new StringBuilder();
		for (int i = 0; i < linea.length(); i++) {
			switch (linea.charAt(i)) {
			case 'A': {
				codificado.append("4");
			}
			case 'I': {
				codificado.append("1");
			}
			case 'Z': {
				codificado.append("2");
			}
			case 'E': {
				codificado.append("3");
			}
			case 'S': {
				codificado.append("5");
			}
			case 'G': {
				codificado.append("6");
			}
			case 'T': {
				codificado.append("7");
			}
			case 'B': {
				codificado.append("8");
			}
			case 'P': {
				codificado.append("9");
			}
			case 'O': {
				codificado.append("0");
			}
			default:
				codificado.append(linea.charAt(i));
			}
		}
		return codificado.toString();
	}

}
