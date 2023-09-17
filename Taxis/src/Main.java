import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Fleet> fleets = new ArrayList<Fleet>();
		
		Fleet Hrakleio = new Fleet("Hrakleio");
		Fleet Rethimno = new Fleet("Rethimno");
		
		ElectricalTaxi elTaxi1 = new ElectricalTaxi("KOH1224" , "Babis", 2);
		ElectricalTaxi elTaxi2 = new ElectricalTaxi("PAE0523" , "Mitsos", 1);
		
		GasolineTaxi gasTaxi1 = new GasolineTaxi("ΙΕH8274" , "Boga", 2, 7.5);
		GasolineTaxi gasTaxi2 = new GasolineTaxi("ΑΜE0323" , "Mitsos", 1, 8.5);
		
		Hrakleio.storeTaxi(elTaxi1);
		Hrakleio.storeTaxi(gasTaxi1);
		
		Rethimno.storeTaxi(elTaxi2);
		Rethimno.storeTaxi(gasTaxi2);
		
		fleets.add(Rethimno);
		fleets.add(Hrakleio);
		
		new GUI(fleets);
		

	}

}
