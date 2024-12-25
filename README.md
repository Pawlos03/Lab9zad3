# Account Management Project

## Project Description

The project simulates a simple bank account management system. It allows for:

- Creating bank accounts.
- Storing and managing accounts using the `AccountManager` class.
- Performing transfers from one account to another.
- Handling exceptions related to insufficient funds or incorrect account numbers.

## Project Structure

### Classes

1. **`Account`**:

   - Represents a bank account with the following fields:
     - `owner` - the account owner.
     - `balance` - the account balance.
     - `accountNumber` - a unique account number.
   - The `transfer` method enables transfers while checking the balance and the source account number.
   - Throws the `NotEnoughMoneyException` in case of insufficient funds.

2. **`NotEnoughMoneyException`**:

   - An exception indicating that the account balance is too low to perform the transfer.

3. **`AccountManager`**:

   - Stores a list of `Account` objects.
   - Allows adding new accounts (`addAccount`) and finding accounts by account number (`findAccountByNumber`).

4. **`Main`**:

   - The main class containing the `main` method.
   - Simulates account creation, management, and transfer execution.
   - Handles exceptions related to invalid operations on accounts.

## How the Project Works

1. **Creating Accounts**:

   - In the `Main` class, `Account` objects are created for two users: Jan Kowalski and Anna Nowak.

2. **Adding Accounts to the Manager**:

   - Accounts are added to the list in the `AccountManager` object using the `addAccount` method.

3. **Finding an Account**:

   - An account is searched by its account number using the `findAccountByNumber` method.

4. **Simulating a Transfer**:

   - The `transfer` method attempts to execute a transfer. If the amount exceeds the balance, the `NotEnoughMoneyException` is thrown.

5. **Exception Handling**:

   - Exceptions are handled in a `try-catch` block:
     - `NotEnoughMoneyException` - insufficient funds.
     - `IllegalArgumentException` - incorrect account number.
     - `Exception` - other unexpected exceptions.
   - The `finally` clause prints the current account state after the operation.

## Example Workflow

1. Two accounts are created:

   - Jan Kowalski: balance 1000, account number "123456789".
   - Anna Nowak: balance 2000, account number "987654321".

2. Jan Kowalski's account is searched by the account number "123456789".

3. An attempt to transfer 1500 from Jan Kowalski's account results in a `NotEnoughMoneyException`.

4. The current state of Jan Kowalski's account is printed:

   - Owner: Jan Kowalski
   - Account Number: 123456789
   - Balance: 1000

## How to Run

1. Compile the project in a JDK environment.
2. Run the `Main` class.
3. Check the results in the console.

