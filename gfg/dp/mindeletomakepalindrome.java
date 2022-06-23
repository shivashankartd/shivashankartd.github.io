package dp;


class Solution{
    static int minimumNumberOfDeletions(String s1) {
        //your code here
        StringBuilder s2=new StringBuilder();
        s2.append(s1);
        s2.reverse();
        
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        
        for(int i=0;i<n+1;i++)
        for(int j=0;j<m+1;j++)
        if(i==0||j==0)
        dp[i][j]=0;
        
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
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return n-dp[n][m];
    }
}