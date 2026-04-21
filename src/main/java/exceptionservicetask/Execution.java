package exceptionservicetask;

import java.io.FileNotFoundException;

public class Execution {
    public static void main(String[] args) {
        try {
        TextManager.readDataWithoutTryAndCatch("file.txt");}
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
