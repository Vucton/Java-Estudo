package Encapsulamento;

public class Encapsulamento {
/* 						--- ENCAPSULAMENTO ---
 * consister em esconder certas caracteristicas do objetos, para que assim 
 * consigamos proteger a integridade do nosso objeto e restrigir o acesso.
 * seguintes niveis de acesso:
 * 
 *e isso vale tambem para metodos 
 *
 */
	public static void main(String[] args) {
		Cachorro dog = new Cachorro();
		System.out.println(dog.dormir());
		
		
		System.out.println(dog.getComer());
	}

}
