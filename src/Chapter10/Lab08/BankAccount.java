package Chapter10.Lab08;

public class BankAccount {
    private String username;
    private String password;
    private double balance;

    public BankAccount(String _username, String _password, double _balance) {
        this.username = _username;
        this.validatePassword(_password);
        this.password = _password;
        this.balance = _balance;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void withDrawMoney(double _amount) throws NegativeBalanceException {
        if (_amount > this.balance) {
            throw new NegativeBalanceException("Insufficient current balance!");
        }

        double remainingBalance = (double) this.balance - _amount;
        System.out.printf("Remaining balance: %.2f\n", remainingBalance);
    }

    private void validatePassword(String _password) {
        if (_password.length() < 6) {
            throw new WeakPasswordException("The password must be at least 6 characters long.");
        }
    }
}
