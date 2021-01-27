package core;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Util {
    private static final String RESOURCE_PATH = "/src/resources/";

    public static Scanner getScanner(String fileName) throws FileNotFoundException {
       return new Scanner(new File(System.getProperty("user.dir") + RESOURCE_PATH + fileName));
    }
}
