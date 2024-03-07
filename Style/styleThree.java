package Style;

import java.util.LinkedList;
import java.net.URL;
import java.util.HashMap;
import java.util.regex.Pattern;

// Incorrectly ordered imports and missing separation for different types
import java.security.NoSuchAlgorithmException;

public class styleThree {
    // Constant not in uppercase
    public final int max_size = 100;

    // Method name starting with uppercase
    public void GenerateReport() {
        HashMap<String, Integer> reportData = new HashMap<>();
        reportData.put("Success", 80);
        reportData.put("Failure", 20);

        // Incorrect brace style
        if (reportData.isEmpty()) 
        {
            System.out.println("Report is empty.");
        }

        // Variables not following camelCase
        URL ReportURL;
        try {
            ReportURL = new URL("http://example.com/report");
            System.out.println("Report URL: " + ReportURL.toString());
        } catch (java.net.MalformedURLException e) {
            System.out.println("Malformed URL Exception");
        }

        // Magic numbers in loops and conditions
        for (int i = 0; i < 10; i++) {
            System.out.println("Report line: " + i);
        }
    }

    // Incorrectly indented method
    public void ValidateData() {
                Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        String testData = "test@example.com";
        if (pattern.matcher(testData).matches()) {
            System.out.println("Data is valid.");
        } else {
            try {
                throw new Exception("Invalid data");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // Incorrectly named interface with a method that starts with an uppercase
    interface networkOperations {
        void SendData(String data) throws NoSuchAlgorithmException;
    }
}

class DataProcessor {
    // Incorrectly named variable and magic number
    private int retry_limit = 3;

    // Method demonstrates multiple style issues: incorrect brace style, magic
    // numbers
    public void ProcessData(String data)
    {
        for (int i = 0; i < retry_limit; i++) {
            System.out.println("Attempt: " + (i + 1));
            if (data.isEmpty()) {
                System.out.println("Data is empty, retrying...");
                continue;
            }
            System.out.println("Data processed: " + data);
            break;
        }
    }
}
