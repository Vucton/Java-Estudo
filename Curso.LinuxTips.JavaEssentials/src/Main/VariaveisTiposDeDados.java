package Main;

public class VariaveisTiposDeDados {

	public static void main(String[] args) {
		
		//Bytes so recebe valores inteiros ou negativos
		//requer 8 bits, maximo 127 e minimo -128
		byte meuByte = 127;//raramente utilizado
		System.out.println("Meu byte "+meuByte);
		
		int idade = 25;//muito utilizado
		System.out.println("Meu int "+idade);
		
		//64 bits
		long meuLong = 10L;//de vez enquando utilizado
		System.out.println("Meu long "+meuLong);
		
		//dupla precisao, 64 bits
		double meuDouble = 1500.00;//muito utilizado
		System.out.println("Meu Double "+meuDouble);
		
		//mais leve que o double, precisao simples, 32 bits
		float salario = 1320f;
		System.out.println("Meu Float "+salario);
		
		//16 bits, um unicode
		char letra= 'a';
		System.out.println("Meu char "+letra);
		
		//1 bit
		boolean javaElegal = true;
		System.out.println("Meu boolean "+javaElegal);
	}

}
