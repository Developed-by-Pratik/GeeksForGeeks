//{ Driver Code Starts
import java.io.*;
import java.util.*;
class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int matrix[][] = new int[n][n];
            
            for(int i = 0; i < n; i++)
            {
                for(int j = 0; j < n; j++)
                  matrix[i][j] =sc.nextInt();
            }
            Solution ob = new Solution();
            System.out.println(ob.determinantOfMatrix(matrix, n));
        }
    }
}
// } Driver Code Ends




class Solution
{
    //Function for finding determinant of matrix.
    static int determinantOfMatrix(int matrix[][], int n)
    {
        // code here 
        if (n == 1) {
            return matrix[0][0];
        }
        if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int[][] mat = new int[n - 1][n - 1];
            int index = 0;
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    System.arraycopy(matrix[j], 1, mat[index], 0, n - 1);
                    index++;
                }
            }
            ans += Math.pow(-1, i) * matrix[i][0] * determinantOfMatrix(mat, n - 1);
        }
        return ans;
    }
}

