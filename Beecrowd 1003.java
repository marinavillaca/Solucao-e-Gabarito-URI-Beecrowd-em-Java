import java.io.IOException;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		int a, b;
		
		Scanner entrada = new Scanner (System.in);
		a = entrada.nextInt();
		b = entrada.nextInt();
		
		System.out.println("SOMA = " + (a+b));
		
		entrada.close();
 
    } 
}
