import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		double a, b, media;
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner (System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();

		media = ( (a*3.5) + (b*7.5)) / 11.0;
		
		System.out.printf("MEDIA = %.5f %n", media);
		
		entrada.close();
    }
}
