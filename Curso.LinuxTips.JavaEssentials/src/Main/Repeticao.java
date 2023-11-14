package Main;



public class Repeticao {
	public static void main(String[] args) {
		//for
		for(int i=1; i <=10; i++) {
			;
			System.out.println("Nessa repeticao 'i' esta valendo: "+i);
		}
		
		/*while
		Scanner sc = new Scanner(System.in);
		var valorSecreto = 7;
		
		while(valorSecreto!=123) {
			System.out.println("Adivinhe o valor secreto: ");			
			valorSecreto = sc.nextInt();
			if(valorSecreto == 123) {
				System.out.println("PARABENS!!! Valor Secreto:"+valorSecreto);
			}else {
				System.out.println("Nao e esse o valor Secreto... tente novamente");
			}
		}*/
		
		//do - while
		int valor = 23;
		do {
			System.out.println(valor);
			valor++;
			
		}while(valor <= 30);
			
		
	}

}
