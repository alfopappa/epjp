package b06.s073;

public class Main {
    public static void main(String[] args) {
        // Cat cat = (Cat) new Dog();

        Pet pet = new Dog("Bob");
        
        // risky
        Dog dog = (Dog) pet;
        dog.bark();

        // no, no, no!!!
        Cat cat = (Cat) pet; // java.lang.ClassCastException
        System.out.println(System.identityHashCode(cat));

        if (pet instanceof Cat) {
            Cat tom = (Cat) pet;
            tom.meow();
        }

    }
}
