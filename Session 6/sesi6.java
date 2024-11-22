abstract class Car {
    String name;
    int capacity;
    int speed;

    public Car(String name, int capacity, int speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSpeed() {
        return speed;
    }
}

class Jeep extends Car {
    public Jeep(String name) {
        super(name, 30, 120);
    }
}

class SUV extends Car {
    public SUV(String name) {
        super(name, 15, 100);

    }
}

class Sedan extends Car {
    public Sedan(String name) {
        super(name, 10, 120);
    }
}

class Showroom {
    private java.util.List<Car> cars;
    private java.util.Scanner scanner;

    public Showroom() {
        cars = new java.util.ArrayList<>();
        scanner = new java.util.Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("\n=== Car Showroom Menu ===");
            System.out.println("1. Buy");
            System.out.println("2. Show");
            System.out.println("3. Exit");
            System.out.print("Choose menu (1-3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    buyMenu();
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    System.out.println("Thank you for visiting!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void buyMenu() {
        System.out.println("\n=== Buy a Car ===");
        System.out.println("Car types:");
        System.out.println("1. Jeep (Capacity: 30, Speed: 120)");
        System.out.println("2. SUV (Capacity: 15, Speed: 100)");
        System.out.println("3. Sedan (Capacity: 10, Speed: 120)");
        System.out.print("Choose car type (1-3): ");

        int type = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter car name: ");
        String name = scanner.nextLine();

        Car newCar = null;
        switch (type) {
            case 1:
                newCar = new Jeep(name);
                break;
            case 2:
                newCar = new SUV(name);
                break;
            case 3:
                newCar = new Sedan(name);
                break;
            default:
                System.out.println("Invalid car type!");
                return;
        }

        cars.add(newCar);
        System.out.println("Car purchased successfully!");
    }

    private void showMenu() {
        System.out.println("\n=====");
        System.out.println("Jeep");
        System.out.println("=====");
        printCarsByType(Jeep.class);

        System.out.println("\n=====");
        System.out.println("SUV");
        System.out.println("=====");
        printCarsByType(SUV.class);

        System.out.println("\n=====");
        System.out.println("Sedan");
        System.out.println("=====");
        printCarsByType(Sedan.class);
    }

    private void printCarsByType(Class<?> carType) {
        boolean found = false;
        for (Car car : cars) {
            if (car.getClass() == carType) {
                System.out.println(car.getName());
                found = true;
            }
        }
        if (!found) {
            System.out.println("-");
        }
    }
}

public class sesi6 {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        showroom.start();
    }
}