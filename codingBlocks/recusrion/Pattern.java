package recusrion;

public class Pattern {
	
	public static void main(String[] args) {
		print(5,1,1);
	}

	private static void print(int x, int i, int j) {
		
		if(i>x)
			return;
		if(j>i){
			System.out.println();
			print(5,i+1,1);
		}
		else{
			System.out.print("* ");
			print(5,i,j+1);
		}			
	}
}
