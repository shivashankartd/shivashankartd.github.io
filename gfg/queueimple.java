
////if front ==0 and rear==0

class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	    // Your code here
	    if(rear==arr.length)
	    return;
	    arr[rear]=x;
	    rear++;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
		// Your code here
		if(front==rear)
		return -1;
		int res=arr[front];
		front++;
		return res;
		
	} 
}



//using circular queue


// class MyQueue {

//     int front, rear;
//     int n = 100005;
// 	int arr[] = new int[n];

//     MyQueue()
// 	{
// 		front=-1;
// 		rear=-1;
// 	}
	
// 	//Function to push an element x in a queue.
// 	void push(int x)
// 	{
// 	    // Your code here
// 	    if((rear+1)% n == front) {
// 	        return;
// 	    }
	    
// 	    if(front == -1) {
// 	        front = 0;              initially front is pointing to -1 so make it point to starting element that is at index 0
// 	    }
	   
	    
// 	    rear = (rear+1)%n;
// 	    arr[rear] = x;
// 	} 

//     //Function to pop an element from queue and return that element.
// 	int pop()
// 	{
// 		// Your code here
		
// 		if(front == -1) {
// 		    return -1;
// 		}
		
		
// 	    int	result = arr[front];


// 		if(front == rear) {
// 		    front = -1;                     ////if the queue contains only one elment then make both th pointers to point to -1;
// 		    rear = -1;
// 		} else {
// 		    front = (front+1)%n;
// 		}
		
// 		return result;
// 	} 
// }





////when front =-1 and  rear==-1

// class MyQueue {

    //     int front, rear;
    //     int n = 100005;
    // 	int arr[] = new int[n];
    
    //     MyQueue()
    // 	{
    // 		front=-1;
    // 		rear=-1;
    // 	}
        
    // 	//Function to push an element x in a queue.
    // 	void push(int x)
    // 	{
    // 	    // Your code here
    // 	   if(rear==arr.length)
    // 	   return;
           
    // 	   if(front==-1)
    // 	   {
    // 	       front=0;
    // 	   }
           
    // 	   rear++;
    // 	   arr[rear]=x;
    // 	} 
    
    //     //Function to pop an element from queue and return that element.
    // 	int pop()
    // 	{
    // 		// Your code here
            
    // 		if(rear==-1) 
    
    //         {
    // 		    return -1;
    // 		}
            
            
    // 	    int	result =arr[front] ;
    // 		for(int i=0;i<rear;i++)
    // 		{
    // 		    arr[i]=arr[i+1];
    // 		}
            
    // 		rear--;
    
            
    // 		return result;
    // 	} 
    // }
    