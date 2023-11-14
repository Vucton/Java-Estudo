package OrientacaoObjetos;



public class Objeto {
	/*Nessa primeira aula aprendemos a criar os primeiros objetos e instacilos
	 * e setar os nossos primeiros atributos atraves dos metodos get set
	 * que são os metodos de acessos a esses atributos de forma encapsulada e 
	 * segura.
	 */

	public static void main(String[] args) {
		Estudante kamilaCode = new Estudante();
		
		kamilaCode.setNome("Kamila");
		kamilaCode.setStack("Java e Spring");
		
		System.out.println(kamilaCode.getNome());
		System.out.println(kamilaCode.getStack());
		
		kamilaCode.estudar();
		kamilaCode.dormir();
		
		
	}

}
