package adobe;
import java.util.*;
import java.io.IOException;
class HackerEarth
{ 
    public static void main(String args[]) 
    { 
        int hck;
        try {
            hck = System.in.read();
            System.out.println(hck);
        }
        catch (IOException hack){
            System.out.println("Input not read");
        }
    } 
} 