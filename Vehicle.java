import java.util.ArrayList;

interface Vehicle {
    String getLincesePlate();
    String getVehicleType();
    double getRentalPricePerDay();
    void printVehicleDetails();
    void printRentedBy();
    void rentVehicle(Customer customer);
    void returnVehicle(Customer customer);
}
class Customer{
    private String name;
    private String contactNumber;

    public Customer(String name, String contactNumber){
        this.name = name;
        this.contactNumber = contactNumber;

    }
    public String getName(){
        return name;
    }
    public String getContactNumber(){
        return contactNumber;
    }
}

abstract class Car implements Vehicle{
    protected String licensePlate;
    protected String vehicleType;
    protected double rentalPricePerDay;
    protected ArrayList<Customer>rentedBy;



    public Car(String licensePlate, String vehicleType, double rentalPricePerDay, int numberOfDoors, String transmissionType){
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.rentalPricePerDay = rentalPricePerDay;
        this.rentedBy = new ArrayList<>();

    }
    @Override
    public String getLicensePlate(){
        return licensePlate;
    }
    @Override
    public String getVehicleType(){
        return vehicleType;
    }
    @Override
    public double getRentalPricePerDay(){
        return rentalPricePerDay;
    }

}
//You are tasked with designing a vehicle rental system. The system will manage different types of vehicles (cars and motorcycles) and customers who can rent these vehicles. You will need to implement:
//
//Vehicle Interface:
//
//Define a Vehicle interface with the following methods:
//String getLicensePlate()
//String getVehicleType()
//double getRentalPricePerDay()
//void printVehicleDetails()
//void printRentedBy()
//void rentVehicle(Customer customer)
//void returnVehicle(Customer customer)
//
//
//Car and Motorcycle Classes:
//
//Create two abstract classes, Car and Motorcycle, that implement the Vehicle interface. These classes should:
//Implement the necessary methods from the Vehicle interface.
//Store basic vehicle-related information such as license plate, vehicle type, and rental price.
//Maintain a list of customers who have rented the vehicles using an array or ArrayList.
//
//
//Customer Class:
//
//Define a Customer class to store basic customer information such as name, age, and customer ID.
//
//
//Vehicle Implementations:
//
//Create two concrete classes:
//
//Sedan, which extends Car.
//SportBike, which extends Motorcycle.
//Each class should define specific vehicle-related fields and implement any abstract methods.