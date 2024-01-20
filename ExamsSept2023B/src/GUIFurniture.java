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



public class GUIFurniture extends JFrame{

	private JPanel panel;

    private JTextField modelField;

    private JTextField categoryField;

    private JButton searcFurnitureBtn;

    private JButton printToTxt;
    private FurnitureCompany comp;
    
    public GUIFurniture(FurnitureCompany comp) {
    	this.comp = comp;

        panel = new JPanel();
 

        modelField = new JTextField(10);
        modelField.setText("Enter Model");

        categoryField = new JTextField(10);
        categoryField.setText("Enter Category");

        searcFurnitureBtn = new JButton("Search Furniture");

        printToTxt = new JButton("Print Furniture to Text File");


        panel.add(modelField);

        panel.add(searcFurnitureBtn);

        panel.add(categoryField);

        panel.add(printToTxt);


        this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Furniture Application");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setContentPane(panel);
		
		SearchListener searchListener = new SearchListener();
		searcFurnitureBtn.addActionListener(searchListener);
		
		TxtListener txtListener = new TxtListener();
		printToTxt.addActionListener(txtListener);

}
    
    class SearchListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
			String selectedModel = (String) modelField.getText();
			Furniture selectedFurniture = null;
			ArrayList<Furniture> c1 = comp.getFurnitures();
			boolean flag = false;
			for(Furniture furniture : c1) {
				if(furniture.getModel().equals(selectedModel)) {
					selectedFurniture = furniture;
					flag = true;
				}
			}
			
			if(flag == true) {
				System.out.println(selectedFurniture.furnitureInfo());
			}else {
				System.out.println("There is no funriture of model " + modelField.getText());
			}
			
			
		}
    	
    }
    
    class TxtListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(categoryField.getText()+".txt"));
				
				String selectedCategory = (String) categoryField.getText();
				Furniture selectedFurniture = null;
				ArrayList<Furniture> c1 = comp.getFurnitures();
				for(Furniture furniture : c1) {
					if(furniture.getCategory() == 1 && furniture instanceof Bookcase) {
						writer.write(furniture.furnitureInfo());
						writer.write("\n");
					}
					if(furniture.getCategory() == 2 && furniture instanceof Bookcase) {
						writer.write(furniture.furnitureInfo());
						writer.write("\n");
					}
					if(furniture.getCategory() == 3 && furniture instanceof Bookcase) {
						writer.write(furniture.furnitureInfo());
						writer.write("\n");
					}
					if(furniture.getCategory() == 1 && furniture instanceof Chair) {
						writer.write(furniture.furnitureInfo());
						writer.write("\n");
					}
					if(furniture.getCategory() == 2 && furniture instanceof Chair) {
						writer.write(furniture.furnitureInfo());
						writer.write("\n");
					}
					if(furniture.getCategory() == 3 && furniture instanceof Chair) {
						writer.write(furniture.furnitureInfo());
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
}
