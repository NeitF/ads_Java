package Ex01;

public class Fatura implements Pagavel{
	
	private String numero;
	private String Descricao;
	private double preco;
	
	@Override
	public double getValorPago(double extra, double ganho) {
		double result = this.preco;
		result += ganho + extra;
		return result;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
}
