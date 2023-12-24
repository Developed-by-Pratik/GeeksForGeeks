//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            String str=br.readLine();
    		String[] starr=str.split(" ");
    		
    		//input n and d
    	    int n=Integer.parseInt(starr[0]);
    		int k= Integer.parseInt(starr[1]);
            
            starr = br.readLine().trim().split(" ");
            int[] price = new int[n];
            for(int i = 0; i < n; i++)
                price[i] = Integer.parseInt(starr[i]);
            
            Solution obj = new Solution();
            int res = obj.buyMaximumProducts(n, k, price);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
        for (int i = 0; i < n; i++) {
            minHeap.offer(new int[]{i + 1, price[i]});
        }
        int maxStocks = 0;
        while (!minHeap.isEmpty()) {
            int[] dayPricePair = minHeap.poll();
            int day = dayPricePair[0];
            int stockPrice = dayPricePair[1];
            int maxStocksOnDay = Math.min(day, k / stockPrice);
            maxStocks += maxStocksOnDay;
            k -= maxStocksOnDay * stockPrice;
        }
        return maxStocks;
    }
}
        
