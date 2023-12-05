
/*
Easy 1

Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal 
substring consisting of non-space characters only.

Constraints:
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.

 */
     


// Importing necessary packages for input/output and data structures
	import java.util.*;
	import java.io.*;

// Main class definition
	public class Easy1 {

// Main method, the entry point of the program
    public static void main(String[] args) {
// Creating a Scanner object to read input from the console
    Scanner sc = new Scanner(System.in);
		        
// Reading a line of input from the user
    String s = sc.nextLine();
		        
// Creating a StringTokenizer to tokenize the input string
    StringTokenizer st = new StringTokenizer(s);
		        
// Creating a List to store the tokens extracted from the input
    List<String> li = new ArrayList<>();
		        
// Looping through each token and adding it to the List
    while (st.hasMoreTokens()) {
	 li.add(st.nextToken());
    }
		     
// Printing the length of the last token in the List
    System.out.println(li.get(li.size() - 1).length());
  }
}

