package leetCode;

import linkedList.LinkedList;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		
		l1=l1.insertAtEnd(l1,1);
		l1=l1.insertAtEnd(l1,2);
		l1=l1.insertAtEnd(l1,3);
		l1=l1.insertAtEnd(l1,4);
		

		l2=l2.insertAtEnd(l2,1);
		l2=l2.insertAtEnd(l2,2);
		l2=l2.insertAtEnd(l2,3);
		l2=l2.insertAtEnd(l2,4);
	}
	
	 /*public LinkedList addTwoNumbers(LinkedList l1, LinkedList l2) {
		// int i=Math.max(l1.si,l1.getSizeOfList(l2));
		 LinkedList l3 = new LinkedList();
		 while(i-->0){
			// l3.insertAtEnd(l3, l1.)
		 }
		 return l2;	        
	    }
*/
}
