import java.util.*;
class Solution
{
    static int subarrwuthsum_k(int Arr[], int N, int k)
    {
        // code here
        HashMap<Integer,Integer> m=new HashMap<>();
        int s=0;
        m.put(0,1);
        int c=0;
        for(int i=0;i<N;i++)
        {
            s+=Arr[i];
            
            if(m.containsKey(s-k))
            {
                c+=m.get(s-k);
            }
            m.put(s,m.getOrDefault(s,0)+1);
            
            
        }
        
        return c;
    }
}