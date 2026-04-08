package zooclubservice;

public class Elephant extends Animal implements AnimalInterface {

    public Elephant(String name) {
        super(name);
    }

    @Override
    public void eat(String meal) {
        System.out.println(getName() + " eats " + meal);

    }

    @Override
    public void makeSound() {
        System.out.println("The Elephant makes sound");
    }
}
