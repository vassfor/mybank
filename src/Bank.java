class Bank {
    private Account[] accList = new Account[1000];
    private int counter = 0;

    void addAccount(int ID, String name, double bal) {
        for (int i = 0; i < counter; i++) {
            if (ID == accList[i].getAccNo()) {
                System.out.println("Account number already exists!");
                return;
            }
        }
        if (counter < accList.length) {
            accList[counter] = new Account(ID, name, bal);
            counter++;
            System.out.println("New account " + ID + " successfully registered!");
        } else {
            System.out.println("The bank is full!");
        }
    }

    void addMoney(int ID, double money) {
        if (money <= 0) {
            System.out.println("The amount must be positive!");
            return;
        }
        for (int i = 0; i < counter; i++) {
            if (ID == accList[i].getAccNo()) {
                accList[i].deposit(money);
                System.out.println(money + " $ added to account " + accList[i].getAccNo());
                return;
            }
        }
        System.out.println("No account with ID " + ID + " registered!");
    }

    void removeMoney(int ID, double money) {
        if (money <= 0) {
            System.out.println("The amount must be positive!");
            return;
        }
        for (int i = 0; i < counter; i++) {
            if (ID == accList[i].getAccNo()) {
                if (accList[i].withdraw(money)) {
                    System.out.println(money + " $ removed from account " + accList[i].getAccNo());
                } else {
                    System.out.println("Not enough money in account " + accList[i].getAccNo() + "!");
                }
                return;
            }
        }
        System.out.println("No account with ID " + ID + " registered!");
    }

    double calcTotal() {
        double total = 0.0;
        for (int i = 0; i < counter; i++)
            total += accList[i].getBalance();
        return total;
    }

    int totalAccountsBelow(double limit) {
        int count = 0;
        for (int i = 0; i < counter; i++) {
            if (accList[i].getBalance() < limit) {
                count++;
            }
        }
        return count;
    }

    int maxBalanceAccount() {
        int maxPos = 0;
        double maxBal = 0.0;
        for (int i = 0; i < counter; i++) {
            if (accList[i].getBalance() > maxBal) {
                maxBal = accList[i].getBalance();
                maxPos = i;
            }
        }
        return accList[maxPos].getAccNo();
    }

    void findAcc(int ID) {
        System.out.println("Searching for account with ID " + ID + "...");
        for (int i = 0; i < counter; i++) {
            if (accList[i].getAccNo() == ID) {
                System.out.println(accList[i]);
                return;
            }
        }
        System.out.println("No account with ID " + ID + " registered!");
    }

    void printAccounts() {
        for (int i = 0; i < counter; i++) {
            System.out.println(accList[i]);
        }
    }
}
