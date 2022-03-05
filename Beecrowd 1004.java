import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		int a, b, prod;
		
		Scanner entrada = new Scanner (System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		prod = a*b;
		
		System.out.println("PROD = " + prod);
		
		entrada.close();
    }
}
