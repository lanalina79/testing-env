package zooclubservice;

public class ZooClubService {
    public static void main(String[] args) {
        Animal lucy = new Cat("Meow", "Filya");
        System.out.println(lucy.getName());
        System.out.println("The cat " + lucy.getName() + " is saying ");
        lucy.eat("fish");
        lucy.makeSound();

        Animal doggy = new Dog("Sharik");
        doggy.eat("meat");
        doggy.makeSound();

        Rooster root = new Rooster("Rocky");
        root.eat("grain");
        root.makeSound();

        Elephant elly = new Elephant("MariaElefant");
        Animal elly1 = new Elephant("Tao");
        elly1.makeSound();
        elly1.eat("apples");

        elly.eat("apples!");
        elly.makeSound();

    }
}
