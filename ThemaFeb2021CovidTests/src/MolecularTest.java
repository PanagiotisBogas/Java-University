
public class MolecularTest extends DiagnosticTest{
	private double acccuracy;

	public MolecularTest(String eponimo, String date, Boolean apotelesma, String eidosDigmatos, double acccuracy) {
		super(eponimo, date, apotelesma, eidosDigmatos);
		this.acccuracy = acccuracy;
	}
	
	
	
	public double getAcccuracy() {
		return acccuracy;
	}



	public String testInfo() {
		return "Molecular Test" + " Date: "  + this.getDate() + " Result: " + this.getApotelesma() + " Type: " + this.getEidosDigmatos() + " Accuracy: " + this.getAcccuracy();
	}
	
	
}
