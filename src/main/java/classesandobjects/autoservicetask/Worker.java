package classesandobjects.autoservicetask;

public class Worker {
    String workerName;

    int workerAge;


    public Worker(String workerName, int workerAge){
        this.workerName=workerName;
        this.workerAge=workerAge;
    }

    public void getWorker(){
        System.out.println("The worker name is " + workerName);
        System.out.println("The worker age is " + workerAge);
    }
    public void getWorker2(String workerName, int workerAge){
        System.out.println("This is the second method for "+ workerName+" and "+workerAge);

    }

}
