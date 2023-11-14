package Main;

public class Condicionais {

	public static void main(String[] args) {
		
		int verdadeiro = 10;
		if(verdadeiro == 5) {
			System.out.println("Valor da variavel foi "+verdadeiro);
		}else if(verdadeiro == 11) {
			System.out.println("Valor da variavel foi "+verdadeiro);
		}else {
			System.out.println("Nenhum do dois, valor foi "+verdadeiro);
		}
		
		//switch case é uma estrutura de selecao
		String nomeDoMes = "setembro";
		switch(nomeDoMes) {
		case "maio":
			System.out.println(1);
			break;
		case "setembro":
			System.out.println(2);
			break;
		case "julho":
			System.out.println(3);
			break;
			default:
				System.out.println("Nao informou o mes...");
		}

	}

}
