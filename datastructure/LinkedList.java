package datastructure;
class Node{
	int data;
	Node next;
	Node(int data){
		this.data=data;
	}
}
public class LinkedList {
	Node head;
	public static LinkedList insertlast(LinkedList List, int data) {
		Node num=new Node(data);
		if(List.head ==null){
			List.head=num;
		}
		else {
			Node flag=List.head;
			while(flag.next!=null) {
				flag=flag.next;
			}
			flag.next=num;
		}
		return List;
		
	}
	public static LinkedList insertBegin(LinkedList List, int data) {
		Node num=new Node(data);
		if(List.head ==null){
			List.head=num;
		}
		else {
			Node flag=List.head;
			List.head=num;
			List.head.next=flag;
		}
		return List;
		
	}
	public static LinkedList insertMiddle(LinkedList List, int data,int position) {
		Node num=new Node(data);
		int index=0;
		if(List.head ==null){
		    List.head=num;
		}
		else {
			Node flag=List.head;
			Node prev=List.head;
			while(flag!=null) {
				index++;
				if(index==position) {
					prev.next=num;
					num.next=flag;
				}
				prev=flag;
				flag=flag.next;
			}
		}
		return List;
		
	}
	public static LinkedList deleteBegin(LinkedList List) {
		if(List.head ==null){
			System.out.println("ListEmpty");
		}
		else {
			List.head=List.head.next;
		}
		return List;
		
	}
	public static LinkedList deleteMiddle(LinkedList List,int position) {
		int index=0;
		if(List.head ==null){
			System.out.println("ListEmpty");
		}
		else {
			Node flag=List.head;
			Node prev=List.head;
			while(flag!=null) {
				index++;
				if(index==position) {
					prev.next=flag.next;
				}
				flag=flag.next;
			}
		}
		return List;
		
	}
	public static LinkedList deletelast(LinkedList List) {
		if(List.head ==null){
			System.out.println("ListEmpty");
		}
		else {
			Node flag=List.head;
			Node prev=List.head;
			while(flag.next!=null) {
				prev=flag;
				flag=flag.next;
			}
			prev.next=null;
		}
		return List;
		
	}
	public static void search(LinkedList List,int key) {
		Node current = List.head;
		boolean temp=true;
		while(current != null) {
			if(current.data==key) {
				System.out.println(key+" Founded");
				temp=false;
				break;
			}
			current = current.next;
		}
		if(temp)
			System.out.println(key+" Not Founded");
		
	}
	public static void display(LinkedList List) {
		Node current = List.head;
		while(current != null) {
			if(current.next!=null)
				System.out.print(current.data+" -> ");
			else
				System.out.print(current.data);
			current = current.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		LinkedList List=new LinkedList();
		System.out.println("Insertion at end : ");
		List=insertlast(List,7);
		List=insertlast(List,4);
		List=insertlast(List,1);
		List=insertlast(List,6);
		List=insertlast(List,10);
		display(List);
		System.out.println("Insertion begin : ");
		List=insertBegin(List,5);
		display(List);
		System.out.println("Insertion  middle : ");
		List=insertMiddle(List,3,0);
		display(List);
		System.out.println("Deletion last : ");
		List=deletelast(List);
		List=deletelast(List);
		display(List);
		System.out.println("Deletion begin : ");
		List=deleteBegin(List);
		display(List);
		System.out.println("Deletion Middle : ");
		List=deleteMiddle(List,11);
		display(List);
		System.out.println("Search : ");
		search(List,2);
		search(List,4);
	}

}