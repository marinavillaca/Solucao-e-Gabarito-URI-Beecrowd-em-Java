import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
		Scanner entrada = new Scanner (System.in);
		int num = entrada.nextInt();
		
		System.out.println(num*2 + " minutos");
		
		entrada.close();
    }
}
