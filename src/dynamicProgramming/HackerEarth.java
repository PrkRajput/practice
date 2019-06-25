package dynamicProgramming;
import java.util.concurrent.CopyOnWriteArrayList; 
import java.util.*; 
class HackerEarth extends Thread
{ 
    
    static CopyOnWriteArrayList hck = new CopyOnWriteArrayList(); 
  
    public void testhack() 
    { 
        hck.add("K"); 	
    } 
    
     public static void main(String[] args) 
        throws InterruptedException 
    { 
        hck.add("H"); 
        hck.add("A"); 
        hck.add("C"); 
    HackerEarth t = new HackerEarth(); 
        t.testhack(); 
  
        Thread.sleep(1000); 
        Iterator test1 = hck.iterator(); 
        while (test1.hasNext()) { 
            String s = (String)test1.next(); 
            System.out.println(s); 
            Thread.sleep(1000); 
        } 
        System.out.println(hck); 
    } 
}