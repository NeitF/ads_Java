package Ex01;

public class Comissionado extends Empregado{

	private double vendasMensal;
	private double percComissao;
	
	public Comissionado(String nome, String sobrenome, String cpf, 
			String dataNascimento, double percComissao) {
		super(nome, sobrenome, cpf, dataNascimento);
		this.percComissao = percComissao;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nVendas mensal: " + this.getVendasMensal() +
		"\nPercentual Comissão: " + this.getPercComissao();
	}
	
	@Override
	public double ganhos() {
		return this.getVendasMensal() * (this.getPercComissao()/100);
	}

	public double getVendasMensal() {
		return vendasMensal;
	}

	public void setVendasMensal(double vendasMensal) {
		this.vendasMensal = vendasMensal;
	}

	public double getPercComissao() {
		return percComissao;
	}

	public void setPercComissao(double percComissao) {
		this.percComissao = percComissao;
	}

}
