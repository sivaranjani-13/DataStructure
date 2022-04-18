package datastructure;
import java.util.*;
public class Queue {
	
	int[] queue;
	int rear;
	int front;
	int n,size;
	Queue(int size) {
		this.size=size;
		queue = new int[size];
	}
	public void enqueue(int value)
	{
		if(n<size) {
		queue[rear++]=value;
		//rear = rear++;
		n++;
		}
		else {
			System.out.println("queue is overflow");
		}
	}
	public void dequeue() {
		if(!Isempty()) {
			for(int i=0;i<queue.length;i++) {
				if(i==queue.length-1)
					queue[i]=0;
				else
					queue[i]=queue[i+1];
			}
			n--;
		}
		else {
			System.out.println("queue is underflow");
		}
	}
	int front() {
		return queue[0];
	}
	int rear() {
		return queue[n-1];
	}
	public void display()
	{
		for(int i=0;i<n;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
  boolean Isempty()
   {
	   if(n==0)
		   return true;
	   else
		   return false;
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue obj = new Queue(5);
		obj.enqueue(7);
		obj.enqueue(4);
		obj.enqueue(1);
		obj.enqueue(6);
		obj.enqueue(9);
		obj.display();
		obj.dequeue();
		obj.dequeue();
		obj.display();
		System.out.println(obj.front());
		System.out.println(obj.rear());
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		obj.dequeue();
		
	}

}
