import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ProfitCalculator extends JFrame {
	
	private JPanel panel = new JPanel();
	private JList<String> providersList = new JList<>();
	private DefaultListModel<String> providerModel = new DefaultListModel<>();
	
	private JButton profitButton = new JButton("Calculate Provider Profit");
	
	private JTextField profitTextField = new JTextField("calculated profit");
	private ArrayList<Provider> providers;
	private HashMap<String, String> companyPrices;
	
	
	public ProfitCalculator(ArrayList<Provider> providers, HashMap<String, String> companyPrices) {
		
//		providerModel.addElement("Provider 1");
//		providerModel.addElement("Provider 2");
//		providerModel.addElement("Provider 3");
		this.companyPrices = companyPrices;
		this.providers = providers;
		
		for(Provider provider: this.providers) {
			providerModel.addElement(provider.getName());
		}
		
		this.providersList.setModel(this.providerModel);
			
		this.panel.add(providersList);
		this.panel.add(profitButton);
		this.panel.add(profitTextField);
		
		ButtonListener profitButtonListener = new ButtonListener();
		this.profitButton.addActionListener(profitButtonListener);
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Profit Calculator");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class ButtonListener implements ActionListener {
		 
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String selectedProviderName = ProfitCalculator.this.providersList.getSelectedValue(); 
			Provider selectedProvider = null;
			
			for(Provider provider: ProfitCalculator.this.providers) {
				if (provider.getName().equals(selectedProviderName)) {
					selectedProvider = provider;
					break;
				}
			}
			
			if (selectedProvider!=null) {
				ProfitCalculator.this.profitTextField.setText(Double.toString(selectedProvider.calculateProfit(ProfitCalculator.this.companyPrices)));
			}
			else {
				JOptionPane.showMessageDialog(null, "No city selected!");
			}
			
			
		}
 
	}
	
	
}
