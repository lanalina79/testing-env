package classesandobjects.autoservicetask;

public class Car {
    String plateNumber;
    String model;
    String color;
    double motorVolume;
    int distance;

    public Car(){}
    public void giveMeCar(){
        System.out.println("This is a car with "+model + " of " + color +" color and"  + plateNumber
                +" number with " +motorVolume +" motro volume and " + distance +" distance." );
    }

    public Car(String model){
        this.model=model;
        System.out.println("model = " + model);
    }
    public void giveMeModel(){
        System.out.println("this model = " + model);
    }

}
