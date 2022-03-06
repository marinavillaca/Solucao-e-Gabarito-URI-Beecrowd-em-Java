import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner(System.in);
		int x = entrada.nextInt();
		double y = entrada.nextDouble();
		
		System.out.printf("%.3f", x/y);
		System.out.printf(" km/l%n");

		entrada.close();
    }
}
