package main.car;

public class Main {

    public static void main(String[] args) {
       int a = 5;
       int b = 6;
       Car audi = new Car();
       audi.printAttributes();
       audi.brand = "Audi";
       audi.model = "Q3";
       audi.color = "white";
       //audi.BuildYear = 2012;
       audi.travel(150);       
       // System.out.println("Brand: " + audi.brand);
       // System.out.println("Model: " + audi.model);
       // System.out.println("Color: " + audi.color);
       // System.out.println("Godina proizvodnje: " + audi.getBuildYear());
       audi.printAttributes();
       //audi.fuelUp(30);
       //audi.travel(300);
       
        
       Car bmw = new Car();
       bmw.brand = "BMW";
       bmw.model = "X5";
       bmw.printAttributes();
        
       Car fiat = new Car(2010);
       System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
   
       Car lada = new Car("Lada", "Niva", "crvena", 2018, 0, 50, 10);
       lada.printAttributes();
       lada.travel(300);
       //lada.setFuel(343);
       // proveriti gorivo
       lada.printAttributes();
              
    }
       
}
