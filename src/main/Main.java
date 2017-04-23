package main;

import model.Produkt;
import ui.Menu;

public class Main {

	public static void main(String[] args) {
		
		Produkt.wyswitlIloscObiektow();
		
		Menu menu = new Menu();
		menu.wyswietlMenu();
	}

}
