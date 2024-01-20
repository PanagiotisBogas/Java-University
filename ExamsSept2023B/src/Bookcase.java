
public class Bookcase extends Furniture{
	private int arithmosRafiwn;

	public Bookcase(String model, int weight, int category, int arithmosRafiwn) {
		super(model, weight, category);
		this.arithmosRafiwn = arithmosRafiwn;
	}
	
	public double calcPrice() {
		if(this.category == 1) {
			return (50 * arithmosRafiwn) *1.20;
		}else if(this.category == 2) {
			return (50 * arithmosRafiwn) *1.30;
		}else{
			return (50 * arithmosRafiwn) *1.50;
		}
	}
	
	public int getArithmosRafiwn() {
		return arithmosRafiwn;
	}

	public String description() {
		if(this.category == 1) {
			return "Plastic";
		}else if(this.category == 2) {
			return "Metallic";
		}else{
			return "Wooden";
		}
	}
	
	
	public String furnitureInfo() {
		String info;
		info = "- Bookcase info: " + "\n" + this.getModel() + ", " + this.calcPrice() + " Euro" + "\nCategory: " + this.getCategory() + "\nWeight: " + this.getWeight() + "\nShelves: " + this.getArithmosRafiwn() ;
		return info;
	}

}
