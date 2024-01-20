
public class Furniture {
	protected String model;
	protected int weight;
	protected int category;
	
	
	public Furniture(String model, int weight, int category) {
		this.model = model;
		this.weight = weight;
		this.category = category;
	}
	
	public double calcPrice() {
		return 0.0;
	}
	
	public String description() {
		return "";
	}
	
	public String furnitureInfo() {
		return "";
	}

	public String getModel() {
		return model;
	}

	public int getWeight() {
		return weight;
	}

	public int getCategory() {
		return category;
	}

//	public int getArithmosRafiwn() {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	
	
}
