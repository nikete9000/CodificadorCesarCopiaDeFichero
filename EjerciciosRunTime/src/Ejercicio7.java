import java.io.IOException;

public class Ejercicio7 {

	public static void main(String[] args) {
		try {
			ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
			pb.start();
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}

	}

}
