import java.util.Scanner;

class GaussC {

    public static void main(String[] args) {

        final int n = 4;
        int r = n, c = n+1;


        double[][] x = new double[r][c];

        Scanner sc = new Scanner(System.in);

        
        for (int i = 0; i < x.length; i++) {

            System.out.println("Enter the Equation " + (i+1) + "\n");
            for (int j = 0; j < x[i].length; j++) {

                x[i][j] = sc.nextDouble();
                
            }
        }

        sc.close();

        System.out.println("\nMatrix\n");

        double[][] y = new double[4][5];

        //Printing the matrix

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {

                if (j == x[i].length - 1) {

                    System.out.print("=    ");
                    
                }

                System.out.print(x[i][j] + "     ");
                y[i][j] = x[i][j];
                
            }
            System.out.println("\n\n");
        }

        System.out.println("\nUpper Triangular Matrix\n");

        
        Call v = new Call();

        v.mUpper(y,n);
        
    }
    

}

class Call{


    void mUpper(double y[][],int n){


      
        double k = 0;
/*
        for (int i = 1; i < y.length; i++) {
            
            k = y[i][0]/y[0][0];

            for (int j = 0; j <= y.length; j++) {
                
                y[i][j] = y[i][j] - k * y[0][j];
            }
        }
  */
        for (int i = 1; i < y.length; i++) {
        
            for (int j = 0; j <= y.length; j++) {
                if (i>j && y[i][j] != 0) 

                    k = y[i][j]/y[i-1][j];
                    
                y[i][j] = y[i][j] - k * y[i-1][j];
            }
        }
        

       

        for (int i = 0; i < y.length; i++) {
            for (int j = 0; j < y[i].length; j++) {

                System.out.print(String.format("%.16f", y[i][j])  + "      ");
                
            }
            System.out.println("\n\n");

            
        }

        
    }



}
/*
10
-7
3
5
6
-6
8
-1
-4
5
3
1
4
11
2
5
-9
-2
4
7
*/