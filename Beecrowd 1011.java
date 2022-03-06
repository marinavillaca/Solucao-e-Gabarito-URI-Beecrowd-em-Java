import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		
		double raio, volume;
		Scanner entrada = new Scanner (System.in);
		raio = entrada.nextDouble();
		
		volume = (4/3.0)*3.14159*raio*raio*raio;
		
		System.out.printf("VOLUME = %.3f%n", volume);
    }
}
