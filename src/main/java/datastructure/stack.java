package datastructure;
import java.util.ArrayList;
/*
 * declare Arraylist
 * Initializing list size
 */
public class stack
{
		ArrayList<Integer> L1=new ArrayList<Integer>(5);
		/*
		 * adding values into the stack by using push operation
		 */
		public void push(int n)
		{
			if(L1.size()!=5)
				L1.add(n);
			else
				/**
				 * check if the stack is full or not
				 */
				System.out.println("Stack is full");
		}
		/*
		 * removing values into the stack by using push operation
		 */
		public void pop()
		{
			if(L1.size() != 0)
				L1.remove(L1.size()-1);
			else{
				System.out.println("empty");
			}
		}
		/*
		 * check if the stack is empty or not
		 */
		public void IsEmpty() {
			if(L1.size()==0)
				System.out.println("stack is empty");
			else
				System.out.println("stack is not empty");
		}
		public void print() {
			//System.out.println(L1);
			for(int i=0;i<L1.size();i++) {
				if(i==L1.size()-1)
					System.out.print(L1.get(i));
				else
					System.out.print(L1.get(i)+"->");
			}
			System.out.println();
		}
		public static void main(String[] args) {
			stack obj=new stack();
			obj.push(7);
			obj.push(8);
			obj.push(2);
			obj.push(3);
			obj.push(6);
			obj.push(11);
			obj.print();
			obj.pop();
			obj.pop();
			obj.print();
			obj.IsEmpty();
		}
	 
}
