//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
import java.lang.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();
            Solution ob = new Solution();
            int ans = ob.smallestSubstring(S);

            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int smallestSubstring(String S) {
        // Code here
        int arr[]=new int[3];
        int i=0;
        int j=0;
        int n=S.length();
        int min=Integer.MAX_VALUE;
        while(i<n){
            arr[S.charAt(i)-'0']+=1;
            
            while( j<n&&arr[0]>0 && arr[1]>0&&arr[2]>0){
                 min=Math.min(i-j+1,min);
                 arr[S.charAt(j)-'0']-=1;
                 j+=1;
            }
            i+=1;
        }
        
        return min==Integer.MAX_VALUE?-1:min;
    }
};
