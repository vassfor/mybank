public class MyBank {
    public static void main(String args[]) {
        Bank VassoBank = new Bank();

        VassoBank.addAccount(884566, "Nick Brown", 200);
        VassoBank.addAccount(223344, "Nick Brown", 400);
        System.out.println("Total at the moment: " + VassoBank.calcTotal() + " $");
        System.out.println();

        VassoBank.addAccount(11223, "Mary Green", 100);
        VassoBank.addAccount(1999, "Kate Young", 1000);
        VassoBank.addAccount(223344, "George M", 4000);
        VassoBank.addAccount(33366, "Peter Parker", 1200);
        System.out.println("Total at the moment: " + VassoBank.calcTotal() + " $");


        System.out.println();
        for (int i = 0; i < VassoBank.counter; i++) {
            System.out.println(VassoBank.accList[i]);
        }
        
        System.out.println();
        VassoBank.addMoney(1999, 85.50);
        VassoBank.addMoney(99999, 85.50);
        System.out.println("Total at the moment: " + VassoBank.calcTotal() + " $");

        System.out.println();
        VassoBank.removeMoney(33366, 85.50);
        VassoBank.removeMoney(99999, 85.50);
        System.out.println("Total at the moment: " + VassoBank.calcTotal() + " $");

        System.out.println("\nTotal number of accounts with less than 1000 $ is: " + VassoBank.totalAccountsBelow(1000));
        System.out.println("\nMax balance account ID is : " + VassoBank.maxBalanceAccount());

        System.out.println();
        VassoBank.findAcc(223344);
        System.out.println();
        VassoBank.findAcc(44123);
    }
}