import java.io.Serializable;

public class Community implements Serializable{
	
	protected String name;
	protected int population;
	
	public Community(String name, int population) {
		this.name = name;
		this.population = population;
	}
	
	public double calculateFunding() {
		return population * 50;
	}

}
