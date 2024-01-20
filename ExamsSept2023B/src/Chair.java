
public class Chair extends Furniture{
	private String xrwmaYfasmatos;

	public Chair(String model, int weight, int category, String xrwmaYfasmatos) {
		super(model, weight, category);
		this.xrwmaYfasmatos = xrwmaYfasmatos;
	}
	
	public double calcPrice() {
		if(this.category == 3) {
			return 100* 1.30;
		}else {
			return 100;
		}
	}
	
	
	public String getXrwmaYfasmatos() {
		return xrwmaYfasmatos;
	}

	public String description() {
		if(this.category == 1) {
			return "Office chair";
		}else if(this.category == 2) {
			return "Cooperation chair";
		}else{
			return "Armchair";
		}
	}
	
	public String furnitureInfo() {
		String info;
		info = "- Chair info: " + "\n" + this.getModel() + ", " + this.calcPrice() + " Euro" + "\nCategory: " + this.getCategory() + "\nWeight: " +this.getWeight() + "\nFabric color: " + this.getXrwmaYfasmatos() ;
		return info;
	}
	
}
