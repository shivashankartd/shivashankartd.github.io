package dp;

class Solution{
    int longestCommonSubstr(String s1, String s2, int n, int m){
        // code here
        
        if(n==0 || m==0)
        return 0;
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<m+1;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
            }
        }
        
         for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<m+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=0;
                }
            }
        }
      int maxm=Integer.MIN_VALUE;
      for(int i=1;i<=n;i++)
          for(int j=1;j<=m;j++)
              maxm=Math.max(maxm,dp[i][j]);
        
        return maxm;
    // return dp[n][m];
        
    }
}