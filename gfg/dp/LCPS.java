package dp;

class LCPS
{
    public int longestPalinSubseq(String s1)
    {
        //code here
         StringBuilder s2 = new StringBuilder();
         s2.append(s1);
         s2.reverse();
         
         int x=s1.length();
         int y=s2.length();
         
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
        return dp[x][y];
         
         
    }
}
