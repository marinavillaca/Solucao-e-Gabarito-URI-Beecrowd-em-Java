import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner (System.in);
		int tempo = entrada.nextInt();
		int velocidade = entrada.nextInt();
		double qt_litros = (tempo*velocidade)/12.0;
		
		System.out.printf("%.3f%n", qt_litros);
		
		entrada.close();
    }
}
