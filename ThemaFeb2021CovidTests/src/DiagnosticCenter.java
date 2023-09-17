import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class DiagnosticCenter {
	private ArrayList<Test> tests = new ArrayList<Test>();
	
	public void addTest(Test test) {
		tests.add(test);
	}
	
	public String getTestResultStats() {
		double positive = 0;
		double negative = 0;
		double positivePercentage = 0;
		double negativePercentage = 0;
		double testSum = 0;
		
		for(Test test:tests) {
			testSum++;
			if(test instanceof DiagnosticTest) {
				if(((DiagnosticTest) test).getApotelesma()) {
					positive ++;
				}else {
					negative ++;
				}
			}
		}
		
		positivePercentage = (positive *100)/testSum;
		negativePercentage = (negative *100)/testSum;
		
		return "Positive Tests: " + (int)positive +  " (" + positivePercentage + "%), " +  " Negative Tests: " + (int)negative+  " (" + negativePercentage + "%),";
	}

	public void checkForTest(ArrayList<String> names) {
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("TestedPeople.txt"));
			Collections.sort(names);
			boolean flag;
			for(String name : names) {
				flag = true;
				for(Test test : tests) {
					if(name.equals(test.getEponimo())) {
						writer.write(test.getEponimo() + " has performed a test with the following information:");
						writer.write("\n"+test.testInfo());
						writer.write("\n-----------------------------------");
						writer.write("\n");
						flag = false;
					}
				}
				if(flag) {
					writer.write( name +" has not performed any test.");
					writer.write("\n-----------------------------------");
					writer.write("\n");
				}
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
