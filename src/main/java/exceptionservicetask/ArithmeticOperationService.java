package exceptionservicetask;

import java.io.BufferedReader;
import java.io.FileReader;

public class ArithmeticOperationService {

    public static double divideWithoutExceptionHandling(int numitor, int numarator){
        int result = numitor/numarator;
        return result;

    }

    public static double divideWithExceptionHandling(int numitor, int numarator){
        try{
        int result=numitor/numarator;
        return result;}
        catch(ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
            return 0;
        }
    }


}
