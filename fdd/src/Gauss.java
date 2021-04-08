import java.util.Scanner;

class Gauss {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row\n");
        final int n = sc.nextInt();

        double[][] x = new double[n][n+1];
        double[][] y = x;

        System.out.println("Enter the Equation\n");

        for (int i = 0; i < x.length; i++) {

            for (int j = 0; j < x[i].length; j++) {

                x[i][j] = sc.nextDouble();
                
            }
        }

        sc.close();

        System.out.println("\nMatrix\n");
        Cal.mDisplay(y);
        
        y = Cal.mUpper(y);

        System.out.println("\nUpper Triangular Matrix\n");
        Cal.mDisplay(y);
    }  

}

class Cal{

    static double[][] mUpper(double y[][]) {

        double k = 0;

        for (int i = 1; i < y.length; i++) 

            for (int j = 0; j <= y.length; j++) {
                if (i>j && y[i][j] != 0) 

                    k = y[i][j]/y[i-1][j];

                y[i][j] = y[i][j] - k * y[i-1][j];
            }
        
        return y;

    }
    static void mDisplay(double y[][]){

        for (int i = 0; i < y.length; i++) {

            for (int j = 0; j < y[i].length; j++) {

                if (j == y[i].length-1) {
                    System.out.print("=    ");
                }
                System.out.print(String.format("%.2f", y[i][j])  + "     ");
                          
            }
            System.out.println("\n\n");
        }
    }
}
/*
10 -7 3 5 6
-6 8 -1 -4 5
3 1 4 11 2
5 -9 -2 4 7
*/
/*
1 2 3 6
2 2 2 6
2 3 4 9
*/