//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.isPalindrome(S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int isPalindrome(String s) {
        // code here
        int firstIndex = 0;
        int lastIndex = s.length()-1;
        
        for(int index = 0 ; index < s.length() ; index++){
            
            char firstChar = s.charAt(firstIndex);
            char lastChar = s.charAt(lastIndex);
            
            if(firstChar != lastChar){
                return 0;
            }
            
            firstIndex++;
            lastIndex--;
        }
        return 1;
    }
}
