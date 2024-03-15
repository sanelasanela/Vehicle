/*
Step 1: Create a base class "Vehicle" with properties like "Manufacturer", "Model", and "Year of Manufacture".

Step 2: Create a derived class "Car" that inherits from "Vehicle" and has additional properties like "Number of Doors".

Step 3: Implement a method in the "Vehicle" class that outputs information about the vehicle.

Step 4: Override the method from step 3 in the "Car" class to also output the number of doors.

Step 5: Create instances of the "Vehicle" and "Car" classes and call the methods to output the information.

 */



public class Vehicle {
    private String manufacturer;
    private String model;
    private int yearOfMan;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfMan() {
        return yearOfMan;
    }

    public void setYearOfMan(int yearOfMan) {
        this.yearOfMan = yearOfMan;
    }

    public Vehicle(String manufacturer, String model, int yearOfMan) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfMan = yearOfMan;
    }

    public void displayInfo (){
        System.out.println("manu " + manufacturer);
        System.out.println( ("model" + model));
        System.out.println( "year " + yearOfMan);
    }
}
