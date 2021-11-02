package introduction;

public class Zadatak1 {

	public static void main(String[] args) {
		int broj = 24;
		int broj2 = 12;
		char operation = '/';
		int rezultat;
		if(operation == '+') {
			rezultat = broj + broj2;
			System.out.println(rezultat);
		}
		else if(operation == '-') {
			rezultat = broj - broj2;
			System.out.println(rezultat);
		}
		else if(operation == '*') {
			rezultat = broj * broj2;
			System.out.println(rezultat);
		}
		else if(operation == '/') {
			rezultat = broj / broj2;
			System.out.println(rezultat);
		}
		else {
			System.out.println("Molimo vas unesite neki od ovih znakova: +,-,*,/");
		}
	}

}
