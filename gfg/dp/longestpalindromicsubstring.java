package dp;

class longestpalindromicsubstring{
    String longestPalindrome(String s){
        // code here
        boolean dp[][]=new boolean[s.length()][s.length()];
        
        for(int g=0;g<dp.length;g++)
        {
            for(int i=0,j=g+i;j<dp.length;i++,j++)
            {
                if(g==0)
                {
                    dp[i][j]=true;
                    
                }
                else if(g==1)
                {
                    if(s.charAt(i)==s.charAt(j))
                    dp[i][j]=true;
                    else
                    dp[i][j]=false;
                }
                else
                {
                    if(s.charAt(i)==s.charAt(j)&&dp[i+1][j-1]==true)
                    dp[i][j]=true;
                    else
                    dp[i][j]=false;
                }
               
            }
        }
        int start=0,end=0,maxlen=0;
        for(int i=0;i<dp.length;i++)
        {
         for(int j=0;j<dp.length;j++)
          {
             if(dp[i][j]==true)
             {
                 if(j-i+1>maxlen)
                 {
                     start=i;
                     end=j;
                     maxlen=j-i+1;
                 }
             }
          }
        }
        String temp="";
        for(int i=start;i<=end;i++)
        {
            temp+=s.charAt(i);
        }
        return temp;
       
    }
}