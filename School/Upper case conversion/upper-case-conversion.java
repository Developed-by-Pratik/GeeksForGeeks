//{ Driver Code Starts
//Initial Template for Java


import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String str = br.readLine();
                    Solution ob = new Solution();
                    System.out.println(ob.transform(str));
                }
        }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String transform(String s)
    {
        // code here
        String ans = "";
        String[] n = s.split(" "); 
        
        for(int i = 0 ; i < n.length ; i++)
        {
            String s1 = n[i];
            String s2 = s1.substring(0,1).toUpperCase();
            String s3 = s1.substring(1);
            String s4 = s2+s3;
            ans = ans + s4 + " ";
        }
        return ans;
       
    }
}