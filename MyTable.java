class MyTable {

    static void fillTableRandomly(double[] d) {
        for (int i = 0; i < d.length; i++)
            d[i] = Math.random()*10;
    }

    static void printTableH(double[] d){
        for (int i = 0; i < d.length; i++)
            System.out.print(d[i]+"\t");
        System.out.println();
    }

    static void printTableV(double[] d){
        for (int i = 0; i < d.length; i++)
            System.out.println(d[i]);
    }
    
    static void swapValues(double[] d, int i1, int i2) {
        double temp = d[i1];
        d[i1] = d[i2];
        d[i2] = temp;
    }

    static int minLocationFrom(double[] d, int from) {
        double min = d[from];
        int loc1 = from;
        for (int i = from; i < d.length; i ++) {
            if (d[i] < min) {
                min = d[i];
                loc1 = i;
            }
        }
        return loc1;
    }

    static int maxLocationFrom(double[] d, int from) {
        double max = d[from];
        int loc2 = from;
        for (int i = from; i < d.length; i ++) {
            if (d[i] > max) {
                max = d[i];
                loc2 = i;
            }   
        }
        return loc2;
    }

    static double[] cloneTable(double[] d){
        double[] clone = new double[d.length];
        for (int i = 0; i < d.length; i++)
            clone[i] = d[i];

        return clone;
    }

    static double[] mergeTables(double [] d, double[] d2) {
        double[] merged = new double[d.length];
        for (int i = 0; i < d.length; i++)
            merged[i] = d[i] + d2[i];

        return merged;
    }        
}