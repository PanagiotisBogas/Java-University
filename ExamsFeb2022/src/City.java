import java.io.Serializable;
import java.util.ArrayList;

public class City implements Serializable {

	private String edra;
	private ArrayList<Community> communities = new ArrayList<Community>();
	
	public City(String edra) {
		this.edra = edra;
	}
	
	public void add(Community community) {
		communities.add(community);
	}
	
	public double calculateFunding() {
		double sumFunding = 0;
		
		for(Community community: communities) {
			sumFunding += community.calculateFunding();
		}
		
		return sumFunding;
	}

	public String getEdra() {
		return edra;
	}
	
}
