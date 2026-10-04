public class lab1{
    public static double task3 (long elementb,double elementx){
        if (elementb == 10) {
            double ex=Math.exp(Math.cos(elementx));
            double power=Math.asin(3.0/4.0*((elementx-1.5)/17));
            double den=Math.cos(Math.tan(elementx))+0.5;
            return Math.pow(ex/den,power);

        } else if (elementb == 6 || elementb == 14 || elementb == 18 || elementb == 22) {
            return Math.cos(Math.sin(Math.cos(elementx)));
        } else {
            double a1=Math.exp(Math.pow(Math.tan(Math.tan(Math.asin(1.0/Math.exp(Math.abs(elementx))))),2));
            return Math.asin(1.0/a1);
        }
    }
    public static void printe(double[][] matrix) {
        for (int i=0;i<9;i++){
            for (int j=0;j<10;j++)
            {System.out.printf("%10.4f",matrix[i][j]);}
            System.out.println();}}
    public static void printx (double[] x){
        for (int i=0; i<10; i++)
        {System.out.print(x[i]+"  ");}}

    public static void main(String[] args){
        long[] b = {6, 8, 10, 12, 14, 16, 18, 20, 22};

        double[] x = new double[10];
        for (int i = 0; i < x.length; i++) {
            x[i] = Math.random() * 17.0 - 10.0;
        }

        double[][] e = new double[9][10];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 10; j++) {
                e[i][j] = task3(b[i], x[j]);}}
        System.out.println("Массив x:");
        printx(x);
        System.out.println();
        System.out.println("Массив e:");
        printe(e);
    }}
