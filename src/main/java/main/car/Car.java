package main.car;

public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYear;
    private int mileage = 0;
    private int fuel;
    private int consumption = 5;
    public int fuelUp;
    public int maxFuel = 100;
        
    
    public Car() {
        this.brand = "";
        this.model = "";
        this.color = "";
        this.buildYear = 0;
    }
    
    public Car(int buildYear) {
        this.buildYear = buildYear;
    }
    
    public Car(String brand, String model, String color, int buildYear, int mileage, int fuel, int consumption, int fuelUp, int maxFuel) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYear = buildYear;
        this.mileage = mileage;
        this.fuel = fuel;
        this.consumption = consumption;
        this.fuelUp = fuelUp;
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
        this.maxFuel = maxFuel;
    }
    
    public int getMaxFuel (int getFuel) {
        return this.maxFuel = maxFuel;
    }
    
    private void setFuelUp (int fuelUp) {
        this.fuelUp = fuelUp;
    }
    
    public int getFuelUp (int fuelUp) {
        return this.fuelUp = fuelUp;
    }
    
      
    public void printAttributes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build Year: " + this.getBuildYear());
        System.out.println("Mileage: " + this.getMileage());
        System.out.println("Current fuel: " + this.getFuel());
        System.out.println("");
    }
    
    
    public void travel(int distance) {
        int fuelNeededForTrip = this.getConsumption() * distance / 100;
      
       if (this.getFuelUp(fuelUp) > this.getMaxFuel(fuel)) {
        System.out.println("Ne mozete nasuti kolicinu goriva vecu od rezervoara");
    } else {
            
        if (this.getFuel() > fuelNeededForTrip + this.fuelUp) {
                    
        //int newMileage = this.getMileage() + distance;
        //this.setMileage(newMileage);
        
            this.setMileage(this.getMileage() + distance);
        
        //int spentFuel = this.getConsumption() * distance;
        //int newFuel = this.getFuel() - spentFuel;
        //this.setFuel(newFuel);
        
    }
 
    
    }  

    }
}
