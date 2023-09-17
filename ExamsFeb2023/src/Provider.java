import java.util.ArrayList;
import java.util.HashMap;

public class Provider {
	private String name;
	private ArrayList<Subscriber> subscribers;
	
	public Provider(String name) {
		this.name = name;
		this.subscribers = new ArrayList<Subscriber>();
	}
	
	public void addSubscriber(Subscriber sub) {
		this.subscribers.add(sub);
	}

	public String getName() {
		return this.name;
	}

	public ArrayList<Subscriber> getSubscribers() {
		return this.subscribers;
	}
	
	public String getPanelBrand() {
		if(this.name.equals("New Energy")) {
			return "SunPower";
		}else if(this.name.equals("Power Tech")) {
			return "Panasonic";
		}
		return "RECSoloar";
	}
	
	public double getPanelAverage() {
		if(this.name.equals("New Energy")) {
			return 480;
		}
		else if(this.name.equals("Power Tech")) {
			return 550;
		}
		return 490;
	}
	
	public double calculateTotalNetEnergy() {
		double sum =0;
		for(Subscriber sub : subscribers) {
			sum+= sub.calculateNetEnergy();
		}
		return sum;
	}
	
	public double calculateProfit(HashMap<String, String> kWPrices) {
		return calculateTotalNetEnergy() * Double.valueOf(kWPrices.get(this.name));
	}
	
	
	
}
