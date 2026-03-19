package classesandobjects.autoservicetask;

public class Clients {

    String clientName;
    String clientCar;

    public static Clients client =new Clients();
    private Clients(){}

    public void getClient(String clientName,String clientCar){
        this.clientName=clientName;
        this.clientCar=clientCar;

        System.out.println("clientName = " + clientName + ", clientCar = " + clientCar);
    }


}
