package collection;

//import for Scanner and other utility classes
import java.util.*;


// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
*/
        //Scanner
        Scanner s = new Scanner(System.in);
        String num = s.next();                 // Reading input from STDIN
        String k = s.next();
        
       char ch[] = num.toCharArray();
       int arr[] = new int[ch.length];
       
       int j=0;
       for(int i=0; i<ch.length; i++){
           arr[j++] = Integer.parseInt(String.valueOf(ch[i]));
       }
       
       Arrays.sort(arr); 
       int x = Integer.parseInt(k);
       char ch2[] = new char[arr.length];
        for(int i=0; i<arr.length; i++){
           if(arr[i]!=x)
           ch2[i] = (char)('0'+arr[i]);
       }
       System.out.println(Integer.parseInt(String.valueOf(ch2).trim()));
        // Write your code here

    }
}
