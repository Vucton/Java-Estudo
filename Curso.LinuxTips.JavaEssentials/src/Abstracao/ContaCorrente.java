package Abstracao;

public class ContaCorrente extends Conta {
	/*
	 * Qual a vantagem da classe abstrata? reduzir o nivel de codigo
	 * caso contrario eu teria que escrever esse metodos novamente..
	 * esse é um pilar fundamental para retilização de codigo
	 */

	@Override
	public void consultarSaldo() {
		System.out.println("Seu saldo e 1234");
		
	}

	@Override
	public void fazerPix() {
		System.out.println("digite o valor que vc deseja transferir...");
		
	}

}
