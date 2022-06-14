package Ex01;

public class Horista extends Empregado{

	private double valorHora;
	private double horasTrab;
	
	public Horista(String nome, String sobrenome, String cpf, String dataNascimento,
			double valorHora) {
		super(nome, sobrenome, cpf, dataNascimento);
		this.valorHora = valorHora;
	}
	
	@Override 
	public String toString() {
		return super.toString() + "\nValor da Hora: " + this.getValorHora() +
				"\nHoras trabalhadas: " + this.getHorasTrab();
	}
	
	@Override
	public double ganhos() {
		double extra = 0;
		if(this.getHorasTrab() > 160) {
			extra = this.getHorasTrab() - 160;
		}
		
		return (this.getHorasTrab() - extra) * this.getValorHora() + 
				((this.getValorHora() * 1.5) * extra);
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public double getHorasTrab() {
		return horasTrab;
	}

	public void setHorasTrab(double horasTrab) {
		this.horasTrab = horasTrab;
	}

}
