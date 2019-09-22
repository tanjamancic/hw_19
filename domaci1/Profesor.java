package domaci;

public class Profesor extends Nastavnik {

	private String titula;

	public Profesor(String ime, String prezime, int godRodjenja, int godZaposlenja, double plata,
			Predmet omiljeniPredmet, Predmet[] nizPredmeta, String titula) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata, omiljeniPredmet, nizPredmeta);
		this.titula = titula;
	}

	public String toString() {
		return super.toString() + "Titula profesora: " + titula + ".\n";
	}
}
