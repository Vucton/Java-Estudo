package Polimorfismo.OverRide;

public class Main {
	public static void main(String[] args) {
		BotaoTV sbt = new BotaoTV();
		sbt.ligar();
		sbt.desligar();
		
		BotaoFogao eletrico = new BotaoFogao ();
		eletrico.ligar();
		eletrico.desligar();
		
	}

}
