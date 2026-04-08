package zooclubservice;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat(String meal) {
        System.out.println(this.getName() + " eat meat");
    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " The dog makes sound");
    }
}

