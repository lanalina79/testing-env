package exceptionservicetask;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        System.out.println(TextManager.getTheTextLength("mama"));
        //System.out.println(TextManager.getTheTextLength(null));
        System.out.println(TextManager.getTheTextLength("tata"));

        System.out.println(TextManager.getTheTextWithTryAndCatch(null));
        System.out.println(TextManager.getTheTextWithTryAndCatch("tata"));

        System.out.println(TextManager.getTextLength(null));

        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(3,1));


        TextManager.readDataWithTryAndCatch("file.txt");

         try{
        TextManager.readDataWithoutTryAndCatch("text.txt");}
         catch(FileNotFoundException exception){
             exception.printStackTrace();

         }
        System.out.println("Last Line");

        /* System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(3,0));
          System.out.println("Show must go on");*/

        System.out.println(ArithmeticOperationService.divideWithExceptionHandling(3,0));
        System.out.println("Show must go on");

    }
}
