 import java.util.*;
public class commonelements
{
    public static ArrayList<Integer> findCommonElements(ArrayList<ArrayList<Integer>> mat)
    {
        // Write your code here.
        int n=mat.size();
        int m=mat.get(0).size();
        Map<Integer,Integer> map=new HashMap<>();
        ArrayList<Integer> l=new ArrayList<>();
        if(n==1)
        {
            for(int i=0;i<m;i++)
            {
                l.add(mat.get(0).get(i));            ////important testcase
            }
            return l;
        }
        
        for(int i=0;i<m;i++)
        {
           
               map.put(mat.get(0).get(i),1);
            
        }
        
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(map.containsKey(mat.get(i).get(j))&&map.get(mat.get(i).get(j))==i)
                {
                   map.put(mat.get(i).get(j),map.get(mat.get(i).get(j))+1);
                }
//                 if(i==n-1 && map.containsKey(mat.get(i).get(j))&&map.get(mat.get(i).get(j))==n)
//                 {
//                     l.add(mat.get(i).get(j));
//                 }
            }
        }
        
        for(int i=0;i<m;i++)
        {
            if(map.get(mat.get(0).get(i))==n)
            {
                l.add(mat.get(0).get(i));
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<l.size();i++)
        {
            set.add(l.get(i));                        /////important for matrix {{2,2,2},{2,2,2}}
        }
        
         ArrayList<Integer> l2=new ArrayList<>(set);
        return l2;
        
      
    }
}
