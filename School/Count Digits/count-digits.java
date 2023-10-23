//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        // code here
        int copy = N;
        int count = 0;
        
        while(copy>0)
        {
            
            int lastnumber = copy%10;
            
            copy = copy/10;
            
            if(lastnumber == 0)
                continue;
            
            if(N%lastnumber == 0)
            {
                count++;
            }
   
        }
        
        return count;
    
    }
}