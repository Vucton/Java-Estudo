package Main;

public class Operadores {
	public static void main(String[] args) {
		
		//operador de atribuicao
		int idade = 25;
		System.out.println("Valor atribuido a variavel idade "+idade);
		
		//operadores matematicos
		int soma = idade + 5;
		System.out.println("Resultado da variavel soma "+soma);
		int multiplicacao = soma *2;
		System.out.println("Resultado da variavel multiplicacao "+multiplicacao);
		int divisao = multiplicacao /2;
		System.out.println("Resultado da divisao "+divisao);
		int modulo = divisao %4;
		System.out.println("Resultado do resto da divisao "+modulo);
		int subtracao = modulo - 2;
		System.out.println("Resultado da subtracao "+subtracao);
		
		//incremento e decremento
		int incremento = 15;
		incremento++;
		System.out.println("Resultado depois do incremento "+incremento);
		incremento--;
		System.out.println("Resultado depois do decremento "+incremento);
		
		//operadores de igualdade
		double valor1 = 23.33;
		double valor2 = 44.21;
		
		if(valor1 == valor2) {
			System.out.println("Valores soa iguais"+valor1+ valor2);
		}else {
			System.out.println("Valores sao diferentes valor 1: "+valor1+",| valor 2: "+valor2);
		}
		
		//operadores relacionais
		int pvalor= 123;
		int svalor= 1234;
		if(pvalor > svalor) {
			System.out.println("Venceu >");
		}if(pvalor >= svalor) {
			System.out.println("Venceu >=");
		}if(pvalor < svalor) {
			System.out.println("perdeu <");
		}if(pvalor <= svalor) {
			System.out.println("perdeu <=");
		}
		
		//operadores logicos
		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro && falso);
		
	}

}
