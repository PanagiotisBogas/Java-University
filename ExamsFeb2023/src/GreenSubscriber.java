import java.util.ArrayList;

public class GreenSubscriber extends Subscriber{
	
	private String location;
	private ArrayList<Panel> panels;

	public GreenSubscriber(String name, double avgKWConsumption, String location) {
		super(name, avgKWConsumption);
		this.location = location;
		this.panels = new ArrayList<Panel>();
	}
	
	public void addPanel(String brand, double avg) {
		Panel panel = new Panel(brand, avg);
		this.panels.add(panel);
	}
	
	public double calculateNetEnergy() {
		double sum =0;
		
		for(Panel panel : panels) {
			sum+= panel.getKWConsumption();
		}
		
		return avgKWConsumption - sum;

	}

}
