package model;

import java.math.BigDecimal;

public class Komputer extends Produkt implements UrzadzeniaElektroniczne {

	private String cpu;
	private String ram;
	
	public Komputer(BigDecimal cena, String nazwa, String cpu, String ram) {
		super(cena, nazwa);
		this.cpu = cpu;
		this.ram = ram;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}
	
	public String toString(){
		return nazwa + " " + cena + " PLN, " + cpu + " " + ram; 
	}

	public void zaktualizuj(BigDecimal cena, String nazwa, String ram, String cpu) {
		this.cena = cena;
		this.nazwa = nazwa;
		this.ram = ram;
		this.cpu = cpu;
	}
	
	public String dajRabat(){
		return "- 10%";
	}

	@Override
	public void wyswietlCertyfikatCE() {
		System.out.println("Certfikat CE dla komputera");
		
	}
	
	
	
}
