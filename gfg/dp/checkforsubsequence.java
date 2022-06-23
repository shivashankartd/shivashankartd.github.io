package dp;

class Solution{
    boolean isSubSequence(String A, String B){
        // int x=s1.length();
        // int y=s2.length();
        // int dp[][]=new int[x+1][y+1];
        // for(int i=0;i<x+1;i++)
        // for(int j=0;j<y+1;j++)
        // if(i==0||j==0)
        // dp[i][j]=0;
        
        
        // for(int i=1;i<x+1;i++)
        // {
        //     for(int j=1;j<y+1;j++)
        //     {
        //         if(s1.charAt(i-1)==s2.charAt(j-1))
        //         {
        //             dp[i][j]=1+dp[i-1][j-1];
        //         }
        //         else
        //         {
        //             dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
        //         }
        //     }
        // }
        // int s= dp[x][y];
        // if(x==s)
        // return true;
        // else
        // return false;
      int n=A.length();
      int m=B.length();
      int i=0,j=0;
       
      while(i<n && j<m)
      {
          if(A.charAt(i)!=B.charAt(j))
          {
              j++;
          }
          else if(A.charAt(i)==B.charAt(j))
          {
              i++;
              j++;
          }
           
      }
      if(i==n){
          return true;
      }
      return false;
       
   }
        
    
}