package exercicio02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
	
	private String data;
	
	public Data(int dia, int mes, int ano) {
		if((dia >= 0 && dia <= 31) && (mes >= 1 && mes <= 12) && ano > 1900) {
			this.data = String.format("%d/%d/%d", dia, mes, ano);
		}else {
			this.data = String.format("%d/%d/%d", 1, 1, 0001);
		}
	}
	
	public int Compara(Data outraData) throws ParseException {
		SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
		Date data1 = SDF.parse(this.data);
		Date data2 = SDF.parse(outraData.data);
		
		if(data1.compareTo(data2)<0) 
			return -1;			
		else if(data1.compareTo(data2)>0)
			return 1;		
		else
			return 0;
	}

	public String getData() {
		return this.data;
	}
	
	public String getDia(){
		int p1 = this.data.indexOf("/");
		//O índice de início é inclusivo. O índice de fim não é inclusivo
		return this.data.substring(0, p1);
	}
	
	public String getMes() {
		int p1 = this.data.indexOf("/");
		int p2 = this.data.indexOf("/", p1+1);
		return this.data.substring(p1+1, p2);
	}
	
	public String getAno() {
		int p1 = this.data.indexOf("/");
		int p2 = this.data.indexOf("/", p1+1);
		return this.data.substring(p2+1);
	}
	
	public Data clone(int dia, int mes, int ano) {
		return new Data(dia, mes, ano);
	}

}
