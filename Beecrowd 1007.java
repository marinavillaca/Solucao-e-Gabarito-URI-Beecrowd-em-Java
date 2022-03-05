import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		int a, b, c, d, dif;
		
		Scanner entrada = new Scanner (System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();

		dif = ((a*b)- (c*d));
		
		System.out.println("DIFERENCA = " + dif);
		
		entrada.close();
    }
}
