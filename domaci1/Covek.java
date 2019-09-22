package domaci;

public class Covek {

	private String ime;
	private String prezime;
	private int godRodjenja;

	public Covek(String ime, String prezime, int godRodjenja) {
		this.ime = ime;
		this.prezime = prezime;
		this.godRodjenja = godRodjenja;
	}

	public String toString() {
		return "• Ime:" + ime + ", prezime:" + prezime + ", godina rodjenja:" + godRodjenja + ".\n";
	}
}
