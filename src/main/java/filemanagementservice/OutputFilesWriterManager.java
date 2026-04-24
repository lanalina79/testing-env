package filemanagementservice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFilesWriterManager {
    public static void wrightDataIntoFileUsingFileWriter(String filePath, String content){
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(filePath);
            fileWriter. write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(fileWriter!=null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public static void writeDataIntoFileUsingBufferWriter(String filePath, String content){
        BufferedWriter bufferedWriter=null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(filePath));
            bufferedWriter.write(content);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            if(bufferedWriter!=null){
                try {
                    bufferedWriter.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
