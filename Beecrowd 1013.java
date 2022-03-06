import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner (System.in);
		int a = entrada.nextInt();
		int b = entrada.nextInt();
		int c = entrada.nextInt();
		
		int maiorAB, maiorXC;
		
		maiorAB = (a+b + Math.abs(a-b))/2;
		maiorXC = (maiorAB + c + Math.abs(maiorAB-c))/2;
		
		System.out.println(maiorXC + " eh o maior");
		
		entrada.close();
    }
}
