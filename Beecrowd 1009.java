import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);

		double salary, sales, total;
		String name;

		Scanner entrada = new Scanner (System.in);
		
		name = entrada.next();
		salary = entrada.nextDouble();
		sales = entrada.nextDouble();

		total = (salary + (sales*0.15));
		
		System.out.printf ("TOTAL = R$ %.2f%n", total);
		
		entrada.close();
 
    }
 
}
