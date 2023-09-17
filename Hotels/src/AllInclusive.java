
public class AllInclusive extends Reservation{
	private int meals;

	public AllInclusive(int days, int meals) {
		super(days);
		this.meals = meals;
	}
	
	public int calculateCost() {
		return days * (120 + meals * 30);
	}
	
	
}
