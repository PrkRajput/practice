package dynamicProgramming;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;



class Solution {

    /*
     * Complete the 'collapseString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING inputString as parameter.
     */

	static int getCountOfPossibleTeams() {
        int ary[] = {5,2,3,1,4};
        
        int f1=1,f2=1,sum=0,min=ary[0],max=ary[0];
        for (int i = 1; i < 5; i++) {
            
            if(ary[i]<min){
                min=ary[i];
                f1++;
            }
            if(ary[i]<max){
                max=ary[i];
                f2++;
            }
                   
        }
        if(f1>2)
            sum+=f1-2;
        if(f2>2)
            sum+=f2-2;    
        return sum;
    }
    public static void main(String[] args) throws IOException {
        /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

         String inputString = bufferedReader.readLine();

         String result = Result.collapseString("GGRRTTH");

         bufferedWriter.write(result);
         bufferedWriter.newLine();

         bufferedReader.close();
         bufferedWriter.close();*/
     	String str = "GGRRTTH";
     	System.out.println(getCountOfPossibleTeams());
     }
 }

