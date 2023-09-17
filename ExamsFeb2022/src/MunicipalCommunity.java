import java.util.ArrayList;

public class MunicipalCommunity extends Community {

	private double area;  	//in square kilometers
	private ArrayList<RecyclingCenter> recCenters = new ArrayList<RecyclingCenter>();

	public MunicipalCommunity(String name, int population, double area) {
		super(name, population);
		this.area = area;
	}
	
	public void add(RecyclingCenter center) {
		recCenters.add(center);
	}
	
	public double calculateFunding() {
		double sumTonoi = 0;
		for(RecyclingCenter recCenter : recCenters) {
			sumTonoi += recCenter.getTonoi();
		}
		
		return (10000 * Math.floor(area)) + (1000 * Math.floor(sumTonoi));
	}
	
}
