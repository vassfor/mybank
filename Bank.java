class Bank {
    static Account[] accList = new Account[1000];
    static int counter = 0;

    void addAccount(int ID, String name, double bal) {
        for (int i = 0; i < counter; i++) {
            if (ID == accList[i].accNo){
                System.out.println("Account number already exists!");
                return;
            }
        }
        if (counter < accList.length) {
            accList[counter] = new Account(ID, name, bal);
            counter++;
            System.out.println("New account " + ID + " successfully registered!");
        } else {
                System.out.println("Out of memory!");
        }
    }
    
    void addMoney(int ID, double money) {
        for (int i = 0; i < counter; i++) {
            if (ID == accList[i].accNo) {
                accList[i].balance += money;
                System.out.println(money + " $ added to account " + accList[i].accNo);
                return;
            }
        }
        System.out.println("No account with ID " + ID +" registered!");
    }

    void removeMoney(int ID, double money) {
        for (int i = 0; i < counter; i++) {
            if (ID == accList[i].accNo) {
                accList[i].balance -= money;
                System.out.println(money + " $ removed from account " + accList[i].accNo);
                return;
            }
        }
        System.out.println("No account with ID " + ID +" registered!");
    }

    double calcTotal() {
        double total = 0.0;
        for (int i = 0; i < counter; i++)
            total += accList[i].balance;
        return total;
    }
    
    int totalAccountsBelow(double limit) {
        int count = 0;
        for (int i = 0; i < counter; i++) {
            if (accList[i].balance < limit) {
                count++;
            }
        }
        return count;
    }
    
    int maxBalanceAccount() {
        int maxPos = 0;
        double maxBal = 0.0;
        for (int i = 0; i < counter; i++) {
            if(accList[i].balance > maxBal) {
                maxBal = accList[i].balance;
                maxPos = i;
            }
        }
        return accList[maxPos].accNo;
    }

    void findAcc(int ID) {
        Account acc;
        System.out.println("Searching for account with ID "+ ID + "...");
        for (int i = 0; i < counter; i++) {
            if (accList[i].accNo == ID) {
                acc = accList[i];
                System.out.println(accList[i]);
                return;
            }
        }
        System.out.println("No account with ID " + ID +" registered!");
    }
}