//Time Taken = 1h 20min
//#Google Ques1:- Find k closest number to x from an sorted array

import java.util.Scanner;

class Pract {

    static int has;

    public static void main(String[] args) {
        
        int size;
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter the Size of the array :  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the array\n\n");
        
        for (int i = 0; i < arr.length; i++) 
            arr[i] = sc.nextInt();

        

        System.out.println("Enter K :  ");
        int k = sc.nextInt();

        System.out.println("Enter X :  ");
        int X = sc.nextInt();

        sc.close();

        int[] ka = new int[k];

        ka = cal(arr,k,X);

        System.out.print("\n\nSolution :  ");

        for (int i = 0; i < ka.length; i++) 

            System.out.print(ka[i] + " ");
            

    }

    static int [] cal(int n[],int k,int x){

        int [] sol = new int[k];
        int [] distance = new int[n.length];
        
            for (int i = 0; i < distance.length; i++) 
                
                distance[i] = Math.abs(x - n[i]);


            for (int i = 0; i < n.length-k; i++) {
                
                distance = rem_max(distance);

                if (has != n.length-1) 
                
                    for (int j = has; j < n.length-1;j++)

                        n[j] = n[j+1];
                    
            }

            for (int i = 0; i < sol.length; i++) {
                
                sol[i] = n[i];
            }


        return sol;

    }

    static int[] rem_max(int[] max){

        int [] m = new int[max.length];
        int maxx = max[0];
        
        for (int i = 0; i < max.length-1; i++)

            if(maxx <= max[i+1]) {

                maxx = max[i+1];

                has = i+1;

            }else

                has = 0;
            

        for (int i = 0; i < max.length; i++)

            if (has != i) 

                m[i] = max[i];
                

        return m;

    }


// 5 1 2 3 4 5 3 3
// 5 2 4 5 6 9 3 6 
// 5 5 6 7 8 23  4  14
}
