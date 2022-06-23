package dp;
import java.util.*;
class Sol
{
    // static Map<String,Boolean> m=new HashMap<>();
    // public static boolean solve(String A, ArrayList<String> B)
    // {
    //     if(B.contains(A))
    //     return true;
    //     if(m.containsKey(A))
    //     return m.get(A);
        
    //     for(int i=1;i<A.length();i++)
    //     {
    //         String left=A.substring(0,i);
    //         if(B.contains(left) && solve(A.substring(i,A.length()),B))
    //         {
    //             m.put(A,true);
    //             return true;
    //         }
    //     }
    //     m.put(A,false);
    //     return false;
    // }
    // public static int wordBreak(String A, ArrayList<String> B)
    // {
    //     //code here
      
        
       
    //   if(solve(A,B)==true)
    //   return 1;
    //   else
    //   return 0;
        
        
    // }
    
    
    
    
    
    // public static int wordBreak(String s, ArrayList<String> wordDict)
    // {
    //   if(solve(s,wordDict)==true)
    //   return 1;
    //   else
    //   return 0;
    // }
    //  public static boolean solve(String s, ArrayList<String> wordDict)
    // {
        
        
    //      int n=s.length();
    //     boolean dp[]=new boolean[n+1];
    //     dp[0]=true;
    //     for(int i=0; i<=n;i++){
    //         for(int j=0;j<i;j++)
    //         {
    //             if(dp[j] && wordDict.contains(s.substring(j,i)))
    //             {
    //               dp[i]=true;
    //                 break;
    //             }
    //         }
    //     }
    //     return dp[n];
        
    // }
    
    
    
    
     public static int wordBreak(String s, ArrayList<String> wordDict)
     {
         
         int dp[]=new int[s.length()];
         int n=s.length();
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<=i;j++)
             {
                 if(wordDict.contains(s.substring(j,i+1)))   /////j+1 because substring method excludes last character
                 {
                     if(j>0)
                     {
                         dp[i]+=dp[j-1];
                     }
                     else
                     {
                         dp[i]+=1;
                     }
                 }
             }
         }
         
         if(dp[n-1]>0)
         return 1;
         else
         return 0;
         
         
     }
}