package filemanagementservice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

import static java.nio.file.Files.readString;

public class InputFilesReaderManager {
    public static void printDateFromFile(String file) {
        try {
            System.out.println(readString(Path.of(file)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void PrintDataFromFileUsingFilereader(String path) {
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(path);
            int charNumber;
            while ((charNumber = fileReader.read()) != -1) {
                System.out.print((char) charNumber);
                //System.out.println();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


    public static void PrintDataFromFileUsingBufferedReader(String path) throws IOException {
        BufferedReader bufferedReader=null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            String line;
            while ((line = bufferedReader.readLine())!=null){
            System.out.println(line);}
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(bufferedReader !=null){
                bufferedReader.close();
            }
        }
    }
}
