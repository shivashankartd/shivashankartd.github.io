package dp;

class Solution
{
    //Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String s1,String s2,int x,int y)
    {
        //Your code here
        String s3=s1+s2;
        int n=s3.length();
        int dp[][]=new int[x+1][y+1];
        for(int i=0;i<x+1;i++)
        for(int j=0;j<y+1;j++)
        if(i==0||j==0)
        dp[i][j]=0;
        
        
        for(int i=1;i<x+1;i++)
        {
            for(int j=1;j<y+1;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        int m=dp[x][y];
        int s=n-m;
        return s;
        
        // return m+n-2*m;
    }
}