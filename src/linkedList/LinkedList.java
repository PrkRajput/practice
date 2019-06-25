package linkedList;

public class LinkedList {
	Node head = null;
	int size=0;
/////////////////// INSERT AT END	//////////////////////////////////////////////
	public LinkedList insertAtEnd(LinkedList list, int data) {
		Node node = new Node(data);
		if (list.head == null) {
			list.head = node;
		} else {
			Node temp = list.head;
			while (temp.next != null)
				temp = temp.next;
			temp.next = node;
		}
		size++;
		return list;
	}

//////////////////////// DISPLAY THE LIST ///////////////////////////////////////////
	public void showList(LinkedList list) {
		if (list.head == null) {
			System.out.println("List is empty");
		} else {
			System.out.println("");
			Node temp = list.head;
			while (temp.next != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
			System.out.print(temp.data);
		}
	}

//////////////////////// INSERT AT BEGINING ////////////////////////////////////////////
	public LinkedList insertAtBegining(LinkedList list, int data) {

		if (list.head == null) {
			Node temp = new Node(data);
			list.head = temp;
		} else {
			Node temp = new Node(data);
			temp.next = list.head;
			list.head = temp;
		}
		size++;
		return list;
	}

/////////////////////// INSERT AT INDEX   ///////////////////////////////////////////
	public LinkedList insertAtIndex(LinkedList list, int data, int index) {
			if(index==0){
				insertAtBegining(list, data);
			}
			else if(index==list.size){
				insertAtEnd(list, data);
			}
			else if(index>list.size){
				System.out.println(" Invalid index");
			}
			else{
				Node temp = list.head;
				for (int i = 0; i < index-1; i++)
					temp=temp.next;
				Node newNode = new Node(data);
				newNode.next = temp.next;
				temp.next = newNode;
			}
		return list;
	}
/////////////////////// DELETE A NODE AT INDEX ///////////////////////////////////////
	public LinkedList deleteAtIndex (LinkedList list, int index){
		if (list.head == null) {
			System.out.println("List is empty");
		} else {
			Node temp = list.head;
			for(int i=1; i<index-1; i++) {
				temp = temp.next;
			}
			System.out.println("\nDeleted : "+temp.next.data);
			temp.next = temp.next.next;		
		}
		size--;
		return list;
	}
	
	
///////////////////////////////  SWAP ADJACENT ///////////////////////////////////////
	public LinkedList swapAdjacent(LinkedList list){
		LinkedList tempList = new LinkedList();
		
		Node tempHead = list.head;
		while(tempHead!=null && tempHead.next!=null){
			tempList.insertAtEnd(tempList, tempHead.next.data);
			tempList.insertAtEnd(tempList, tempHead.data);
			if(tempHead.next.next!=null)
				tempHead=tempHead.next.next;
			else
				break;			
		}
		if(tempHead!=null)
			tempList.insertAtEnd(tempList, tempHead.data);
		
		return tempList;
	}
////////////////////////////////// GET MIDDLE OF LIST ///////////////////////////////////////	
	public int getMiddleOfList(LinkedList list){
			Node node1 = list.head;
			Node node2 = list.head;
			while(node2!=null && node2.next!=null){
				node1=node1.next;
				node2=node2.next.next;
			}		
		return node1.data;
	}
}
