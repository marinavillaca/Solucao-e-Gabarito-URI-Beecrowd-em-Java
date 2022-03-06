import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		
		int nota100, nota50, nota20, nota10, nota5, nota2, nota1;
		
		nota100 = n/100;
		nota50 = (n - nota100*100)/50 ;
		nota20 = (n - nota100*100 - nota50*50)/20;
		nota10 = (n - nota100*100 - nota50*50 - nota20*20)/10;
		nota5 = (n - nota100*100 - nota50*50 - nota20*20 - nota10*10)/5;
		nota2 = (n - nota100*100 - nota50*50 - nota20*20 - nota10*10 - nota5*5)/2;
		nota1 = (n - nota100*100 - nota50*50 - nota20*20 - nota10*10 - nota5*5 - nota2*2)/1;
		
		System.out.println(n);
		System.out.println(nota100 + " nota(s) de R$ 100,00");
		System.out.println(nota50 + " nota(s) de R$ 50,00");
		System.out.println(nota20 + " nota(s) de R$ 20,00");
		System.out.println(nota10 + " nota(s) de R$ 10,00");
		System.out.println(nota5 + " nota(s) de R$ 5,00");
		System.out.println(nota2 + " nota(s) de R$ 2,00");
		System.out.println(nota1 + " nota(s) de R$ 1,00");
		
		entrada.close();	
 
    }
}
