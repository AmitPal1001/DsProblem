package linkedlist;

public class LinkedLIst {
	
	Node head=null;
	
	
	public void insert(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	public void deleteNode(int key) {
		
		Node temp=head,prev=null;
		
		if(temp!=null && temp.data==key) {
			head=temp.next;
			return;
		}
		
while(temp!=null && temp.data!=key) {
			prev=temp;
			temp=temp.next;
			
		}
		if(temp==null) return;
		
		
		prev.next=temp.next;
		
	}
	
	public void searchElement(int key) {
		
		Node currentNode=head;
		
		while(currentNode!=null) {
			
			if(currentNode.data==key) {
				System.out.println("Search found");
				return;
				
			}
			currentNode=currentNode.next;
		}
		System.out.println("Search not found");
		
	}
	
	public void displayList() {
		if(head!=null) {
			Node currNode=head;
			while(currNode!=null) {
				System.out.println("Inserted Node: "+currNode.data);
				currNode=currNode.next;
			}
		}
	}
	
	public void printMiddleElement() {
		Node fast_pointer=head;
		Node slow_pointer=head;
		
		while(fast_pointer!=null && fast_pointer.next!=null) {
			fast_pointer=fast_pointer.next.next;
			slow_pointer=slow_pointer.next;
		}
		
		System.out.println("Middle Element is:  "+slow_pointer.data);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedLIst linkedList=new LinkedLIst();
		linkedList.insert(10);
		linkedList.insert(20);
		linkedList.insert(30);
		linkedList.insert(50);
		linkedList.insert(60);
		linkedList.insert(70);
		linkedList.insert(90);
		
		linkedList.displayList();
		System.out.println("After Delete node");
		linkedList.deleteNode(50);
		linkedList.deleteNode(90);
		linkedList.displayList();
		linkedList.searchElement(10);
		
		linkedList.printMiddleElement();
		
	}

}
