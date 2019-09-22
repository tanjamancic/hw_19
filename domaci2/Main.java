package domaci2;

public class Main {

	public static void main(String[] args) {
		
		List l11 = new List(1, "Text 11");
		List l12 = new List(2, "Text 12");
		List l13 = new List(3, "Text 13");
		List l14 = new List(4, "Text 14");
		List l15 = new List(5, "Text 15");
		Knjiga k1 = new Knjiga("Knjiga 1");
		k1.dodajStranicu(l12);
		k1.dodajStranicu(l11);
		k1.dodajStranicu(l14);
		k1.dodajStranicu(l15);
		k1.dodajStranicu(l13);
		
		List l21 = new List(1, "Text 21");
		List l22 = new List(2, "Text 22");
		List l23 = new List(3, "Text 23");
		List l24 = new List(4, "Text 24");
		List l25 = new List(5, "Text 25");
		Knjiga k2 = new Knjiga("Knjiga 2");
		k2.dodajStranicu(l22);
		k2.dodajStranicu(l21);
		k2.dodajStranicu(l24);
		k2.dodajStranicu(l25);
		k2.dodajStranicu(l23);
		
		Polica p1 = new Polica();
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k2);
		
		System.out.println(p1.toString());
		
		List l112 = new List (1, "Text 11 izmenjen.");
		k1.dodajStranicu(l112);
		
		System.out.println(p1.toString());
		
		p1.uzmiKnjiguPoNazivu("Knjiga 2");
		p1.uzmiKnjiguPoNazivu("Knjiga 3");
		
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
		p1.dodajKnjigu(k1);
	}
}
