
public class ElectricalTaxi extends Taxi{

	private int plithosBatariwn;

	public ElectricalTaxi(String arithmosKykloforias, String onomaOdigou, int plithosBatariwn) {
		super(arithmosKykloforias, onomaOdigou);
		this.plithosBatariwn = plithosBatariwn;
	}
	
	
	public double autonomia() {
		return 70 * plithosBatariwn;
	}
	
}
