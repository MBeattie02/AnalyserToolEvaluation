package Style;

import java.util.Date;
import java.util.ArrayList;
import java.util.Arrays;

// Incorrectly ordered imports 
import java.io.File;

public class styleTwo {
    // Constant not in uppercase
    public final String file_path = "/tmp/data";

    // Method name starting with uppercase and incorrect brackets
    public void ReadFile() {
        File file = new File(file_path);
        System.out.println("Reading file: " + file.getAbsolutePath());

        // Incorrect brace style
        if (file.exists()) {
            System.out.println("File exists.");
        }

        // Variables not following camelCase
        int FileSize = 1024;
        int buffer_Length = 512;

        // Usage of magic numbers in condition
        if (FileSize > 1000) {
            System.out.println("Large file");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Line: " + i);
        }
    }

    public void ListFiles() {
        System.out.println("Listing files:");
        // Incorrect indentation
        File dir = new File(file_path);
        Arrays.asList(dir.listFiles()).forEach(file -> System.out.println(file.getName()));
    }

    // Incorrectly named interface with method starting with uppercase
    interface fileOperations {
        void DeleteFile(String path);
    }
}

class Utility {
    // Constant not in uppercase
    public static final double version = 1.0;

    // Method name starting with uppercase
    public static void PrintVersion() {
        System.out.println("Utility version: " + version);
    }

    // Incorrectly named variable (should be in camelCase)
    public void SetTimeout(int Seconds) {
        System.out.println("Timeout set to: " + Seconds + " seconds.");
    }
}
