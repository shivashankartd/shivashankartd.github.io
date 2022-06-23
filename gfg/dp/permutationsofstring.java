package dp;
import java.util.*;
class Solution {
    //       public static void permutations(String str , Set<String> al,String asf ){
    //       if(str.length()==0)
    //       {   
    //           al.add(asf);
    //           return ;
    //       }
    //       for(int i = 0; i < str.length() ; i++)
    //       {
    //           char ch = str.charAt(i);
    //           String s1 = str.substring(0,i);
    //           String s2 = str.substring(i+1);
    //           String ros = s1+s2;
    //           permutations(ros,al,asf + ch);
    //       }
    //   } 
    //   public List<String> find_permutation(String S) {
    //       // Code here
    //       Set <String> al = new HashSet<>();
    //       List <String> l = new ArrayList<>();
    //       permutations(S,al ,"");
    //       for(String x:al)
    //       l.add(x);
           
    //       Collections.sort (l);
    //     //   System.out.print(l.size());
    //       return l;
           
           
           
    //   }   
    
    
    
    
        
        
        public void solve(String s,List<String> l,int i)
        {
            if(i>=s.length())
            {
                l.add(s);
                
            }
            for(int j=i;j<s.length();j++)
            {
                s=swap(s,i,j);
                solve(s,l,i+1);
                s=swap(s,i,j);
            }
        }
        
        public String swap(String a, int i, int j) 
        { 
            char temp; 
            char[] charArray = a.toCharArray(); 
            temp = charArray[i] ; 
            charArray[i] = charArray[j]; 
            charArray[j] = temp; 
            return String.valueOf(charArray); 
        } 
        
        
        public List<String> find_permutation(String s) {
             // Code here
             
             List<String> l=new ArrayList<>();
             int i=0;
             solve(s,l,i);
             HashSet<String> set=new HashSet<>(l);
            //  for(String ij:l)
            //  {
            //   set.add(ij);
            //  }
             List<String> l1=new ArrayList<>(set);
             
             Collections.sort(l1);
             return l1;
             
        } 
        
        
    
    }
    