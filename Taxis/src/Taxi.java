
public class Taxi {
	protected String arithmosKykloforias;
	protected String onomaOdigou;
	
	
	public Taxi(String arithmosKykloforias, String onomaOdigou) {
		this.arithmosKykloforias = arithmosKykloforias;
		this.onomaOdigou = onomaOdigou;
	}
	
	
	
	public String getArithmosKykloforias() {
		return arithmosKykloforias;
	}



	public String getOnomaOdigou() {
		return onomaOdigou;
	}



	public double autonomia() {
		return 0;
	}
	
	
	
}
