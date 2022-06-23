import java.util.*;
class Solution {
	public static int[] help_classmate(int arr[], int n) 
	{ 
	    // Your code goes here
	     int a[]=new int[n];
        Stack<Integer> s=new Stack<>();
        
        for(int i=n-1;i>=0;i--)
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