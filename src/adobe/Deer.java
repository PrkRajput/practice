package adobe;

public class Deer {
	
	
	public Deer() {
		System.out.print("1");
	}

	public Deer(int age) {
		System.out.print("2");
	}

	private boolean hasHorns() {
		return false;
	}

	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		System.out.println("," + deer.hasHorns());
	}
}


class Reindeer extends Deer {
	public Reindeer(int age) {
		System.out.print("3");
	}

	public boolean hasHorns() {
		return true;
	}
}
