class Vehicle {
    public void move() {
        System.out.println("A vehicle moves.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("A car drives on the road.");
    }

    public void move(int speed) {
        System.out.println("A car is driving at " + speed + " km/h.");
    }
}

class Boat extends Vehicle {
    @Override
    public void move() {
        System.out.println("A boat sails on water.");
    }

    public void move(String direction) {
        System.out.println("The boat is sailing " + direction + ".");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Vehicle myCar = new Car();
        Vehicle myBoat = new Boat();

        myVehicle.move();
        myCar.move();
        myBoat.move();

        Car specificCar = new Car();
        specificCar.move();
        specificCar.move(120);

        Boat specificBoat = new Boat();
        specificBoat.move();
        specificBoat.move("north");
    }
}
