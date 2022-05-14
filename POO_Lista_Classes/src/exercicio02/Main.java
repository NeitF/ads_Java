package exercicio02;

import java.text.ParseException;

public class Main {
	
	public static void main(String[] args) throws ParseException {
		
		int resultado;
		
		Data d1 = new Data(14, 05, 2020);
		Data d2 = new Data(13, 05, 2020);
		Data d3 = d1.clone(20, 03, 2024);
		
	resultado = d1.Compara(d2);
		
	if(resultado == -1)
		System.out.println("A data corrente é menor que a data do parâmetro");
	else if(resultado == 1)
		System.out.println("A data corrente é maior que a data do parâmetro");
	else 
		System.out.println("As datas são iguais");

	System.out.println("Dia = " + d1.getDia());
	System.out.println("Mês = " + d1.getMes());
	System.out.println("Ano = " + d1.getAno());
	
	System.out.println("Dia = " + d3.getDia());
	System.out.println("Mês = " + d3.getMes());
	System.out.println("Ano = " + d3.getAno());
	}
}
