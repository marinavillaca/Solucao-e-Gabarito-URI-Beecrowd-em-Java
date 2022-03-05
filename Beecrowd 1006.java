import java.io.IOException;
import java.util.Scanner;
import java.util.Locale; 

public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
 
		double a, b, c, media;

		Scanner entrada = new Scanner (System.in);
		a = entrada.nextDouble();
		b = entrada.nextDouble();
		c = entrada.nextDouble();

		media = ((a*2) + (b*3) + (c*5))/10;
		
		System.out.printf("MEDIA = %.1f%n", media);
		
		entrada.close();
    }
}
