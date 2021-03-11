package main.car;

public class Main {

    public static void main(String[] args) {
       int a = 5;
       int b = 6;
       Car audi = new Car();
       audi.brand = "Audi";
       audi.model = "Q3";
       audi.color = "white";
       //audi.buildYear = 2012;
       
       System.out.println("Brand: " + audi.brand);
       System.out.println("Model: " + audi.model);
       System.out.println("Godina proizvodnje: " + audi.getBuildYear());
        
        
       Car bmw = new Car();
       bmw.brand = "BMW";
       bmw.model = "X5";
       bmw.printAttributes();
        
       Car fiat = new Car(2010);
       System.out.println("Godina proizvodnje: " + fiat.getBuildYear());
   
       Car lada = new Car("Lada", "Niva", "crvena", 2018);
       lada.printAttributes();
       
       
    }
       
}
