import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		int number, num_ht;
		double val_h, salary; 
		Locale.setDefault(Locale.US);

		Scanner entrada = new Scanner (System.in);
		number = entrada.nextInt();
		num_ht = entrada.nextInt();
		val_h = entrada.nextDouble();

		salary = (num_ht*val_h);
		
		System.out.println ("NUMBER = " + number);
		System.out.printf ("SALARY = U$ %.2f%n", salary);
		
		entrada.close();
    }
}
