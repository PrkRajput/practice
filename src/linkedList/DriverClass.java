package linkedList;

public class DriverClass {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list=list.insertAtEnd(list,1);
		list=list.insertAtEnd(list,2);
		list=list.insertAtEnd(list,3);
		list=list.insertAtEnd(list,4);
		list.showList(list);
		list=list.insertAtBegining(list,0);
		System.out.println("\n size of list : "+list.size);
		list.showList(list);
		list=list.insertAtIndex(list, 9, 4);
		System.out.println("\n size of list : "+list.size);
		list.showList(list);
		
	}

}
