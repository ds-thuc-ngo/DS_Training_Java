package exception_handling;

public class InvalidDataException extends RuntimeException{

    public InvalidDataException(String message) {
        super(message);
    }

}
