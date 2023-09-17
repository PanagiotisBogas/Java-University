
public class Panel {
	private String brand;
	private double avgKWConsumption;
	
	public Panel(String brand, double avgKWConsumption) {
		this.brand = brand;
		this.avgKWConsumption = avgKWConsumption;
	}
	
	public double getKWConsumption() {
		return this.avgKWConsumption;
	}
	
}
