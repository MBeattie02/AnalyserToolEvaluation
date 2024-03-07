package Quality;

import java.util.ArrayList;
import java.util.List;

public class QualityThree {

    // Duplicate method issue: Only one of these method3() should be present
    public void method3() {
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += i;
        }
        System.out.println("Total: " + total);
    }

    // Duplicate of the above method
    public void method3() {
        int total = 0;
        for (int i = 0; i <= 10; i++) {
            total += i;
        }
        System.out.println("Total: " + total);
    }

    public List<Integer> filterEvenNumbers(List<Integer> numbers) {
            List<Integer> evenNumbers = new ArrayList<>();
            for (Integer number : numbers) {
                if (number % 2 == 0) {
                    evenNumbers.add(number);
                }
            }
            return evenNumbers;
        }

    private void analyzeDatum(Double datum) {
        // Analyze data point
    }

    private void handleInsufficientDatum(Double datum) {
        // Handle data points <= 5.0
    }
}
