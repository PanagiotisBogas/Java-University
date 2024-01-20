import java.util.ArrayList;

public class FurnitureCompany {
	private ArrayList<Furniture> furnitures = new ArrayList<Furniture>();
	
	public void addFurniture(Furniture f) {
		furnitures.add(f);
	}

	public ArrayList<Furniture> getFurnitures() {
		return furnitures;
	}
	
}
