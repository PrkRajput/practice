
/*package whatever //do not write package name here */

import java.util.*;

public class GEG {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();

    while (t-- > 0) {

      int n = sc.nextInt();
      List<Act> list = new ArrayList<>();
      for(int i=0; i<n; i++){
    	  list.add(new Act(sc.nextInt(),0));
      }
      for(int i=0; i<n; i++){
    	  list.get(i).setF(sc.nextInt());
      }
      
      list.sort((Act a1, Act a2)-> a1.getF()-a2.getF());
      
      int count = 1;
      int time = list.get(0).getF();
      for(int i=1; i<n; i++){
    	  if(list.get(i).getS() >= time){
    		  count++;
    		  time = list.get(i).getF();
    	  }
      }
      System.out.println(count);
    }
    sc.close();
  }
}

class Act {

int s, f;

	public Act(int s, int f) {
		super();
		this.s = s;
		this.f = f;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getF() {
		return f;
	}

	public void setF(int f) {
		this.f = f;
	}


}
