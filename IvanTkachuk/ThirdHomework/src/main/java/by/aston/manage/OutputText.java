package by.aston.manage;

import by.aston.exception.CustomFileNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardOpenOption.APPEND;

public class OutputText {
    public static void outputText(String text,String fileName) throws CustomFileNotFoundException {
        Path pathToFile = Paths.get(fileName);
        try {
            checkAndCreate(pathToFile);
            Files.writeString(pathToFile,text,APPEND);
            System.out.println("File written to : " + pathToFile);
        } catch (IOException e) {
            throw new CustomFileNotFoundException("Error while write to file :" + fileName,e);
        }
    }

    private static void checkAndCreate(Path pathToFile) throws CustomFileNotFoundException {
        try {
            if(!Files.exists(pathToFile)) {
                Files.createDirectory(pathToFile.getParent());
                System.out.println("Creating directory : " + pathToFile.getParent());
            }
            if(!Files.exists(pathToFile)) {
                Files.createFile(pathToFile);
                System.out.println("Creating file : " + pathToFile);
            }
        } catch (IOException e) {
            throw new CustomFileNotFoundException("Error while write to file ",e);
        }
    }
}
