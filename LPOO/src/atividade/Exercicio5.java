package atividade;
import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[] args) {
		// Crie um objeto Scanner para ler a entrada do usuário
		Scanner scanner = new Scanner(System.in);
		// Solicite ao usuário que insira um número
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		// Use uma declaração if para verificar se o número é positivo ou negativo
		if (numero > 0) {
		System.out.println("O número " + numero + " é positivo.");
		} else if (numero < 0) {
		System.out.println("O número " + numero + " é negativo.");
		} else {
		System.out.println("O número é zero.");
		}
		// Feche o objeto Scanner
		scanner.close();
		}
		
	}

