package domaci;

public class Zaposleni extends Covek {
	
	private int godZaposlenja;
	private double plata;
	
	public Zaposleni(String ime, String prezime, int godRodjenja, int godZaposlenja, double plata) {
		super(ime, prezime, godRodjenja);
		this.godZaposlenja = godZaposlenja;
		this.plata = plata;
	}

	public String toString() {
		return super.toString() + "Godina Zaposlenja:" + godZaposlenja + ", plata: " + plata + ".\n";
	}
}
