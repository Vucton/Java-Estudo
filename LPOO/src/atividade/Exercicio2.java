package atividade;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = leitor.nextLine();
		System.out.println("Nome inserido: "+nome);
		
		leitor.close();

	}

}
