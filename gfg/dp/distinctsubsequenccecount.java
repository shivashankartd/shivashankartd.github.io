package dp;
import java.util.*;
class Solution {
    public int distinctSubseqII(String s) {
           // List<String> l=new ArrayList<>();
      HashSet<String> set=new HashSet<>();
      int n=s.length();
      for(int i=0;i<(1<<n);i++)//1000 for n==3 that is 16
      {
          String temp="";
          for(int j=0;j<n;j++)//for example for 1=001
          {
              if((i&(1<<j))!=0)// for j=0 that is 1<<0  that is 001 and & opearation 001 =001 so add a subsequence
              {
                temp+=s.charAt(j);
              } 
          }
          if(temp.length()>0)
          {
            set.add(temp);
          }
          
      }
        
        return set.size()%1000000007;
        
     
        
    }
}