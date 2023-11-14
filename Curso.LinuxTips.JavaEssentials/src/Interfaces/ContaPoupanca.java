package Interfaces;

public class ContaPoupanca implements Conta{

	@Override
	public void consultarSaldo() {
		System.out.println("Seu saldo e 888");
		
	}

	@Override
	public void fazerPix() {
		System.out.println("Negado");
		
	}

}
