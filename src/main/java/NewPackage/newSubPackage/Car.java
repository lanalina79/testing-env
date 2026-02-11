package NewPackage.newSubPackage;

public class Car {
    String color;
    int carNumber;

    //constructor

    public Car(String color, int carNumber){
        this.color=color;
        this.carNumber=carNumber;

    }

    public void findCar(){
        System.out.println("The car is " +color+" and the number is "+carNumber);
    }

}
