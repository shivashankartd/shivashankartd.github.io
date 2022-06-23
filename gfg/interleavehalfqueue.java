import java.util.*;
import java.util.Queue;

public class interleavehalfqueue {
    public static void interLeaveQueue(Queue < Integer > q) {
        // Write your code here.
        Stack<Integer> s=new Stack<>();
        int n=q.size();
        for(int i=0;i<(n/2);i++)
        {
            s.push(q.poll());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
        }
        for(int i=0;i<(n/2);i++)
        {
            q.add(q.poll());
        }
         for(int i=0;i<(n/2);i++)
        {
            s.push(q.poll());
        }
        while(!s.isEmpty())
        {
            q.add(s.pop());
            q.add(q.poll());
        }
    }
}