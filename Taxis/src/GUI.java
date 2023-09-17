import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI extends JFrame{
	 
		private JTextField textField;
		private JButton printAutonomia;
		private JButton saveToFile;
		private JPanel panel;
		
		private ArrayList<Fleet> fleetsList = new ArrayList<Fleet>();
		
		public GUI(ArrayList<Fleet> fleetsList) {
			
			this.fleetsList = fleetsList;
			
			panel = new JPanel();
			textField = new JTextField(25);
			printAutonomia = new JButton("Εμφάνιση Αυτονομίας");
			saveToFile = new JButton("Αποθήκευση σε Αρχείο");
			
			panel.add(textField);
			panel.add(printAutonomia);
			panel.add(saveToFile);
			
			this.setVisible(true);
			this.setSize(400,400);
			this.setTitle("Taxi Application");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			this.setContentPane(panel);
			
	
			ShowListener showListener = new ShowListener();
			printAutonomia.addActionListener(showListener);
			FileListener txtListener = new FileListener();
			saveToFile.addActionListener(txtListener);
			
			
			
		}
		
		class FileListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				
				String selectedFleetlName = (String) textField.getText();
				Fleet selectedFleet = null;
				for(Fleet fleet : fleetsList) {
					if(fleet.getName().equals(selectedFleetlName)) {
						selectedFleet = fleet;
					}
				}
				
				try {
					BufferedWriter writer = new BufferedWriter(new FileWriter("ics21046.txt"));
					writer.write(selectedFleet.getName());
					ArrayList<Taxi> fleetTaxies = new ArrayList<Taxi>();
					Double sumAytonomia = 0.0;
					fleetTaxies = selectedFleet.getTaxies();
					for(Taxi taxi:fleetTaxies) {
						writer.write("\nDriver's Name: " + taxi.getOnomaOdigou());
						writer.write("\nArithmos Kikloforias: " + taxi.getArithmosKykloforias());
						writer.write("\nAytonomia: " + taxi.autonomia());
						sumAytonomia += taxi.autonomia();
					}
					writer.write("\nSynoliki aytonomia stolou: " + sumAytonomia);
					writer.write("\n");
					writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
			
		}
		
		class ShowListener implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String selectedFleetlName = (String) textField.getText();
				Fleet selectedFleet = null;
				for(Fleet fleet : fleetsList) {
					if(fleet.getName().equals(selectedFleetlName)) {
						selectedFleet = fleet;
					}
				}
	
				System.out.println("Name: " + selectedFleet.getName());
				System.out.println("Number of taxies: " + selectedFleet.getNumberOfTaxies());
				System.out.println("Synoliki Aytonomia olwn twn taxi: "  + selectedFleet.getAutonomiaStoulou());					
			}
			
		}
	
}
