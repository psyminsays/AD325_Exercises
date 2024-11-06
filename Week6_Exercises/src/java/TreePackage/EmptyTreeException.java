package TreePackage;

public class EmptyTreeException extends RuntimeException {

    // Default constructor
    public EmptyTreeException() {
        super("The tree heap is empty.");
    }

    // Constructor that accepts a custom message
    public EmptyTreeException(String message) {
        super(message);
    }

    // Constructor that accepts a custom message and the cause of the exception
    public EmptyTreeException(String message, Throwable cause) {
        super(message, cause);
    }

    // Constructor that accepts the cause of the exception
    public EmptyTreeException(Throwable cause) {
        super(cause);
    }
}
