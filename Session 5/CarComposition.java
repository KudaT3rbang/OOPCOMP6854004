// Engine class to represent the engine type of the car
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

// Tire class to represent the tire type and psi of the car
class Tire {
    private String tireType;
    private int psi;

    public Tire(String tireType, int psi) {
        this.tireType = tireType;
        this.psi = psi;
    }

    public String getTireType() {
        return tireType;
    }

    public int getPsi() {
        return psi;
    }
}

// Manufacturer class to represent the manufacturing department
class Manufacturer {
    private String name;
    private String location;

    public Manufacturer(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}

// Person class to represent the owner of the car
class Person {
    private String name;
    private String contact;

    public Person(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }
}

// Car class that uses Engine, Tire, Manufacturer, and Person classes
class Car {
    private String name; // Car name
    private Engine engine;
    private Tire tire;
    private Manufacturer manufacturer;
    private Person owner; // Added owner attribute

    public Car(String name, Engine engine, Tire tire, Manufacturer manufacturer, Person owner) {
        this.name = name; // Initialize name
        this.engine = engine;
        this.tire = tire;
        this.manufacturer = manufacturer;
        this.owner = owner; // Initialize owner
    }

    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Name: " + name); // Display car name
        System.out.println("Engine Type: " + engine.getType());
        System.out.println("Tire Type: " + tire.getTireType());
        System.out.println("Tire PSI: " + tire.getPsi());
        System.out.println("Manufactured by: " + manufacturer.getName());
        System.out.println("Location: " + manufacturer.getLocation());
        System.out.println("Owner: " + owner.getName());
        System.out.println("Contact: " + owner.getContact());
    }
}

// Main class to test the Car composition
public class CarComposition {
    public static void main(String[] args) {
        Engine engine = new Engine("V8");
        Tire tire = new Tire("All-Season", 32); // Tire type and psi
        Manufacturer manufacturer = new Manufacturer("Engineering Department", "New York"); // Name and location
        Person owner = new Person("John Doe", "123-456-7890"); // Owner's name and contact
        Car car = new Car("SuperCar", engine, tire, manufacturer, owner); // Added owner

        car.displayDetails();
    }
}
