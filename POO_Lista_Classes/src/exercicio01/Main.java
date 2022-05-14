package exercicio01;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		double[] notas = new double[3];
		notas[0] = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova 1"));
		notas[1] = Double.parseDouble(JOptionPane.showInputDialog("Nota da prova 2"));
		notas[2] = Double.parseDouble(JOptionPane.showInputDialog("Nota do trabalho"));
		
		Aluno a1 = new Aluno(notas, "Jonas", 115);
		System.out.printf("A nota do aluno %s é: %.2f\n", a1.getNome(), a1.media());
		a1.recuperacao();
	}
}
