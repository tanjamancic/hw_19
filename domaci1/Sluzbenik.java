package domaci;

public class Sluzbenik extends Zaposleni {

	private String odsek;

	public Sluzbenik(String ime, String prezime, int godRodjenja, int godZaposlenja, double plata, String odsek) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata);
		this.odsek = odsek;
	}

	public String toString() {
		return super.toString() + "Sluzbenik na odseku: " + odsek + ".\n";
	}
}
