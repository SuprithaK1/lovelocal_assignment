/*
 Medium 2 

Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Constraints:
1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109

 */


// Importing necessary packages for input/output and data structures
import java.util.*;
import java.io.*;

// Main Class definition 
public class Medium2 {

    // Main method, the entry point of the program
    public static void main(String[] args) {
    	
        // Creating a Scanner object to read input from the console
        Scanner sc = new Scanner(System.in);

        // Reading an integer from the user, representing the size of the array
        int n = sc.nextInt();

        // Creating an array to store 'n' integers
        int a[] = new int[n];

        // Reading 'n' integers from the user and storing them in the array 'a'
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Creating a HashMap to store the frequency of each integer in the array
        Map<Integer, Integer> mp = new HashMap<>();

        // Looping through the array and updating the frequency in the HashMap
        for (int i = 0; i < n; i++) {
            mp.put(a[i], mp.getOrDefault(a[i], 0) + 1);
        }

        // Creating a List to store integers that appear more than n/3 times
        List<Integer> ans = new ArrayList<>();

        // Looping through the entries in the HashMap
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            // Checking if the frequency is more than n/3
            if (entry.getValue() > n / 3)
                ans.add(entry.getKey());
        }

        // Printing the elements in the List 'ans'
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}