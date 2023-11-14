package Polimorfismo.OverRide;

public class BotaoFogao extends Botao{
	@Override
	public void ligar() {
		System.out.println("Hora de esquentar essa comida");
	}
	@Override
	public void desligar() {
		super.desligar();
	}

}
