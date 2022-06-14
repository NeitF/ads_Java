package Ex03;

import java.util.ArrayList;
import java.util.List;

public class cAlfa extends Caminhao{

	List<Pluviometro> carregamento = new ArrayList<>();
	double pesoCapacidade;
	
	@Override
	public String inserePluviometro(Pluviometro p) throws Exception{
		if((this.pesoCapacidade + p.getPeso()) <= 5000) {
			this.pesoCapacidade += p.getPeso();
			carregamento.add(p);	
			return "Inserido com sucesso";
		}else {
			throw new Exception("Limite de peso excedido!\nPluviometro do tipo " +
		    p.getTipo() + " não adicionado!");
		}	
	}

	@Override
	public String removePluviometro(Pluviometro p) throws Exception {
		if(carregamento.remove(p)) 
			return "Removido com sucesso!";
		else 
			throw new Exception("Esse pluviometro não está presente no carregamento");
	}
	
	@Override
	public String verCarregamento() {
		String result = "";
		for(Pluviometro p: carregamento) {
			result += "--------\nTipo: " + p.getTipo() + "\nPeso: " + p.getPeso() + 
			"\nCapacidade: " + p.getCapacidade() + "\n--------";
		}
		return result;
	}
}
