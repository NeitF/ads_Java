package exercicio01;

public class Aluno {
	
	private double[] notas = new double[3];
	private String nome;
	private int matricula;
	
	public Aluno(double[] notas, String nome, int matricula) {
		this.notas = notas;
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public double media() {
		double media = ((notas[0] + notas[1])/2)*0.8 + (notas[2]*0.2);
		return media;
	}
	
	public void recuperacao() {
		double media = media();
		if(media < 6) 
			System.out.println("Você ficou de recuperação");
		else
			System.out.println("Parabéns, você passou!");
	}

	public double[] getNotas() {
		return notas;
	}

	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}
}
