package Quality;

import java.util.Arrays;
import java.util.List;

public class QualityOne {

    public static void main(String[] args) {
        QualityOne example = new QualityOne();
        example.processItems();
    }

    public void processItems() {
        List<String> items = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        for (String item : items) {
            if (item.length() <= 5) {
                System.out.println("Short: " + item);
                // Imagine this calls a method that's not just printing but doing some complex processing
            } else {
                System.out.println("Long: " + item);
                // Imagine this calls a different method with its own complex processing
                // Further, assume we also modify the item in some way here that affects future operations
            }
        }
    }
}
