package Polimorfismo.OverRide;

public class BotaoTV extends Botao{
	
	@Override
	public void ligar() {
		System.out.println("Ligando tv");
	}
	@Override
	public void desligar() {
		System.out.println("Chega de tv por hoje vai descancar...");
	}

}
