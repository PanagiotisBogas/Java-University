import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//import InputFrame.ButtonListener;

public class FundingCalculator extends JFrame {
	
	private JPanel panel = new JPanel();
	private JList<String> citiesList = new JList<>();
	private DefaultListModel<String> citiesModel = new DefaultListModel<>();
	
	private JButton cityFundingButton = new JButton("Calculate City Funding");
	
	private JTextField fundingTextField = new JTextField("calculated funding");
	
	private ArrayList<City> cities;
	
	
	public FundingCalculator() {
		
		try {
			FileInputStream fileIn = new FileInputStream("Cities.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			cities = (ArrayList<City>) in.readObject();
			in.close();
			fileIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
//		citiesModel.addElement("City 1");
//		citiesModel.addElement("City 2");
//		citiesModel.addElement("City 3");
//		citiesModel.addElement("City 4");
		
		for(City city:cities) {
			citiesModel.addElement(city.getEdra());
		}
		
		citiesList.setModel(citiesModel);
			
		panel.add(citiesList);
		panel.add(cityFundingButton);
		panel.add(fundingTextField);
		
		this.setContentPane(panel);
		
		ButtonListener 	listener = new ButtonListener();
		cityFundingButton.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Funding Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String selectedCityName = citiesList.getSelectedValue();
			City selectedCity = null;
			for(City city : cities) {
				if(city.getEdra().equals(selectedCityName)) {
					selectedCity = city;
				}
			}
			
			if(selectedCity == null) {
				JOptionPane.showMessageDialog(null, "No City selected");
			}
			
			fundingTextField.setText(selectedCity.calculateFunding() + "");
			
		}
		
	}
	
	
}
