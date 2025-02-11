class Account {
    int accNo;
    String accName;
    double balance;

    public Account (int accNo, String accName, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.balance = balance;
    }

    public String toString() {
        return "Account No: " + accNo + "\tName: " + accName + "\tBalance: " + balance + " $";
    }
}