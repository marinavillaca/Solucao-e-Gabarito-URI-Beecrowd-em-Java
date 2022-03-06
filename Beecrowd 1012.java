import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;
 
public class Main {
 
    public static void main(String[] args) throws IOException {

		Locale.setDefault(Locale.US);
		
		Scanner entrada = new Scanner (System.in);
		double a = entrada.nextDouble();
		double b = entrada.nextDouble();
		double c = entrada.nextDouble();
		
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		triangulo = (a*c)/2.0 ;
		circulo = 3.14159*c*c;
		trapezio = ((a+b)*c)/2.0; 
		quadrado = b*b;
		retangulo = a*b;
		 
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n",circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		entrada.close();
    }
}
