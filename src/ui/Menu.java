package ui;

import java.math.BigDecimal;
import java.util.Scanner;

import model.Komputer;
import model.Produkt;
import model.Sklep;
import model.Szkolenia;

public class Menu {

	public void wyswietlMenu() {
		//kjkjkj
		//kjkjkjkk
		//klklklklk
		
		
		Sklep sklep = new Sklep("www.sklep.com");
		Scanner skaner = new Scanner(System.in);
		System.out.println("1 - dodaj komputer");
		System.out.println("2 - usun produkt");
		System.out.println("3 - edytuj komputer");
		System.out.println("4 - wyswietl produkty");
		System.out.println("5 - dodaj szkolenie");
		System.out.println("6 - wyswietl rabaty");
		System.out.println("q - wyjscie");
		String wybor;
		do {
			System.out.print("Podaj wybor: ");
			wybor = skaner.nextLine();
			
			switch (wybor) {
			case "1":{
				System.out.print("Podaj cene: ");
				BigDecimal cena = skaner.nextBigDecimal();
				// 15.6\n
				skaner.nextLine();
				System.out.print("Podaj nazwe: ");
				String nazwa = skaner.nextLine();

				System.out.print("Podaj cpu: ");
				String cpu = skaner.nextLine();

				System.out.print("Podaj ram: ");
				String ram = skaner.nextLine();
				
				Komputer komputer = new Komputer(cena, nazwa, cpu, ram);
				sklep.dodajProdukt(komputer);
				
				
				
				break;}
			case "2":{
				
				if (sklep.czyPusty()){
					System.out.println("Sklep pusty");
				}else{	
					sklep.wyswietlListe();
					System.out.println("Podaj index do usuniecia: ");
					int index = skaner.nextInt();
					skaner.nextLine();
					
					if (sklep.sprawdzIndex(index)) {
						sklep.usunProdukt(index);
						System.out.println("Komputer zostal usuniety");
					}else{
						System.out.println("Podales niepoprawny index");
					}
					
					sklep.usunProdukt(index);
					System.out.println("Komputer zostal poprawnie usuniety");
					}		
				break;}
			case "3":{
				sklep.wyswietlListe();
				System.out.println("Ktory element edytujemy");
				int index = skaner.nextInt();
				skaner.nextLine();
				Produkt produkt = sklep.znajdzProdukt(index);
				
				if (produkt instanceof Komputer){
				
				Komputer komputer = (Komputer)sklep.znajdzProdukt(index);
				
				System.out.println("Podaj nowa cene (aktualna cena : " + komputer.getCena() + "): " );
				BigDecimal cena = skaner.nextBigDecimal();
				skaner.nextLine();
				
				System.out.println("Podaj nowa nazwe ( aktualna: " + komputer.getNazwa() + "): ");
				String nazwa = skaner.nextLine();
				
				System.out.println("Podaj nowa nazwe cpu ( aktualna: " + komputer.getCpu() + "): ");
				String cpu = skaner.nextLine();
				
				System.out.println("Podaj nowa nazwe ram ( aktualna: " + komputer.getRam() + "): ");
				String ram = skaner.nextLine();
				
				//komputer.setCena(cena);
				//komputer.setNazwa(nazwa);
				//komputer.setRam(ram);
				//komputer.setCpu(cpu);
				
				komputer.zaktualizuj(cena, nazwa, ram ,cpu);
				
				sklep.zmodyfikujProdukt(index, komputer);
				} else {
					System.out.println("To nie jest komputer");
				}break;
				}
			case "4":
				sklep.wyswietlListe();
				break;
			case "5":{
				System.out.print("Podaj cene: ");
				BigDecimal cena = skaner.nextBigDecimal();
				// 15.6\n
				skaner.nextLine();
				System.out.print("Podaj nazwe: ");
				String nazwa = skaner.nextLine();

				System.out.print("Podaj technologie: ");
				String technologie = skaner.nextLine();
				
				Szkolenia szkolenie = new Szkolenia(cena, nazwa, technologie);
				sklep.dodajProdukt(szkolenie);
				break;}
			case "6":{
				sklep.wyswietlRabaty();
				break;}
			case "q":
			case "Q":
				System.out.println("Koniec programu");
				break;
			default:
				System.out.println("Bledny wybor");
				break;
			}
		} while (!wybor.equalsIgnoreCase("q"));

	}

}
