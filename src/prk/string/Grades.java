package prk.string;
import java.util.Scanner;

class Grades {
	
	public static boolean isAlphabetOnly(String str) 
	{ 
	    return (str.matches("^[a-zA-Z]*$")); 
	} 	
	
  public static void main(String[] args) {
    int j = 1;
    double sum = 0;
    double average;

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Insert Student's Name");
    String name = keyboard.next();
    if(!isAlphabetOnly(name)){
    	System.out.println("Please enter alfabets only");
    	return;
    }
    System.out.println("Insert Student's Surname");
    String surname = keyboard.next();

    System.out.println("Student's name: " + name + " " + surname);

    System.out.println("How many Grades?");
    int nVotes = keyboard.nextInt();
    int[] arrayVotes = new int[nVotes];

    System.out.println("Now insert all the grades");

    for (int i=0; i<arrayVotes.length; i++) {
      System.out.println("Insert the grade " + j);
      arrayVotes[i] = keyboard.nextInt();
      j++;
    }

    for (int i=0; i<arrayVotes.length; i++) {
      sum += arrayVotes[i];
    }

    average = sum / arrayVotes.length;
    System.out.println("Student's grade average is: " + average);

    System.out.println("Does he have a good behaviour? Answer with true or false");
    boolean behaviourStudent = keyboard.nextBoolean();

    average = !behaviourStudent ? Math.floor(average) : Math.ceil(average);

    System.out.println("The grade now is: " + average);

    keyboard.close();
  }
}