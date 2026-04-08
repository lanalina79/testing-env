package zooclubservice;

public class Rooster extends Animal {

    public Rooster(String name) {
        super(name);
    }

    @Override
    public void eat(String meal) {
        System.out.println(getName() + " is eating " + meal);
    }

    @Override
    public void makeSound() {
        System.out.println("the Rooster is making sound");
    }
}
