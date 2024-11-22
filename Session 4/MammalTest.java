abstract class Mammal {
    private String name;
    private int age;

    public Mammal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract void breastfeed();
    public abstract void makeSound();
}

class Dog extends Mammal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void breastfeed() {
        System.out.println(getName() + " is breastfeeding its puppies.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " barks: Woof woof!");
    }
}

class Cat extends Mammal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public void breastfeed() {
        System.out.println(getName() + " is breastfeeding its kittens.");
    }

    public void makeSound() {
        System.out.println(getName() + " meows: Meow!");
    }
}

public class MammalTest {
    public static void main(String[] args) {
        Mammal dog = new Dog("Buddy", 5);
        Mammal cat = new Cat("Whiskers", 3);

        dog.breastfeed();
        dog.makeSound();

        cat.breastfeed();
        cat.makeSound();
    }
}
