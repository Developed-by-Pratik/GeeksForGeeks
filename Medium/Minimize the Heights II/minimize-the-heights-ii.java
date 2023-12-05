//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

  public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int k = Integer.parseInt(inputLine[0]);
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().getMinDiff(arr, n, k);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    int getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        int maxi = arr[n - 1], mini = arr[0], res = arr[n - 1] - arr[0];
        
        for (int i = 0; i < n - 1; i++) {
            if (arr[i + 1] - k < 0)
                continue;
                
            mini = Math.min(arr[0] + k, arr[i + 1] - k); // there will be two partition, first array minimum will be arr[0] + k and second array minimum will be arr[i + 1] - k
            maxi = Math.max(arr[i] + k, arr[n - 1] - k); // there will be two partition, first array maximum will be arr[i] + k and second array maximum will be arr[n - 1] - k
            
            res = Math.min(res, maxi - mini);
        }
        
        return res;
    }
}
