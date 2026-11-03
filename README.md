# MyBank

A small Java console program that simulates basic bank account management. It registers accounts, deposits and withdraws money, and reports statistics about the accounts stored in the bank.

## Features

- Register new accounts (an account number can only be used once)
- Deposit money into an account and withdraw money from it
- Calculate the total amount of money held by the bank
- Count the accounts with a balance below a given limit
- Find the account with the highest balance
- Search for an account by its account number
- Clear messages for unknown account numbers and duplicate registrations

## Tech Stack

- Java (JDK 8 or later)
- Plain console application, no external libraries

## Project Structure

```
├── src/
│   ├── Account.java   # A bank account: number, owner name, balance
│   ├── Bank.java      # Stores the accounts and implements the operations
│   └── MyBank.java    # Entry point with a demo scenario
├── .gitignore
└── README.md
```

## Getting Started

### Prerequisites

A Java Development Kit (JDK 8 or later). Check with:

```bash
java -version
javac -version
```

### Build and run

```bash
git clone https://github.com/vassfor/mybank.git
cd mybank
javac -d out src/*.java
java -cp out MyBank
```

## Example Output

`MyBank` runs a demo scenario that registers accounts, tries a duplicate account number and an unknown one, moves money and prints the statistics:

```
New account 884566 successfully registered!
New account 223344 successfully registered!
Total at the moment: 600.0 $

New account 11223 successfully registered!
New account 1999 successfully registered!
Account number already exists!
New account 33366 successfully registered!
Total at the moment: 2900.0 $

Account No: 884566	Name: Nick Brown	Balance: 200.0 $
Account No: 223344	Name: Nick Brown	Balance: 400.0 $
Account No: 11223	Name: Mary Green	Balance: 100.0 $
Account No: 1999	Name: Kate Young	Balance: 1000.0 $
Account No: 33366	Name: Peter Parker	Balance: 1200.0 $

85.5 $ added to account 1999
No account with ID 99999 registered!
Total at the moment: 2985.5 $

85.5 $ removed from account 33366
No account with ID 99999 registered!
Total at the moment: 2900.0 $

Total number of accounts with less than 1000 $ is: 3

Max balance account ID is : 33366

Searching for account with ID 223344...
Account No: 223344	Name: Nick Brown	Balance: 400.0 $

Searching for account with ID 44123...
No account with ID 44123 registered!
```

## Author

**vassfor** – [GitHub](https://github.com/vassfor)
