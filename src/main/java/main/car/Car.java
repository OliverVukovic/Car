package main.car;

public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    private int mileage = 0;
    private int fuel;
    private int consumption = 5;
    public int maxFuel;
        
    
    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.buildYear = 0;
        this.mileage = 0;
        this.fuel = 0;
        this.consumption = 0;
        this.maxFuel = 50;
    }
    
    public Car(int buildYear) {
        this.buildYear = buildYear;
    }
    
    public Car(String brand, String model, String color, int buildYear, int mileage, int fuel, int consumption, int maxFuel) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
        this.mileage = mileage;
        this.fuel = fuel;
        this.consumption = consumption;
        this.maxFuel = maxFuel;
    }

      
    public int getBuildYear() {
        return this.buildYear;
    }
    
    private int getMileage() {
        return this.mileage;
    }
    
    private void setMileage(int newMileage) {
        this.mileage = newMileage;
    }
    
    private int getConsumption() {
        return this.consumption;
    }
    
    private int getFuel() {
        return this.fuel;
    }
    
    private void setFuel(int fuel) {
        this.fuel = fuel;
    }
    
    private void setMaxFuel (int setFuel) {
        this.maxFuel = setFuel;
    }
    
    public int getMaxFuel () {
        return this.maxFuel;
    }
    
      
    public void printAttributes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build Year: " + this.getBuildYear());
        System.out.println("Mileage: " + this.getMileage());
        System.out.println("Current fuel: " + this.getFuel());
        System.out.println("Max capacity of tank is: " + this.getMaxFuel());
    }
    
    
    public void fuelUp(int distance) {
        int chargeback = fuel - this.getMaxFuel();
        
        if (fuel > this.getMaxFuel()) {
            System.out.println("Ne mozete sipati " + fuel + " litara goriva.");
            System.out.println("Kolicina koju zelite sipati, premasuje maksimalni kapacitet rezervoara za " + chargeback);
            this.setFuel(this.getMaxFuel());
            System.out.println("Vas rezervoar je pun i trenutno imate " + this.getFuel() + " litara goriva.");
                 
        } else {
            this.setFuel(this.getFuel() + fuel);
            System.out.println("U Vasem rezervoaru trenutno ima " + this.getFuel() + "litara goriva");
        }    
    }
    
    
    public void travel(int distance) {
        int fuelNeededForTrip = this.getConsumption() * distance / 100;
              
        if (this.getFuel() >= fuelNeededForTrip) {
            this.setMileage(this.getMileage() + distance);
            this.setFuel(this.getFuel() - fuelNeededForTrip);
            System.out.println("Uspesno je predjen put od " + distance + " kilometara.");
        } else {    
            System.out.println("Nemate dovoljno goriva za put.");
        }    
                    
            //if (this.getFuel() >= fuelNeededForTrip + this.fuelUp) {
        //int newMileage = this.getMileage() + distance;
        //this.setMileage(newMileage);
        
            //this.setMileage(this.getMileage() + distance);
        //int spentFuel = this.getConsumption() * distance;
        //int newFuel = this.getFuel() - spentFuel;
        //this.setFuel(newFuel);
    
    }  

}
