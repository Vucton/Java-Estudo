package atividade;
import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		// Crie um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		// Solicite ao usuário que insira um número
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		// Use uma declaração if para verificar se o número é par ou ímpar
		if (numero % 2 == 0) {
		System.out.println("O número " + numero + " é par.");
		} else {
		System.out.println("O número " + numero + " é ímpar.");
		}
		// Feche o objeto Scanner
		scanner.close();
	}

}
