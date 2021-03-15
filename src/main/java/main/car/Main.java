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
       audi.printAttributes();
       audi.travel(150);       
       // System.out.println("Brand: " + audi.brand);
       // System.out.println("Model: " + audi.model);
       // System.out.println("Color: " + audi.color);
       // System.out.println("Godina proizvodnje: " + audi.getBuildYear());
       audi.printAttributes();
       //audi.fuelUp(3000);
       //audi.travel(300);
       
        
       Car bmw = new Car();
       bmw.brand = "BMW";
       bmw.model = "X5";
       bmw.color = "black";
       //bmw.fuelUp = 30;
       //bmw.maxFuel = 100;
       bmw.printAttributes();
        
       Car fiat = new Car(2010);
       System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
   
       Car lada = new Car("Lada", "Niva", "crvena", 2018, 0, 50, 10, 50, 100);
       lada.printAttributes();
       //lada.setFuel(343);
       // proveriti gorivo
       lada.travel(300);
       lada.printAttributes();
       lada.travel(200);
       lada.printAttributes(); 
       lada.travel(100);
       lada.printAttributes();
       
    }
       
}
