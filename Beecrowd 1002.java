import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
     	double raio, area;
    	Scanner entrada = new Scanner (System.in);
    	raio = entrada.nextDouble();
    	
    	area = 3.14159*raio*raio;
    	
    	System.out.printf ("A=%.4f%n", area);
    	
    	entrada.close();
 
    } 
}
