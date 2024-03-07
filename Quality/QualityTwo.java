package Quality;

import java.util.List;

public class QualityTwo {

    // Duplicate method issue: Only one of these method2() should be present
    public void method2() {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);
    }

    // Duplicate of the above method
    public void method2() {
        int product = 1;
        for (int i = 1; i <= 5; i++) {
            product *= i;
        }
        System.out.println("Product: " + product);
    }


    // Refactor suggestion: Convert loops to stream operations
    public void processNumbers(List<Integer> numbers) {
        // This loop can be refactored to a stream operation
        numbers.forEach(System.out::println);

        // This loop also can be refactored to a stream operation
        numbers.stream()
               .filter(number -> number > 10)
               .forEach(this::processNumber);

        // This loop is more complex and might not be easily refactored
        for (Integer number : numbers) {
            if (number > 10) {
                processNumber(number);
            } else {
                handleSmallNumber(number);
            }
        }
    }

    private void processNumber(Integer number) {
        // Some processing on the number
    }

    private void handleSmallNumber(Integer number) {
        // Handle numbers <= 10
    }
}

