
public class GasolineTaxi extends Taxi{
	private int rezervouarVenzini;
	private double mesiKatanalosi;
	
	public GasolineTaxi(String arithmosKykloforias, String onomaOdigou, int rezervouarVenzini, double mesiKatanalosi) {
		super(arithmosKykloforias, onomaOdigou);
		this.rezervouarVenzini = rezervouarVenzini;
		this.mesiKatanalosi = mesiKatanalosi;
	}
	
	public double autonomia() {
		return 90 * (rezervouarVenzini/mesiKatanalosi);
	}
	
	
}
