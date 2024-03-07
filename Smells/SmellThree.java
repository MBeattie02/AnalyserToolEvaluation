package Smells;

public class SmellThree {
    public void misleadingExceptionHandling() {
        try {
            // Code that might throw an exception
            throw new Exception("This is a generic exception");
        } catch (Exception e) {
            indirectLoggingMethod(e);
        }
    }

    private void indirectLoggingMethod(Exception e) {
        // Imagine this method is intended to log exceptions, but its name doesn't match common logging conventions
        System.out.println("An exception occurred"); // Doesn't actually log the exception details

        // Further, the method does something with the exception that isn't logging or rethrowing, thus misleading the analysis
        doSomethingWithException(e);
    }

    private void doSomethingWithException(Exception e) {
        // This method pretends to handle the exception but effectively does nothing meaningful with it
        // This could be misleading and considered bad practice, yet might not be caught as a violation
    }

    public static void main(String[] args) {
        FalseNegativeExample example = new FalseNegativeExample();
        example.misleadingExceptionHandling();
    }
}

