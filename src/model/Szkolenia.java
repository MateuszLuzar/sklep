package model;

import java.math.BigDecimal;

public class Szkolenia extends Produkt  {

	private String technologia;
	
	public Szkolenia(BigDecimal cena, String nazwa, String technologia){
		super(cena, nazwa);
		this.technologia = technologia;
	}
	
	public String getTechnologia() {
		return technologia;
	}
	
	public void setTechnologia(String technologia) {
		this.technologia = technologia;
	}

	@Override
	public String toString() {
		return "Szkolenia [cena=" + cena + ", nazwa=" + nazwa + ", technologia=" + technologia + "]";
	}
	
	public String dajRabat(){
		return "- 15%";
	}
	
	
	
	
}
