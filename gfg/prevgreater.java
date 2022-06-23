
import java.util.*;

class prevgreater {
	public static void main (String[] args) {
		int arr[]={10, 4, 2, 20, 40, 12, 30};
		int z[]=solve(arr);
		for(int i=0;i<z.length;i++)
		{
			System.out.println(z[i]);
		}
	}
	
	public static int[] solve(int arr[])
	{
	    int n=arr.length;
	    int a[]=new int[n];
        Stack<Integer> s=new Stack<>();
        
        for(int i=0;i<n;i++)
        {
            while(!s.isEmpty()&&s.peek()<arr[i])
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