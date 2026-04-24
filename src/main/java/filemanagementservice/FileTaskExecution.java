package filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FileTaskExecution {
    public static void main(String[] args) throws IOException {
        File fileObject =new File("src/main/java/filemanagementservice.fisier.txt");
       // System.out.println(fileObject.isFile());
        //System.out.println(fileObject.createNewFile());
        //System.out.println(fileObject.getPath());
       // fileObject.delete();
        //System.out.println(fileObject.isFile());
        FilesManager.informIfFileExists(fileObject);
        //System.out.println(FilesManager.createTheFileIfDoesNotExist(fileObject));
        FilesManager.informIfFileExists(fileObject);

        FilesManager.printTheFileName(fileObject);
        FilesManager.printTheAbsolutePath(fileObject);
        FilesManager.printIfFileIsdirectory(fileObject);
        FilesManager.deleteFileIfExists(fileObject);

        String path ="src/main/java/filemanagementservice/writedata.txt";
        OutputFilesWriterManager.wrightDataIntoFileUsingFileWriter(path,"Hello");
        OutputFilesWriterManager.wrightDataIntoFileUsingFileWriter(path,"Hi");

        String path1 ="src/main/java/filemanagementservice/bufferedwriter.txt";
        OutputFilesWriterManager.writeDataIntoFileUsingBufferWriter(path1,"BufferedWriter");

        InputFilesReaderManager.printDateFromFile(path1);
        InputFilesReaderManager.PrintDataFromFileUsingFilereader(path);
        InputFilesReaderManager.PrintDataFromFileUsingBufferedReader(path);


    }
}
