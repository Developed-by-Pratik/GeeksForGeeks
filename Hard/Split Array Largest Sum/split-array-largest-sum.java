//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String St[] = read.readLine().split(" ");
            
            int N = Integer.parseInt(St[0]);
            int K = Integer.parseInt(St[1]);
            
            String S[] = read.readLine().split(" ");
            
            int[] arr = new int[N];
            
            for(int i=0 ; i<N ; i++)
                arr[i] = Integer.parseInt(S[i]);

            Solution ob = new Solution();
            System.out.println(ob.splitArray(arr,N,K));
        }
    }
}
// } Driver Code Ends


class Solution {
    static int bs(int arr[],int divSum){
        int ndiv=1,cs=0;
        for(int i:arr){
            if(cs+i<=divSum) cs+=i;
            else{
                ndiv++;
                cs=i;
            }
        }
        return ndiv;
    }
    static int splitArray(int[] arr , int N, int K) {
        // code here
        int l=Integer.MIN_VALUE,r=0;
        for(int i:arr){
            l=Math.max(l,i);
            r+=i;
        }
        while(l<=r){
            int mid=(l+r)/2;
            int curr=bs(arr,mid);
            if(curr>K) l=mid+1;
            else r=mid-1;
        }
        return l;
    }
};