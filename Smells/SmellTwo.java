package Smells;

public class SmellTwo {
    private boolean errorOccurred = false;

    public void exampleMethod() {
        try {
            // Code that might throw an IOException
            throw new IOException("Simulated IO Exception");
        } catch (IOException e) {
            handleExceptionWithoutLoggingOrRethrowing(e);
        }
    }

    private void handleExceptionWithoutLoggingOrRethrowing(Exception e) {
        // Handling exception by setting an error flag instead of logging or rethrowing
        errorOccurred = true;
        // Potentially perform other recovery or notification actions that don't involve logging or rethrowing
    }

    // Main method to run the example
    public static void main(String[] args) {
        ExceptionHandlingExample example = new ExceptionHandlingExample();
        example.exampleMethod();
        if (example.errorOccurred) {
            System.out.println("Error occurred, handled without logging or rethrowing directly.");
        }
    }
}
