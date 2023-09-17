import java.io.Serializable;

public class RecyclingCenter implements Serializable{
	private String kwdikos;
	private double tonoi;
	
	public RecyclingCenter(String kwdikos, double tonoi) {
		this.kwdikos = kwdikos;
		this.tonoi = tonoi;
	}

	public double getTonoi() {
		return tonoi;
	}
	
	
	
}
