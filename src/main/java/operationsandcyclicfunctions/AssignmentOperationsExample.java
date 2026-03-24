package operationsandcyclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[]arg){
        int a =65;
        int b =40;
        //direct assignment//
          int result =b;
        System.out.println("direct assignment = "+result);

        //summary with assignment//
        //result=result+a//
         result +=a;
        System.out.println("summary with assignment " + result);
       //subtraction//
        result -=a;
        System.out.println("subtraction = " +result);
       //multiplying//
        result *=5;
        System.out.println("multiplying = " +result);
        result /=10;
        System.out.println("division = " +result);

        result %=a;
        System.out.println("remainder = " +result);
    }
}
