//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*; 
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            long n = sc.nextLong();
    		System.out.println (new Solution().colName (n));
        }
        
    }
}

// Contributed By: Pranay Bansal 

// } Driver Code Ends


//User function Template for Java

class Solution
{
    String colName (long n)
    {
        // your code here
        StringBuilder result = new StringBuilder();
        while(n>0){
            n--;
            char ch = (char) ('A' + (n % 26));
            result.insert(0, ch); // Insert character at the beginning of the result string
            n /= 26; // Divide n by 26 to move to the next position
        }
        return result.toString();
    }
}