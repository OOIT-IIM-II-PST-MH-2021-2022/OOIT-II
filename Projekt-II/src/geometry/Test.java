package geometry;

public class Test {

	public static void main(String[] args) {
		
		/*Point p1 = new Point();
		System.out.println(p1.getX()+ ", " + p1.getY() + ", "+ p1.isSelected());
		Point p2 = new Point();
		
		System.out.println("Vrednost promenljive x objekta na koji p1 referencira je: " + p1.getX());
		System.out.println("Vrednost reference na objekat p1 je : " + p1);
		
		p1.setX(10);
		p1.setY(30);
		p2.setX(20);
		p2.setY(30);
		System.out.println(p1 == p2);
		int x =  20;
		int y = 20;
		System.out.println(x == y);
		System.out.println(p1.distance(p2));
		p1.getX();
		Point p3 = new Point();
		System.out.println(p3.getX());
		
		Line l1 = new Line();
		System.out.println(l1.getStartPoint() + ", " + l1.getEndPoint() + ", " + l1.isSelected());
		
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		System.out.println(l1.getStartPoint() + ", " + l1.getEndPoint() + ", " + l1.isSelected());
		Rectangle r1 = new Rectangle();
		r1.setUpperLeft(p3);
		r1.setWidth(50);
		r1.setHeight(25);
		
		//Vezbe 4
		System.out.println(p1);
		System.out.println(l1);
		System.out.println(r1);
		System.out.println(p1.equals(p3));
		p1.setX(15);
		p1.setY(10);
		p3.setX(15);
		p3.setY(10);
		System.out.println(p1 == p3);
		System.out.println(p1.equals(p3));*/
		
		
		//Zadaci za vezbu
		/*int faktorijel = 1;
		int brojac = 6;
		while(brojac > 0) {
			faktorijel = faktorijel * brojac;
			brojac--;
		}
		System.out.println(faktorijel);
	//}
	
		int rezultat = 0;
		for(int i = 1;i<11;i++) {
			rezultat = rezultat + i;
		}
		System.out.println(rezultat);
		
		//Veliki zadatak - greška ispravljena i zadatak završen!!!
		int brojPraznika = 0;
		for(int godina = 2021; godina < 2023; godina++) {
			if(godina == 2021) {
				for(int mesec = 11; mesec<=12; mesec++) {
					if(mesec == 11) {
						for(int dan = 23; dan<=31; dan++) {
						}
						
					}else {
					for(int dan = 1; dan<= 31; dan++) {
						if(dan == 25) {
							System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Katolicki Bozic");
							brojPraznika++;
						}
						else if(dan == 31) {
							System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Novogodisnja noc");
							brojPraznika++;
						}
					}
					}
				}
			}else {
			for(int mesec = 1 ; mesec<=12; mesec++ ) {
				for(int dan = 1; dan<=31; dan++) {
					if(mesec == 1) {
					switch(dan) {
					case 1:
						System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Prvi dan nove godine");
						brojPraznika++;
						break;
					case 7:
						System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Badnje vece");
						brojPraznika++;
						break;
					case 8:
						System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Pravoslavni Bozic");
						brojPraznika++;
						break;
					}
					}
					else if(mesec == 2) {
						if(dan == 15) {
							System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Dan drzavnosti");
							brojPraznika++;
						}
					}
					else if(mesec == 11) {
						if(dan == 11) {
							System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Primirje u prvom svetskom ratu");
							brojPraznika++;
						}
					}
					else if(mesec == 12) {
						if(dan == 25) {
							System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Katolicki Bozic");
							brojPraznika++;
						}
						else if(dan == 31) {
							System.out.println(dan+"."+mesec+"."+godina +" Danas je praznik - Novogodisnja noc");
							brojPraznika++;
						}
					}
					
				}
			}
			}
		}
		System.out.println("Broj praznika od 23.11.2021. do 31.12.2022. je: " + brojPraznika);*/

		Point p1 = new Point(35,25);
		Point p2 = new Point(30,20);
		Line l1 = new Line(p1,p2);
		Rectangle r1 = new Rectangle(p2, 15, 10);
		Circle c1 = new Circle(p2, 30);
		System.out.println(c1.contains(35, 25));
		System.out.println(c1.contains(p1));
		/*System.out.println(l1.contains(25, 45));
		System.out.println(r1.contains(25, 15));*/
}
}
