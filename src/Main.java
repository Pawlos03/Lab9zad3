public class Main {
    public static void main(String[] args) {
        AccountManager manager = new AccountManager();

        Account account1 = new Account("Jan Kowalski", 1000, "123456789");
        Account account2 = new Account("Anna Nowak", 2000, "987654321");

        manager.addAccount(account1);
        manager.addAccount(account2);

        String searchNumber = "123456789";
        Account foundAccount = manager.findAccountByNumber(searchNumber);

        if (foundAccount != null) {
            System.out.println("Found account owner: " + foundAccount.getOwner());
            try {
                foundAccount.transfer(1500, searchNumber);
            } catch (NotEnoughMoneyException e) {
                System.out.println("Exception: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Another exception occurred: " + e.toString());
            } finally {
                System.out.println("Actual balance: " + foundAccount.getOwner() + ", account number: " + foundAccount.getAccountNumber() + ", balance: " + foundAccount.getBalance() + " pln");
            }
        } else {
            System.out.println("Didn't find account with number: " + searchNumber);
        }
    }
}