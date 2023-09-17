
public class AntigenTest extends DiagnosticTest{
	private int durationTime;

	public AntigenTest(String eponimo, String date, Boolean apotelesma, String eidosDigmatos, int durationTime) {
		super(eponimo, date, apotelesma, eidosDigmatos);
		this.durationTime = durationTime;
	}
	
	
	public int getDurationTime() {
		return durationTime;
	}


	public String testInfo() {
		return "Antigen Test" + " Date: "  + this.getDate() + " Result: " + this.getApotelesma() + " Type: " + this.getEidosDigmatos() + " Time: " + this.getDurationTime();
	}
	
}
