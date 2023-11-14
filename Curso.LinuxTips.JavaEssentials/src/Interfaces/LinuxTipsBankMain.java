package Interfaces;

public class LinuxTipsBankMain {
	public static void main(String[] args) {
		System.out.println("seja bem vindo ao Linux tips Bank");
		ContaCorrente joao = new ContaCorrente();
		joao.consultarSaldo();
		joao.fazerPix();
			
		ContaPoupanca joao1 = new ContaPoupanca();
		joao1.consultarSaldo();
		joao1.fazerPix();
	}

}
