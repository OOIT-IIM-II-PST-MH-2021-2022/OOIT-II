package introduction;

public class Variables {

	public static void main(String[] args) {
		int broj = 30;
		double decimalna = 30;
		System.out.println(decimalna);
		decimalna = 40.66;
		boolean lie = false;
		char c = 'c';
		String hello = "Hello!";
		if(decimalna == 30.66) {
			System.out.println("Moja vrednost je 40.66");
		}
		else if (decimalna == 40.66) {
			System.out.println("Moja vrednost je 30.0");
		}
		else {
			System.out.println("Ovo ne bi trebalo da se ispise");
		}
	}

}
