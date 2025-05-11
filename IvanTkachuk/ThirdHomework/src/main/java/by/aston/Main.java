package by.aston;

import by.aston.manage.InputTextFromFile;
import by.aston.manage.OutputText;
import by.aston.exception.CustomFileNotFoundException;

public class Main {

    private static final String PATH_TO_INPUT_FILE = "cause/test1.txt";
    private static final String WRONG_PATH_TO_INPUT_FILE = "ttt";
    private static final String OUTPUT_TEXT = "My new String test \n";

    public static void main(String[] args) {

        checkFileIsExist();

        checkWriteToFile();

        checkFileIsMissing();
    }

    private static void checkFileIsExist() {
        try {
            String file = InputTextFromFile.getInputText(PATH_TO_INPUT_FILE);
            System.out.println("Written file : \n" + file);
        } catch (CustomFileNotFoundException e) {
            System.err.println(e.getClass().getSimpleName() + "\n"+e.getMessage());
        }
    }

    private static void checkWriteToFile() {
        try {
            OutputText.outputText(OUTPUT_TEXT, PATH_TO_INPUT_FILE);
        } catch (CustomFileNotFoundException e) {
            System.err.println(e.getClass().getSimpleName() + "\n"+e.getMessage());
        }
    }

    private static void checkFileIsMissing() {
        try {
            String file = InputTextFromFile.getInputText(WRONG_PATH_TO_INPUT_FILE);
            System.out.println(file);
        } catch (CustomFileNotFoundException e) {
            System.err.println(e.getClass().getSimpleName() + "\n"+e.getMessage());
        }
    }
}
