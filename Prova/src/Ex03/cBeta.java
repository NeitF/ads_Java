package Ex03;

import java.util.ArrayList;
import java.util.List;

public class cBeta extends Caminhao{

	List<Pluviometro> carregamento = new ArrayList<>();
	
	@Override
	public String inserePluviometro(Pluviometro p) throws Exception{
		if(carregamento.contains(p)) {
			throw new Exception("Ja existe um pluviometro do tipo " + p.getTipo() +
			" no caminhão!");
		}else {
			carregamento.add(p);
			return "Inserido com sucesso";
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
