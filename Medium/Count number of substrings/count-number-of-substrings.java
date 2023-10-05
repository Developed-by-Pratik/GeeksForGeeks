//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    long substrCount (String S, int K) {
        // your code here
        return atMostKDistinct(S, K) - atMostKDistinct(S, K - 1);
    }

    public long atMostKDistinct(String S, int K) {
        if (K < 0) return 0;

        int i = 0, j = 0, cnt = 0;
        long ans = 0;
        int[] charCount = new int[26];

        while (j < S.length()) {
            char currentChar = (char) (Character.toLowerCase(S.charAt(j)) - 'a'); // Cast back to char
            charCount[currentChar]++;

            if (charCount[currentChar] == 1) cnt++;

            while (cnt > K) {
                char removedChar = (char) (Character.toLowerCase(S.charAt(i)) - 'a'); // Cast back to char
                charCount[removedChar]--;
                if (charCount[removedChar] == 0) {
                    cnt--;
                }

                i++;
            }

            ans += (j - i + 1); // form all substrings
            j++;
        }
        return ans;
    }
}