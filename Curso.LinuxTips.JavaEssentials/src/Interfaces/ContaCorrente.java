package Interfaces;

public class ContaCorrente implements Conta{

	@Override
	public void consultarSaldo() {
		System.out.println("Seu saldo e 234");
		
	}

	@Override
	public void fazerPix() {
		System.out.println("digite o valor a ser transferido");
		
	}

}
