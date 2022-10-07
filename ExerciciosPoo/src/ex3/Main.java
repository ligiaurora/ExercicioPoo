package ex3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ex3 n1 = new ex3();
		System.out.print("Informe o valor de primeiro número:");
		n1.setNum1(entrada.nextDouble());
		
		
		ex3 n2 = new ex3();
		System.out.print("Informe o valor de um segundo número: ");
		n2.setNum2(entrada.nextDouble());
		
		
		
		entrada.close();
		
	}
	
	
	
}
