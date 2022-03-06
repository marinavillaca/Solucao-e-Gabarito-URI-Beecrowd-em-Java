import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner(System.in);
		int n = entrada.nextInt();
		int ano, mes, dia;
		
		ano = n/365;
		mes = ( n - 365*ano)/30;
		dia = (n - 365*ano - 30*mes);
		
		System.out.println(ano + " ano(s)\n" + mes + " mes(es)\n" + dia + " dia(s)");
		
		entrada.close();	
    }
}
