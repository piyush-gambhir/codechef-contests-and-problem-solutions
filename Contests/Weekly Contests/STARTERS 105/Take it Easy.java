/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int[] a = new int[n];
		    int sum = 0;
		    
		    for(int i=0; i<n; i++) {
		        a[i] = sc.nextInt();
		        sum += a[i];
		    }
		    
		    if(sum % n != 0) {
		        System.out.println("no");
		    } else {
		        sum = 0;
		        for(int i=0; i<n; i++) {
		            a[i] = a[i] / 2;
		            sum += a[i];
		        }
		        
		        if(sum % n == 0) {
		            System.out.println("YES");
		        } else {
		            System.out.println("NO");
		        }
		    }
		}
	}
}
