import java.util.HashMap;
import java.util.Map;

public class Bank {
    private Map<String, Account> accounts = new HashMap<>();

    public boolean createAccount(String accountNumber, String accountHolder) {
        if (accounts.containsKey(accountNumber)) {
            return false;
        }
        accounts.put(accountNumber, new Account(accountNumber, accountHolder));
        return true;
    }

    public Account getAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }
}
