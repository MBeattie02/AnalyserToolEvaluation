package Quality;

public class QualityOne {

    // Duplicate method issue: Only one of these method1() should be present
    public void method1() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }

    // Duplicate of the above method
    public void method1() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);
    }


    // Refactor suggestion: Convert loops to stream operations
    public void processList(List<String> items) {
        // This loop can be refactored to a stream operation
        items.forEach(System.out::println);

        // This loop also can be refactored to a stream operation
        items.stream()
             .filter(item -> item.length() > 3)
             .forEach(this::processItem);

        // This loop is more complex and might not be easily refactored
        for (String item : items) {
            if (item.length() > 3) {
                processItem(item);
            } else {
                handleShortItem(item);
            }
        }
    }

    private void processItem(String item) {
        // Some processing on the item
    }

    private void handleShortItem(String item) {
        // Handle items with short length
    }
}
