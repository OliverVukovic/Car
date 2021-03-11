package main.car;

public class Car {
    public String brand;
    public String model;
    public String color;
    private int buildYar;
    
    public Car() {
        
    }
    
    public Car(int buildYear) {
        this.buildYar = buildYear;
    }
    
    public Car(String brand, String model, String color, int buildYear) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buildYar = buildYear;
    }
    
    public int getBuildYear() {
        return this.buildYar;
    }
    
    public void printAttributes() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Build Year: " + this.getBuildYear());
        
    }
    
}

