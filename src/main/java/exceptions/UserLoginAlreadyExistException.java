package exceptions;

public class UserLoginAlreadyExistException extends Exception {

    public UserLoginAlreadyExistException(String message) {
        super(message);
    }
}
