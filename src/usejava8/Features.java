package usejava8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

interface FunInterface 
{ 
    // An abstract function 
    void abstractFun(int x); 
    
    
   // void abstractFun2(int x);
    
    static void staticFun(int x){
    	System.out.println("Static of FunInterface ");
    }
  
    // A non-abstract (or default) function 
    default void normalFun(int x) 
    { 
       System.out.println("Hello " + x); 
    } 
}

interface FunChild
{ 
    // An abstract function 
    void abstractFun(int x); 
    
    static void staticFun(int x){
    	System.out.println("Static of FunChild ");
    }
  
    // A non-abstract (or default) function 
    default void normalFun() 
    { 
       System.out.println("Hello "); 
    } 
}

public class Features  implements FunInterface{
	public static void main(String []args) {
		//int x=2,y=3;
		//int z = (x, y) -> x + y;
		//System.out.println("done");
		FunInterface fobj = x->System.out.println(2*x); 
		FunInterface fobj2 = (int x)->System.out.println(3*x); 
        // This calls above lambda expression and prints 10. 
       fobj.abstractFun(5); 
       fobj2.abstractFun(2);
      FunInterface.staticFun(5);              
        //System.out.println("done");
		List<Integer> number = Arrays.asList(2,3,4,5);
		//AtomicInteger counter = new AtomicInteger(0);
		
		
		List<Integer> square = number.stream().map(i->i*i).peek(i->i++).collect(Collectors.toList());
		//square.forEach(i->System.out.print(" "+i));
				
		// Stream on Arrays
		/*int a[] = new int[5];
		a = Arrays.stream(a).map(x->x+2).toArray();
		Arrays.stream(a).forEach(x->System.out.print(x+" "));*/
		
		Map<Character,Integer> map = new HashMap<>();
		map.put('e', 0);
		map.put('f', 1);
		map.put('b', 2);
		map.put('c', 3);
		map.put('a', 4);
		
		map.forEach((k,v)->System.out.print(k+":"+v+" "));
		System.out.println();
		map.entrySet().stream().forEach(System.out::println);
		//square.stream().forEach(i->System.out.print(" "+i));
		Map<Character,Integer> finalMap = map.entrySet().stream().filter(x->x.getValue()%2==0).collect(Collectors.toMap( x->x.getKey(), x->x.getValue()*2));
		finalMap.entrySet().stream().forEach(x->System.out.print(x.getKey()+ ":" + x.getValue()+" "));
	}

	@Override
	public void abstractFun(int x) {
		// TODO Auto-generated method stub
		
	}

	
	
}
