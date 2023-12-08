//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testcases = Integer.parseInt(br.readLine());
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(a1[i]);
            }
            Solution ob = new Solution();
            int ans=ob.minNumber(a,n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public int minNumber(int arr[], int N) {
        int sum = 0;
        for(int i : arr)
            sum += i;
        int total = sum;
        while(!isPrime(sum)){
            sum++;
        }
        return sum - total;
    }
    
    
    /*
        The isPrime method will validate the number is prime or not
        if it is a prime number it return true, else false
    */
    
    static boolean isPrime(int num){
        if(num < 2)
            return false;
        else if(num == 2)
            return true;
        else{
            for(int i = 2; i <= Math.sqrt(num) + 1 ; ++i){
                if(num % i == 0)
                    return false;
            }
            return true;
        }
    }
}