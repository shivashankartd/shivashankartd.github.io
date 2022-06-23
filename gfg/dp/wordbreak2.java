package dp;
import java.util.*;
class Solution{
    static List<String> wordBreak(int n, List<String> B, String A)
    {
       List<String> list=new ArrayList<>();
        solve(A,B,"",list);
        return list;
       
    }
    public static void solve(String s,List<String> l,String ans,List<String> list)
    {
        
        if(s.length()==0)
        {
            list.add(ans.substring(0,ans.length()-1));
            
        }
        for(int i=1;i<=s.length();i++)
        {
            String left=s.substring(0,i);
            if(l.contains(left))
            {
                solve(s.substring(i,s.length()),l,ans+left+" ",list);
            }
        }
        
    }
}