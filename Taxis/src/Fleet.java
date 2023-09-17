import java.util.ArrayList;

public class Fleet {
	private String name;
	
	ArrayList<Taxi> taxies = new ArrayList<Taxi>();
	
	public Fleet(String name) {
		this.name = name;
	}
	
	public void storeTaxi(Taxi taxi) {
		taxies.add(taxi);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Taxi> getTaxies() {
		return taxies;
	}
	
	public double getAutonomiaStoulou() {
		double sum = 0;
		for(Taxi taxi: taxies) {
			sum+= taxi.autonomia();
		}
		return sum;
	}
	
	public int getNumberOfTaxies() {
		int sum = 0;
		for(Taxi taxi: taxies) {
			sum++;
		}
		return sum;
	}
	
	
	
	
}
