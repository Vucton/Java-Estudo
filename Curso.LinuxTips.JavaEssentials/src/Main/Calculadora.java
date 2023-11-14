package Main;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		float valor1, valor2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite primeiro valor: ");
		valor1 = leitor.nextFloat();
		
		System.out.println("Digite segundo valor: ");
		valor2 = leitor.nextFloat();
		
		System.out.println("opcoes de operaçao: somar'+' | subtrair'-' | dividir'/' |ou tirar o modulo'%'");
		String operacao = leitor.next();
		if(operacao.equals("+")) {
			valor1+=valor2;
			System.out.println("Resultado da soma: "+valor1);
		}else if(operacao.equals("-")) {
			valor1-=valor2;
			System.out.println("Resultado da subtracao: "+valor1);
		}else if(operacao.equals("/")) {
			valor1/=valor2;
			System.out.println("Resultado da divisao: "+valor1);
		}else if(operacao.equals("%")) {
			valor1%=valor2;
			System.out.println("Resultado do resto do Modulo: "+valor1);
		}
		
		leitor.close();
	}

}
