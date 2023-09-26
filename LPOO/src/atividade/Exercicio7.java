package atividade;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String[] args) {
	// Crie um objeto Scanner para ler a entrada do usuário
	Scanner scanner = new Scanner(System.in);
	// Número de 1 a 7 representando o dia da semana
	System.out.print("Digite um número de 1 a 7: ");
	int numeroDiaSemana = scanner.nextInt();
	// Switch-case para determinar o dia da semana
	String diaSemana;
	switch (numeroDiaSemana) {
	case 1:
	diaSemana = "Domingo";
	break;
	case 2:
	diaSemana = "Segunda-feira";
	break;
	case 3:
	diaSemana = "Terça-feira";
	break;
	case 4:
	diaSemana = "Quarta-feira";
	break;
	case 5:
	diaSemana = "Quinta-feira";
	break;
	case 6:
	diaSemana = "Sexta-feira";
	break;
	case 7:
	diaSemana = "Sábado";
	break;
	default:
	diaSemana = "Número inválido";
	break;
	}
	// Exiba o dia da semana correspondente
	System.out.println("O número " + numeroDiaSemana + " corresponde a "
	+ diaSemana);
	// Feche o objeto Scanner
	scanner.close();
	}
}