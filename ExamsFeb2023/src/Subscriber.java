
public class Subscriber {
	protected String name;
	protected double avgKWConsumption;
	
	public Subscriber(String name, double avgKWConsumption) {
		this.name = name;
		this.avgKWConsumption = avgKWConsumption;
	}
	
	public double calculateNetEnergy() {
		return this.avgKWConsumption;
	}
	
	
	
}
