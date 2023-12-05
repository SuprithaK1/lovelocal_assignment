
/*
Hard 3

Given an integer n, count the total number of digit 1 appearing in all non-negative integers less than or equal to n. 

Constraints:
0 <= n <= 109
 */


// Importing necessary packages for input/output and data structures
import java.util.*;
import java.io.*;

//Main Class definition 
class Hard3 {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Reading an integer from the user, representing the value of 'n'
        int n = sc.nextInt();

        // Initializing a variable 'ans' to store the count of occurrences of digit 1
        int ans = 0;

        // Looping from 0 to 'n' (inclusive)
        for (int i = 0; i <= n; i++) {
            // Creating a temporary variable 'm' and assigning the value of 'i'
            int m = i;

            // Looping through each digit of 'm'
            while (m > 0) {
                // Extracting the last digit of 'm'
                int tp = m % 10;

                // Checking if the extracted digit is 1
                if (tp == 1)
                    // Incrementing the count of occurrences of digit 1
                    ans++;

                // Removing the last digit from 'm'
                m /= 10;
            }
        }

        // Printing the total count of occurrences of digit 1 in the range from 0 to 'n'
        System.out.println(ans);
    }
}
