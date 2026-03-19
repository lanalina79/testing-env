package classesandobjects.autoservicetask;

public class Tool {
    String toolName;
    String toolOwner;
    int toolNumber;

    public Tool(){
        System.out.println("this is the message for default constructor without parameters");
    }
    public Tool(String toolName, int toolNumber){
        this.toolName=toolName;
        this.toolNumber=toolNumber;
    }
    public void getTool(){
        System.out.println("parametr toolName = " + toolName + " parametr toolNumber = " + toolNumber);
    }

}


