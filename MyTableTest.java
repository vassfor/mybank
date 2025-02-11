public class MyTableTest {
    public static void main(String args[]) {
        double[] testTable = new double[50];

        MyTable.fillTableRandomly(testTable);
        System.out.println("Printing table elements vertically...");
        MyTable.printTableV(testTable);
        System.out.println("\nPrinting table elements horizontally...");
        MyTable.printTableH(testTable);

        System.out.println("\nSwapping the first and last element...");
        MyTable.swapValues(testTable, 0, testTable.length -1);
        MyTable.printTableH(testTable);

        int minLoc, maxLoc, pos;
        pos = (int)(testTable.length/2);
        minLoc = MyTable.minLocationFrom(testTable, pos);
        maxLoc = MyTable.maxLocationFrom(testTable, pos);
        System.out.println("\nSearching for location of min and max elements (starting from position "+pos+")...");
        System.out.print("min at pos: "+minLoc+"\n"+"max at pos: "+maxLoc+"\n");

        System.out.println("\nCreating a clone of the table...");
        double[] clone1 = MyTable.cloneTable(testTable);
        MyTable.printTableH(clone1);

        System.out.println("\nMerging the table with its clone...");
        double[] merge1 = MyTable.mergeTables(testTable, clone1);
        MyTable.printTableH(merge1);
    }
}