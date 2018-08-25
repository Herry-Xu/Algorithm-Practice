public class LinkedList{
	Node head = null;

	public void insertAtBeginning(int data){
		Node tmp = new Node(data);
		tmp.next = head;
		head = tmp;
	}

	public void insertAtN(int position, int data){

		Node current = head;
		Node newNode = new Node(data);
		if (position == 0) {
			newNode.next = head;
			head = newNode;
			return;
		}

		for (int i = 0; i < position - 2; i++) {
			current = current.next;
		}
		newNode.next = current.next;
		current.next = newNode; 

	}

	public void reverseIterative(){
		Node current = head;
		Node prev = null;
		Node next;
		while (current != null){
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}

	public void reverseRecursion(Node node){
		if (node.next == null){
			head = node;
			return;
		}
		reverseRecursion(node.next);
		Node current = node.next;
		current.next = node;
		node.next = null;
	}

	public void deleteAtN(int position){
		Node current = head;
		Node temp1;
		if (position == 0){
			head = current.next;
			current.next = null;
		}
		for (int i = 0; i < position - 2; i++){
			current = current.next;
		}
		temp1 = current.next;
		current.next = current.next.next;
		temp1.next = null;

	}

	public void append(int data){
		Node current = head;

		if (head == null){
			head = new Node(data);
			return;
		}
		while (current.next != null){
			current = current.next;
		}
		current.next = new Node(data);
	}

	//prepending means that we have to move the head to the newhead
	public void prepend(int data){
		//create a new head
		Node newHead = new Node(data);
		//link the newhead to the old head
		newHead.next = head;
		//change the head to new head
		head = newHead;
	}

	public void deleteWithValue(int data){
		if (head == null) return;
		//if head is the value needed to be deleted, remove the head
		if (head.data == data){
			head = head.next;
		}

		Node current = head;
		while (current.next != null){
			//if the next value is the one you want to delete, point to the value after that one
			if (current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;

		}
	}
	//returns if data is in structure or not
	public boolean valueExists(int data){
		if (head == null) return false;

		if (head.data == data) return true;

		Node current = head;
		while (current.next != null){

			if (current.next.data == data){
				return true;
			}
			current = current.next;
		}
		return false;
	}
}