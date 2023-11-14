package Abstracao;

public class ContaPoupanca extends Conta {

	@Override
	public void consultarSaldo() {
		// TODO Auto-generated method stub
		System.out.println("Seu saldo e 752.3");
	}

	@Override
	public void fazerPix() {
		System.out.println("Nao funciona");
		
	}

}
