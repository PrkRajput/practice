package prk.string;


public class StringTest {

	public void foo(String s) {
		System.out.println("String");
	}

	/*
	 * public void foo(StringBuffer sb){ System.out.println("StringBuffer"); }
	 */

	public static void main(String[] args) {
		// Test test = new Test();
		// test.foo(null);
		
		  String s1 = "asdf"; 
		  String s2 = new String("asdf");  // creates 2 objects
		  String s3 = s1;
		  
		  System.out.println(s1.equals(s2)); 
		  System.out.println(s1.equals(s3));
		  System.out.println(s3.equals(s2)); 
		  System.out.println("---------");
		  System.out.println(s1==s2); 
		  System.out.println(s1==s3);
		  System.out.println(s3==s2);
		 
		// Whenever it finds string it converts all the later variables to String ;
		System.out.println('a');
		System.out.println('a' + 'b');
		System.out.println("H" + 'a' + 'b');
		System.out.println('a' + 'b' + "H");
		System.out.println(12 + 'a' + 'b' + "H" + 'a' + 'b' + 12);
	}
}