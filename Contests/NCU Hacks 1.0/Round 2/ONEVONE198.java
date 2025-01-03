/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();

            boolean possible = false;
            int a = 0;
            int b = 0;
            int c = 0;
            for (a = 0; a <= N; a++) {
                b = 3 * a - X;
                c = N - a - b;

                if (b >= 0 && c >= 0) {
                    possible = true;
                    break;
                }
            }

            if (possible) {
                System.out.println("YES");
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println("NO");
            }
        }
    }
}