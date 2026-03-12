package accountexample;

/**
 * Test class for AccountExample
 * calling methods and handling AccountException
 */
public class AccountExampleTest {
    public static void main(String[] args) {
        // Creates instance of AccountExample
        AccountExample example = new AccountExample();

        try {
            // use wrong account number to trigger exception
            example.addAmount(123, 500);
        } catch (AccountException e) {
            System.out.println("AddAmount failed: " + e.getMessage() + " (Error code: " + e.getErrorCode() + ")");
        }

        try {
            // use wrong account number to trigger exception
            example.deleteAmount(555, 200);
        } catch (AccountException e) {
            System.out.println("DeleteAmount failed: " + e.getMessage() + " (Error code: " + e.getErrorCode() + ")");
        }
    }
}
