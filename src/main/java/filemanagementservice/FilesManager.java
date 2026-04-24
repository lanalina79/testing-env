package filemanagementservice;

import java.io.File;
import java.io.IOException;

public class FilesManager {

    public static boolean createTheFileIfDoesNotExist(File file){
        try {
            return file.createNewFile();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
            return false;
        }
    }

    public static void informIfFileExists(File file){
        if(file.exists())
        {System.out.println("File exists");}
        else {
            System.out.println("The file doesn not exist");
        }
    }

    public static void printTheFileName(File file){
        if(file.exists()){
            System.out.println("The file name is "+file.getName());}
            else {
                System.out.println("File doesnt exist and doesnt have the name");
            }
        }

   public static void printTheAbsolutePath(File fileInput){
       System.out.println(fileInput.getAbsolutePath());
   }

   public static void printIfFileIsdirectory(File fileInput){
        if(fileInput.isDirectory()) {
       System.out.println("This is a directory");}
        else{
            System.out.println("This is a file");
        }
   }

public static void deleteFileIfExists(File file){
        if(file.exists()){
            file.delete();
            System.out.println("File is deleted");

        }
        else{
            System.out.println("File doesnt exists, nothing to delete");
        }
}
}
