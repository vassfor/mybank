class Account {
    private int accNo;
    private String accName;
    private double balance;

    public Account(int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccName() {
        return accName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // returns false (and changes nothing) if the account does not have enough money
    public boolean withdraw(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public String toString() {
        return "Account No: " + accNo + "\tName: " + accName + "\tBalance: " + balance + " $";
    }
}
