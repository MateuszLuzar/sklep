package model;

import java.util.ArrayList;
import java.util.List;

public class Sklep {

	private String www;
	
	private List<Produkt> produkty;
	
	public Sklep(String www) {
		this.www = www;
		this.produkty = new ArrayList<>();
	}
	
	// dodajKomputer
	public void dodajProdukt(Produkt produkt){
		produkty.add(produkt);
	}
	
	public void usunProdukt(int index){
		produkty.remove(index - 1);
	}
	
	public void wyswietlListe(){
		for (int i = 0; i < produkty.size(); i++){
			System.out.println((i+1) + ", " + produkty.get(i).toString());
		}
	}
	
	public void zmodyfikujProdukt(int index, Komputer komputer){
		produkty.set(index - 1, komputer);
	}
		
	public Produkt znajdzProdukt(int index) {
			
			return produkty.get(index - 1);
		}
	// usunKomputer
	// wyswietlListe
	// zmodyfikujKomputer

	public boolean czyPusty() {
		return produkty.isEmpty();
	}

	public boolean sprawdzIndex(int index) {
		return index > 0 && index <= produkty.size();
	}

	public void wyswietlRabaty() {
		
		for (Produkt produkt : produkty){
			System.out.println(produkt.dajRabat());
		}
		
	}

	public void wyswietlCE(){
		for (Produkt produkt : produkty){
			if (produkt instanceof UrzadzeniaElektroniczne){
				UrzadzeniaElektroniczne ue = (UrzadzeniaElektroniczne) produkt;
				ue.wyswietlCertyfikatCE();
			}
		}
	}
	
	
}

	
