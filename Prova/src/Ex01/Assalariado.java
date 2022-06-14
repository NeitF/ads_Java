package Ex01;

public class Assalariado extends Empregado{

	private double salarioMensal;
	
	public Assalariado(String nome, String sobrenome, String cpf,
			String dataNascimento, double salarioMensal) {
		super(nome, sobrenome, cpf, dataNascimento);
		this.salarioMensal = salarioMensal;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nSalário Mensal: " + this.getSalarioMensal();
	}
	
	@Override
	public double ganhos() {
		return this.getSalarioMensal();
	}

	public double getSalarioMensal() {
		return salarioMensal;
	}

	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
}
