package Ex01;

public abstract class Empregado implements Pagavel {

	private String nome;
	private String sobrenome;
	private String cpf;
	private String dataNascimento;
	
	public Empregado(String nome, String sobrenome, String cpf, String dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.getNome() + "\nSobrenome: " + this.getSobrenome() +
				"\nCPF: " + this.getCpf() + "\nData de nascimento: " + this.getDataNascimento();
	}
	
	public abstract double ganhos();
	
	@Override
	public double getValorPago(double extra, double ganho) {
		return ganho + extra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
}
