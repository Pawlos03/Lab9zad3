public class Account {
    private String owner;
    private int balance;
    private String accountNumber;

    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void transfer(int amount, String fromAccountNumber) throws NotEnoughMoneyException {
        if (!this.accountNumber.equals(fromAccountNumber)) {
            throw new IllegalArgumentException("Source account number does not match object account.");
        }
        if (amount > balance) {
            throw new NotEnoughMoneyException("Not enough money on account.");
        }
        System.out.println("Transfer from account: " + fromAccountNumber + " sum of: " + amount + " pln");
        balance -= amount;
    }
}