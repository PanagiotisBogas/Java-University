
public class DiagnosticTest extends Test{
	protected Boolean apotelesma;
	protected String eidosDigmatos;
	
	public DiagnosticTest(String eponimo, String date, Boolean apotelesma, String eidosDigmatos) {
		super(eponimo, date);
		this.apotelesma = apotelesma;
		this.eidosDigmatos = eidosDigmatos;
	}
	
	public Boolean getApotelesma() {
		return apotelesma;
	}

	public String getEidosDigmatos() {
		return eidosDigmatos;
	}
	
	
}