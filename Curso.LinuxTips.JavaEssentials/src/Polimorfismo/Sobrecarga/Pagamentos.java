package Polimorfismo.Sobrecarga;

public class Pagamentos {
	
	//pagamento a vista
	public Double pagamento(Double valor) {
		return valor;
	}
	
	//calcula o valor das parcelas
	public Integer pagamentos(Integer valorInteger, Integer parcelas) {
		return valorInteger/ parcelas;
	}
	
	//juros
	public long pagamentos(Integer valorInteger, Integer parcelas, long juros) {
		return (valorInteger/parcelas)+juros;
	}
}
