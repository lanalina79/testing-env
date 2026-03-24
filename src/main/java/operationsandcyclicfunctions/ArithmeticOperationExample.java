package operationsandcyclicfunctions;

import java.util.Arrays;

public class ArithmeticOperationExample {
    public static void main(String[] args) {
        int a =48;
        int b=10;
        int result =a+b;

        System.out.println("sumymarr = " + (a+b));
        System.out.println("sumymarr = " + result);

        result =a-b;
        System.out.println("scadere = " + result);

        int result1 =a*b;
        System.out.println("multiplying = " + result1);

        //forced parsing - transforamrea inte=> double//
        double result2=(double)b/a;
        System.out.println("division = "+result2);

        int result3 = a%b;
        System.out.println("remainder = "+ result3 );


    }
}
