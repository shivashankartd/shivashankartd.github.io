package dp;
import java.util.*;
class Solution {
    static int findTargetSumWays(int[] a , int n, int target) {
        // code here
        int s=Arrays.stream(a).sum();
       
        
         int sum = (target+s)/2;
       
      if((target+s)%2==1)
          return 0;
           
        
        
        int dp[][]=new int[n+1][sum+1];
        
        for(int i=0;i<sum+1;i++)
        {
            dp[0][i]=0;
            
        }
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=1;
            
        }
        
        for(int i=1;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(a[i-1]<=j)
                {
                    dp[i][j]=dp[i-1][j-a[i-1]]+dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        
        return dp[n][sum];
        
        
    
    
        
    }
};