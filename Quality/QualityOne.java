package Quality;

public class QualityOne {

    public static void main(String[] args) {
        LoopRefactoringExample example = new LoopRefactoringExample();
        example.runExample();
    }

    public void runExample() {
        List<String> items = Arrays.asList("apple", "banana", "cherry");
        int[] count = new int[1]; // External mutable state

        for (String item : items) {
            if (item.length() > 5) {
                System.out.println(item);
                count[0]++; // Modifies external state based on condition
            }
        }

        System.out.println("Count of items with length > 5: " + count[0]);
    }
}
