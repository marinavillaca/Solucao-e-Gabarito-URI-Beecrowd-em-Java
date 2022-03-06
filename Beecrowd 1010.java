import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;   

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Locale.setDefault(Locale.US);

		int code1, num1,code2, num2;
		double price1, price2, valor;
		
		Scanner entrada = new Scanner(System.in);
		
		code1 = entrada.nextInt();
		num1 = entrada.nextInt();
		price1 = entrada.nextDouble();
		code2 = entrada.nextInt();
		num2 = entrada.nextInt();
		price2 = entrada.nextDouble();
		
		valor = (num1*price1) + (num2*price2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valor);
		
		entrada.close();
    }
}
