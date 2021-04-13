/* package codechef; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[] ar = new int[a];
		
		for (int i = 0;i < a ;i++ ){
		    
		    ar[i] = sc.nextInt();
		    
		}
		sc.close();
		
		System.out.println(Arrays.toString(ar));
		
		for(int i = 0;i < a;i++){ 
		    
		    for(int j = 1;j < ar[i] ;j++){

                System.out.print(i + " " );
		        
		    }
		}
		
	
		
	}
}