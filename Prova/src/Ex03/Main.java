package Ex03;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int opcao=0;
		Object[] opc = {"manual", "sifão", "totalizador"};
		Object a;
		Pluviometro p;
		Caminhao ca = new cAlfa();
		Caminhao cb = new cBeta();
		
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog
			("(1) - Adicionar no Caminhão Alfa\n(2) - Adicionar no Caminhão Beta\n"
			+ "(3) - Ver carregamento de Alfa\n(4) - Ver carregamento de Beta\n"
			+ "(5) - Remover no Caminhão Alfa\n(6) - Remover no Caminhão Beta\n(0) - Sair"));
			
			
			switch(opcao) {
				case 1:
					a = JOptionPane.showInputDialog(null, "Escolha", "Opcao", 
							JOptionPane.INFORMATION_MESSAGE, null, opc, opc [0]);
					
					p = new Pluviometro(a.toString());
					try {	
						JOptionPane.showMessageDialog(null, ca.inserePluviometro(p));
					}catch (Exception e){
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				case 2:
					a = JOptionPane.showInputDialog(null, "Escolha", "Opcao", 
							JOptionPane.INFORMATION_MESSAGE, null, opc, opc [0]);
					
					p = new Pluviometro(a.toString());
					
					try {
						JOptionPane.showMessageDialog(null, cb.inserePluviometro(p));						
					}catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				case 3:
					JOptionPane.showMessageDialog(null, ca.verCarregamento(), "INFO", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, cb.verCarregamento(), "INFO", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 5:
					a = JOptionPane.showInputDialog(null, "Escolha", "Opcao", 
							JOptionPane.INFORMATION_MESSAGE, null, opc, opc [0]);
					
					p = new Pluviometro(a.toString());
					
					try {
						JOptionPane.showMessageDialog(null, ca.removePluviometro(p));						
					}catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				case 6:
					a = JOptionPane.showInputDialog(null, "Escolha", "Opcao", 
							JOptionPane.INFORMATION_MESSAGE, null, opc, opc [0]);
					
					p = new Pluviometro(a.toString());
					
					try {
						JOptionPane.showMessageDialog(null, cb.removePluviometro(p));						
					}catch (Exception e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
					break;
				case 0:
					break;
				default:
					JOptionPane.showMessageDialog(null, "Valor inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
				
		}while(opcao != 0);
	}
}
