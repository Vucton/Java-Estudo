package Encapsulamento;

public class Cachorro {
	//private so acessa dentro da classe
	private Double peso;
	private Integer idade;
	
	//Todo o projeto tem acesso
	public Double pesoPublic;
	public Integer idadePublic;
	
	//Acesso so dentro do meu pacote
	protected Double pesoProtected;
	protected Integer idadeProctected;
	
	public String latir() {
		return "auau";
	}
	protected String dormir() {
		return "zzz";
	}
	private String comer() {
		return "Hora da Racao...";
		
	}
	public String getComer() {
		return comer();
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	

}
