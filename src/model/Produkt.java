package model;

import java.math.BigDecimal;

public abstract class Produkt {
	
	
	protected int id;
	protected BigDecimal cena; 
	protected String nazwa;
	
	private static int generator = 1;
	
	public Produkt(BigDecimal cena, String nazwa) {
		this.cena = cena;
		this.nazwa = nazwa;
		this.id = generator;
		generator++;
	}
	public BigDecimal getCena() {
		return cena;
	}
	public void setCena(BigDecimal cena) {
		this.cena = cena;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	
	public abstract String dajRabat();
	
	public static void wyswitlIloscObiektow(){
		System.out.println(generator);
//		System.out.println(nazwa);
	}
	
}
