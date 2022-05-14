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
		System.out.println("A data corrente � menor que a data do par�metro");
	else if(resultado == 1)
		System.out.println("A data corrente � maior que a data do par�metro");
	else 
		System.out.println("As datas s�o iguais");

	System.out.println("Dia = " + d1.getDia());
	System.out.println("M�s = " + d1.getMes());
	System.out.println("Ano = " + d1.getAno());
	
	System.out.println("Dia = " + d3.getDia());
	System.out.println("M�s = " + d3.getMes());
	System.out.println("Ano = " + d3.getAno());
	}
}
