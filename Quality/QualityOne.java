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


 public void runTasks(List<Task> tasks) {
        Iterator<Task> taskIterator = tasks.iterator();
        while (taskIterator.hasNext()) {
            Task currentTask = taskIterator.next();
            boolean success = currentTask.execute();
            if (!success) {
                // Handle failure, e.g., remove the task or add a new one, which complicates direct refactoring to streams.
                taskIterator.remove();
                tasks.add(new Task()); // Add a new task as a replacement at the end of the list.
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
