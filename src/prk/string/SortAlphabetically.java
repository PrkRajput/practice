package prk.string;


import java.util.Scanner;

public class SortAlphabetically
{
    public static String sortString(String inputString) 
    { 
        char[] stringArr = new char[inputString.length()];
        char temp;
        int n;

        for (int i = 0; i < inputString.length(); i ++)
        {
            stringArr[i] = inputString.charAt(i);
        }

        n = stringArr.length;

        while ( n > 1)
        {
            for(int i=0;i<(stringArr.length-1);i++)
            {
                for(int j=i+1;j>0;j--)
                {
                    if(stringArr[j]<stringArr[j-1])
                    {
                        temp = stringArr[j-1];
                        stringArr[j-1] = stringArr[j];
                        stringArr[j] = temp;
                    }
                }
            }
            n--;
        }

        String orderedWord = new String (stringArr);
        return orderedWord;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String finalWord;
        String initialWord;
        System.out.println("init");
        System.out.print("Please enter a word: "); // scan wont stop scanning
        System.out.println("test");
        initialWord = scan.nextLine();        
        finalWord = sortString(initialWord);

        System.out.println(finalWord);
    }
}