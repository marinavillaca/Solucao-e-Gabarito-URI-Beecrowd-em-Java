import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner (System.in);
		int n = entrada.nextInt();
		
		int horas,minutos, segundos;
		horas = (n/3600);
		minutos = (n - (horas*3600))/60; 
		segundos = n - (horas*3600) - (minutos*60);
		
		System.out.println(horas + (":") + minutos + (":") + segundos);
		
		entrada.close();
    }
}
