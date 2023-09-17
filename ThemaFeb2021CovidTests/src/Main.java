 import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//Mhn tropopoiisete ton parakatw kwdika
		//Do not change the following code
		MolecularTest mTest1 = new MolecularTest("Alexiou", "May 15, 2020", true, "Nasal", 0.99);
		AntigenTest aTest1 = new AntigenTest("Papadopoulos", "October 20, 2020", false, "Throat", 30);
		MolecularTest mTest2 = new MolecularTest("Nikolaou", "November 29, 2020", true, "Throat", 0.95);
		AntigenTest aTest2 = new AntigenTest("Petrou", "June 6, 2020", false, "Throat", 60);
		MolecularTest mTest3 = new MolecularTest("Dimitriou", "September 19, 2020", false, "Nasal", 0.99);
		AntigenTest aTest3 = new AntigenTest("Ioannou", "December 5, 2020", false, "Nasal", 45);
		MolecularTest mTest4 = new MolecularTest("Michailidis", "December 17, 2020", false, "Throat", 0.98);
				
		//Sthn parakatw entolh tha prepei na antikatastisete to Epwnymo me to diko sas
		//In the next line please substitute Epwnymo with your own name
		AntigenTest aTest4 = new AntigenTest("Boga", "April 4, 2020", false, "Throat", 30);
				
		//Mhn tropopoiisete ton parakatw kwdika
		//Do not change the following code
		DiagnosticCenter diagnosticCenter = new DiagnosticCenter();
		
		diagnosticCenter.addTest(mTest1);
		diagnosticCenter.addTest(aTest1);
		diagnosticCenter.addTest(mTest2);
		diagnosticCenter.addTest(aTest2);
		diagnosticCenter.addTest(mTest3);
		diagnosticCenter.addTest(aTest3);
		diagnosticCenter.addTest(mTest4);
		diagnosticCenter.addTest(aTest4);
		
		ArrayList<String> testArray = new ArrayList<>();
		testArray.add("Papadopoulos");
		testArray.add("Alexiou");
		testArray.add("Georgiou");
		
		//Sto parakatw onoma tha prepei na antikatastisete to Epwnymo me to diko sas
		//In the following name please substitute Epwnymo with your own last name
		testArray.add("Boga");
		
		//Mhn tropopoiisete ton parakatw kwdika
		//Do not change the following code
		testArray.add("Ioannou");
		diagnosticCenter.checkForTest(testArray);
		
		GUI gui = new GUI(diagnosticCenter);
		
	}

}
