interface Vehicle {
    String getLicensePlate();

    String getVehicleType();

    double getRentalPricePerDay();

    void printVehicleDetails();

    void printRentedBy();

    void rentVehicle(Customer customer) throws Exception;

    void returnVehicle(Customer customer) throws Exception;
}

class Customer {
    private String name;
    private String contactNumber;

    public Customer(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }
}

abstract class Car implements Vehicle {
    protected String licensePlate;
    protected String vehicleType;
    protected double rentalPricePerDay;
    protected ArrayList<Customer> rentedBy;
    protected int numberOfDoors;
    protected String transmissionType;

    public Car(String licensePlate, String vehicleType, double rentalPricePerDay, int numberOfDoors, String transmissionType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.rentalPricePerDay = rentalPricePerDay;
        this.rentedBy = new ArrayList<>();
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Rental Price Per Day: $" + rentalPricePerDay);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Transmission Type: " + transmissionType);
    }

    @Override
    public void printRentedBy() {
        if (rentedBy.isEmpty()) {
            System.out.println("This vehicle is currently not rented.");
        } else {
            System.out.println("Rented by:");
            for (Customer customer : rentedBy) {
                System.out.println("- " + customer.getName());
            }
        }
    }

    @Override
    public void rentVehicle(Customer customer) throws Exception {
        if (rentedBy.isEmpty()) {
            rentedBy.add(customer);
            System.out.println("Vehicle rented successfully to " + customer.getName());
        } else {
            throw new Exception("This vehicle is already rented.");
        }
    }

    @Override
    public void returnVehicle(Customer customer) throws Exception {
        if (rentedBy.contains(customer)) {
            rentedBy.remove(customer);
            System.out.println("Vehicle returned successfully by " + customer.getName());
        } else {
            throw new Exception("This customer has not rented this vehicle.");
        }
    }
}

abstract class Motorcycle implements Vehicle {
    protected String licensePlate;
    protected String vehicleType;
    protected double rentalPricePerDay;
    protected ArrayList<Customer> rentedBy;
    protected int engineCapacity;

    public Motorcycle(String licensePlate, String vehicleType, double rentalPricePerDay, int engineCapacity) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.rentalPricePerDay = rentalPricePerDay;
        this.rentedBy = new ArrayList<>();
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getLicensePlate() {
        return licensePlate;
    }

    @Override
    public String getVehicleType() {
        return vehicleType;
    }

    @Override
    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    @Override
    public void printVehicleDetails() {
        System.out.println("License Plate: " + licensePlate);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Rental Price Per Day: $" + rentalPricePerDay);
        System.out.println("Engine Capacity: " + engineCapacity);
    }

    @Override
    public void printRentedBy() {
        if (rentedBy.isEmpty()) {
            System.out.println("This vehicle is currently not rented.");
        } else {
            System.out.println("Rented by:");
            for (Customer customer : rentedBy) {
                System.out.println("- " + customer.getName());
            }
        }
    }

    @Override
    public void rentVehicle(Customer customer) throws Exception {
        if (rentedBy.isEmpty()) {
            rentedBy.add(customer);
            System.out.println("Vehicle rented successfully to " + customer.getName());
        } else {
            throw new Exception("This vehicle is already rented.");
        }
    }

    @Override
    public void returnVehicle(Customer customer) throws Exception {
        if (rentedBy.contains(customer)) {
            rentedBy.remove(customer);
            System.out.println("Vehicle returned successfully by " + customer.getName());
        } else {
            throw new Exception("This customer has not rented this vehicle.");
        }
    }
}

class Sedan extends Car {
    public Sedan(String licensePlate, String vehicleType, double rentalPricePerDay) {
        super(licensePlate, vehicleType, rentalPricePerDay, 4, "Automatic");
    }
}

class SportBike extends Motorcycle {
    public SportBike(String licensePlate, String vehicleType, double rentalPricePerDay) {
        super(licensePlate, vehicleType, rentalPricePerDay, 600);
    }
}