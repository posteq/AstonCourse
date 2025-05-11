package by.aston.manage;

import by.aston.exception.CustomFileNotFoundException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputTextFromFile {

    public static String getInputText(String fileName) throws CustomFileNotFoundException {
        Path pathToFile = Paths.get(fileName);
        try {
            String inputString = Files.readString(pathToFile);
            System.out.println("File is written successfully");
            return inputString;
        } catch (IOException e) {
            throw new CustomFileNotFoundException("Error while read from file : " + fileName,e);
        }
    }
}
