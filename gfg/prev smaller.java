import java.util.*;

class Solution
{
	public static int[] findNextGreaterElements(int[] arr)
	{
		// Write your code here...
		int n=arr.length;
		int a[]=new int[n];
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty()&&s.peek()>=arr[i])
            {
                s.pop();
                
            }
            if(s.isEmpty())
            {
                a[i]=-1;
            }
            else
            {
                a[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return a;
	}
}