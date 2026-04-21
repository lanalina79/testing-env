package exceptionservicetask;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class TextManager {
    public static int getTheTextLength(String text) {

        return text.length();

    }

    public static int getTheTextWithTryAndCatch(String text) {
        try {
            return text.length();
        } catch (NullPointerException exceptionObject) {
            System.out.println("There is an exception " + exceptionObject.getMessage());
            return 0;
        } finally {
            System.out.println("That's printing all the time");
        }
    }

    public static int getTextLength(String text) {
        try {
            System.out.println(text.length());
        } catch (Exception exceptionObject) {
            System.out.println("This is an exception of parent Exception heritage " + exceptionObject);
        }
        return 0;
    }

    public static int getTextLengthWithIf(String text) {
        if (text == null) {
            System.out.println(text.length());
            return 0;
        } else {
            return text.length();
        }
    }

    public static void readDataWithTryAndCatch(String fileName) {
        //BufferedReader reader = new BufferedReader(new FileReader(fileName));
        try {
            FileReader fileReader = new FileReader(fileName);

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Continuam executia dar afisam masajul obiectuluiexceptiei capturate  " + fileNotFoundException.getMessage());
        }
        System.out.println("FileReader was created " + fileName);

    }

    public static void readDataWithoutTryAndCatch(String file) throws FileNotFoundException {
        FileReader fileReader=new FileReader(file);
        System.out.println("FileReader was created " + file);
    }
}

