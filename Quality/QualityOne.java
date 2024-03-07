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


    List<String> items = Arrays.asList("apple", "banana", "cherry");
    int[] count = new int[1]; // External mutable state
    
    for (String item : items) {
        if (item.length() > 5) {
            System.out.println(item);
            count[0]++; // Modifies external state based on condition
        }
    }


    private void processItem(String item) {
        // Some processing on the item
    }

    private void handleShortItem(String item) {
        // Handle items with short length
    }
}
