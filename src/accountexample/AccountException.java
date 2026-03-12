package accountexample;

/**
 * Custom exception class for account operations
 * stores error code and message to describe issue
 */
public class AccountException extends Exception {
    private int errorCode; // error code to identify type of error


     // Constructor accepts error code and message
    public AccountException(int errorCode, String message) {
        super(message); // call parent constructor to set message
        this.errorCode = errorCode;
    }

    /**
     * Returns error code
     */
    public int getErrorCode() {
        return errorCode;
    }
}
