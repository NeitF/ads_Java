package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Integer mes, num;
		
		Fatura f = new Fatura();
		List<Empregado> lista = new ArrayList<>();
	
		lista.add(new Assalariado("Jonas", "Oliveira", "555444000", "20/03/1990", 2000));
		lista.add(new Assalariado("Pedro", "Carvalho", "333000229", "15/10/2000", 1000));
		lista.add(new Comissionado("Maria", "Ferreira", "444111000", "01/01/1990", 5));
		lista.add(new Comissionado("Larissa", "Silva", "000333112", "30/12/2000", 20));
		lista.add(new Horista("João", "Marcelo", "001225774", "05/05/1995", 50));
		lista.add(new Horista("Marcela", "Monteiro", "223998771", "24/09/2002", 75));
		lista.add(new BaseComissionado("Rafael", "Dias", "774336001", "27/11/1997", 9, 2500));
		lista.add(new BaseComissionado("Marta", "Rocha", "000222889", "07/09/2003", 17, 3000));
	
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<12;i++) {
			//Preencher valores
			System.out.println("INSERÇÃO DE DADOS DO MÊS " + (i+1) + "\n");
			for(Empregado e: lista) {
				if((e instanceof Comissionado) && !(e instanceof BaseComissionado)) {
					Comissionado c = (Comissionado) e;
					System.out.println("COMISSIONADO -- \nMês " + (i+1));
					System.out.println("FUNCIONÁRIO: " + e.getNome() + " " + e.getSobrenome() + 
							"\nInsira o valor total das vendas do mês:");
					c.setVendasMensal(scanner.nextDouble());
					System.out.println("----------\n");
				}else if(e instanceof Horista) {
					Horista h = (Horista) e;
					System.out.println("HORISTA -- \nMês " + (i+1));
					System.out.println("FUNCIONÁRIO: " + e.getNome() + " " + e.getSobrenome() + 
							"\nInsira o total de horas trabalhadas:");
					h.setHorasTrab(scanner.nextDouble());
					System.out.println("----------\n");
				}else if(e instanceof BaseComissionado) {
					BaseComissionado bc = (BaseComissionado) e;
					System.out.println("BASE COMISSIONADO -- \nMês " + (i+1));
					System.out.println("FUNCIONÁRIO: " + e.getNome() + " " + e.getSobrenome() +
							"\nInsira o valor total das vendas do mês:");
					bc.setVendasMensal(scanner.nextDouble());
					System.out.println("----------\n");
				}
			}
			//Exibir folha de pagamento
			System.out.println("FOLHA DE PAGAMENTO DO MÊS " + (i+1));
			for(Empregado e: lista) {
				System.out.println("----------");
				System.out.println(e.toString());
				mes = Integer.parseInt(e.getDataNascimento().substring(3, 5));
				if(mes == i+1) { 
					System.out.println("Ganhos: " + (e.ganhos() + 200) + "\nBÔNUS DE ANIVERSÁRIO DE R$200");
					f.setPreco(f.getValorPago(200, e.ganhos()));
				}else {
					System.out.println("Ganhos: " + e.ganhos());
					f.setPreco(f.getValorPago(0, e.ganhos()));
				}
				System.out.println("----------");
			}
			System.out.println("FIM DA FOLHA DE PAGAMENTO\n");
			
			//Exibir fatura do mês
			System.out.println("FATURA DO MÊS " + (i+1));
			num = i+1;
			f.setNumero(num.toString());
			f.setDescricao("Fatura do mês " + num);
			System.out.println("----------");
			System.out.println("Número: " + f.getNumero() + "\nDescrição: " +
			f.getDescricao() + "\nPreço: " + f.getPreco());
			System.out.println("----------");
			f.setPreco(0);
			System.out.println("FIM DA FATURA DO MÊS\n");
		}
		scanner.close();
	}
}