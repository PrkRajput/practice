package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class A{
	public void m1(){
		System.out.println("Am1 called");
	}
	public void m2(){
		System.out.println("Am2 called");
	}
}

class B extends A{
	public void m1(){
		System.out.println("Bm1 called");
	}
	public void m3(){
		System.out.println("Bm3 called");
	}
}


public class Driver {

	public static void main(String[] args) {
		
		Employee e1 = new Employee("Ram", 11, 1000);
		Employee e2 = new Employee("Kal", 22, 5000);
		Employee e3 = new Employee("Tron", 33, 3000);
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);		
		list = list.stream().filter(x -> x.getSalary()>4000).collect(Collectors.toList());
		// test push
		System.out.println();
		A a = new B();
		
		
	}
}
