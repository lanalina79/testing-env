package classesandobjects.autoservicetask;

import java.util.Arrays;

import static classesandobjects.autoservicetask.Clients.client;

public class Main {
    public static void main(String[] args){
        Worker worker1 = new Worker("Michael", 35);
        worker1.getWorker();
        worker1.getWorker2("Lana",28);

        System.out.println();


        Tool tool = new Tool();


        System.out.println();

        Tool tool2 =new Tool("Tool1", 34);
        tool2.getTool();


        System.out.println();

        Garage garage=new Garage();
        garage.getGarage();

        System.out.println();
        Car carNew=new Car();
        carNew.distance=10000;
        carNew.motorVolume=12.4;
        carNew.plateNumber="ugui69696";
        carNew.color ="green";
        carNew.model="mercedes";
        carNew.giveMeCar();

        System.out.println();
        Car carWithParameter =new Car("BMW");
        carWithParameter.giveMeModel();
        System.out.println();

        Car carWithoutParameter=new Car();
        carWithoutParameter.model="Ferrari";
        carWithoutParameter.giveMeModel();
        System.out.println();


        client.getClient("Jonson","Audi");







    }
}
