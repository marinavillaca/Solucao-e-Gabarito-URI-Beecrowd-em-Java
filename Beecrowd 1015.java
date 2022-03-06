import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		double x1 = entrada.nextDouble();
		double y1 = entrada.nextDouble();
		double x2 = entrada.nextDouble();
		double y2 = entrada.nextDouble();
		double distancia = Math.sqrt( (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		System.out.printf("%.4f%n", distancia);

		entrada.close();
    }
}
