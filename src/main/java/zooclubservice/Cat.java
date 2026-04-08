package zooclubservice;

public class Cat extends Animal implements AnimalInterface {

    String voice;

    public Cat(String voice, String name) {
        super(name);
        this.voice = voice;

    }

    @Override
    public void makeSound() {
        System.out.println(this.getName() + " makes sound cat");

    }

    @Override
    public void eat(String meal) {
        System.out.println(this.getName() + " is eating  " + meal);

    }
}
