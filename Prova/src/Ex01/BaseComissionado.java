package Ex01;

public class BaseComissionado extends Comissionado{

	private double salarioBase;
	
	public BaseComissionado(String nome, String sobrenome, String cpf, 
			String dataNascimento, double percComissao, double salarioBase) {
		super(nome, sobrenome, cpf, dataNascimento, percComissao);
		this.salarioBase = salarioBase + (salarioBase * 0.10);
	}

	@Override
	public String toString() {
		return super.toString() + "\nSalário base: " + this.getSalarioBase();
	}
	
	@Override
	public double ganhos() {
		return (this.getVendasMensal() * (this.getPercComissao()/100)) +
				this.getSalarioBase();
	}
	
	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}


	

}
