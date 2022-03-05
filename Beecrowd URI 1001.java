import java.util.Scanner;
public class Main{
 
	public static void main(String[] args){
    
        int a, b;
        int x;
        
        Scanner entrada = new Scanner (System.in);
        a = entrada.nextInt();
        b = entrada.nextInt();
	x = a + b;
        
        System.out.println("X = " + x);
    }
}
