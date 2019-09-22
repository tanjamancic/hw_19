package domaci;

public class Nastavnik extends Zaposleni {

	private Predmet omiljeniPredmet;
	private Predmet[] nizPredmeta;

	public Nastavnik(String ime, String prezime, int godRodjenja, int godZaposlenja, double plata,
			Predmet omiljeniPredmet, Predmet[] nizPredmeta) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata);
		this.omiljeniPredmet = omiljeniPredmet;
		this.nizPredmeta = nizPredmeta;
	}

	public String toString() {
		String s = super.toString() + "Omiljeni Predmet:" + omiljeniPredmet.getNaziv()
				+ "\nPredmeti na kojima drzi nastavu: ";
		for (int i = 0; i < nizPredmeta.length; i++) {
			s += nizPredmeta[i].getNaziv();
			if (i < nizPredmeta.length - 1) {
				s += ", ";
			}
		}
		s += ".\n";
		return s;
	}
}
