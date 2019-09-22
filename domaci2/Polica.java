package domaci2;

public class Polica {

	private Knjiga[] knjige;
	private int brKnjige;

	public Polica() {
		brKnjige = 0;
		knjige = new Knjiga[10];
	}

	public void dodajKnjigu(Knjiga k) {
		if (brKnjige == knjige.length) {
			System.out.println("Polica popunjena.");
			return;
		}
		knjige[brKnjige] = k;
		brKnjige++;
	}

	public Knjiga uzmiKnjiguPoNazivu(String n) {
		int i;
		for (i = 0; i < brKnjige; i++) {
			if (knjige[i].getNaziv().equals(n)) {
				System.out.println("Knjiga sa nazivom " + n + " je na polici na mestu " + (i + 1) + ".");
				break;
			}
		}
		if (i < brKnjige) {
			return knjige[i];
		} else {
			System.out.println("Ne postoji knjiga sa nazivom " + n + ".");
			return null;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < brKnjige; i++) {
			sb.append(knjige[i].toString() + "\n");
		}
		String s = sb.toString();
		return s;
	}
}
