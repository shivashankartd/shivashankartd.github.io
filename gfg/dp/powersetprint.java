package dp;
import java.util.*;
class Solution
{
    // public List<String> AllPossibleStrings(String s)
    // {
    //     // Code here
    //   List<String> l=new ArrayList<>();
    //   int n=s.length();
    //   for(int i=0;i<(1<<n);i++)//1000 for n==3 that is 16
    //   {
    //       String temp="";
    //       for(int j=0;j<n;j++)//for example for 1=001
    //       {
    //           if((i&(1<<j))!=0)// for j=0 that is 1<<0  that is 001 and & opearation 001 =001 so add a subsequence
    //           {
    //             temp+=s.charAt(j);
    //           } 
    //       }
    //       if(temp.length()>0)
    //       {
    //         l.add(temp);
    //       }
          
    //   }
    //     Collections.sort(l);
    //     return l;
        
    // }


    public void solve(String s,List<String> l,int index,String s1)
    {
        int n=s.length();
        if(index>=n)
        {
            l.add(s1);
            return;
        }
        solve(s,l,index+1,s1);
        s1+=s.charAt(index);
        solve(s,l,index+1,s1);
    }
    
     public List<String> AllPossibleStrings(String s)
     {
         List<String> l=new ArrayList<>();
         int index=0;
         solve(s,l,index,"");
         
         Collections.sort(l);
         l.remove(0);
         return l;
     }
    
   
}