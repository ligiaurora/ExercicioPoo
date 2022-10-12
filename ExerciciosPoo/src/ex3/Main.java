package ex3;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		ex3 soma = new ex3(2,2);
		ex3 subtracao = new ex3(535,45);
		ex3 multiplicacao = new ex3(896,9440);
		ex3 divisao = new ex3(985,45);
		
		System.out.println("O valor da Soma:" + soma.getSoma());
		System.out.println("O valor da Subtracao:" + subtracao.getSubtracao());
		System.out.println("O valor da Multiplicacao:" + multiplicacao.getMultiplicacao());
		System.out.println("O valor da Divisao:" + divisao.getDivisao());
		entrada.close();
		
	}	
}
