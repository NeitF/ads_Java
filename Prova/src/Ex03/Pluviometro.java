package Ex03;

import java.util.Objects;

public class Pluviometro {
	
	private String tipo;
	private double peso;
	private double capacidade;
	
	public Pluviometro(String tipo) {
		this.tipo = tipo;
		if(tipo.equals("manual")) {
			this.peso = 1200;
			this.capacidade = 1200;
		}
		else if(tipo.equals("sifão")) {
			this.peso = 1700;			
			this.capacidade = 2000;
		}
		else if(tipo.equals("totalizador")) {
			this.peso = 2000;
			this.capacidade = 2500;
		}
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(capacidade, peso, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pluviometro other = (Pluviometro) obj;
		return Double.doubleToLongBits(capacidade) == Double.doubleToLongBits(other.capacidade)
				&& Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
				&& Objects.equals(tipo, other.tipo);
	}

	public String getTipo() {
		return tipo;
	}

	public double getPeso() {
		return peso;
	}

	public double getCapacidade() {
		return capacidade;
	}

	
	
	
	
	

}
