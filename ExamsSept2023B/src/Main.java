public class Main {

    public static void main(String[] args) {
        FurnitureCompany comp = new FurnitureCompany();

        Bookcase f1 = new Bookcase("Bookcase Neon", 20, 2, 10);
        Bookcase f2 = new Bookcase("Bookcase Classic", 30, 3, 20);
        Chair f3 = new Chair("Chair cars", 5, 1, "red");
        Chair f4 = new Chair("Chair comfort", 8, 3, "black");

        comp.addFurniture(f1);
        comp.addFurniture(f2);
        comp.addFurniture(f3);
        comp.addFurniture(f4);
        
       
        
        //Kwdikas gia thn emfanish toy parathyrou ths efarmoghs
        new GUIFurniture(comp);
    }

}
