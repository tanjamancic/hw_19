package domaci;

public class Asistent extends Nastavnik {

	private String smerDoktorskihStudija;

	public Asistent(String ime, String prezime, int godRodjenja, int godZaposlenja, double plata,
			Predmet omiljeniPredmet, Predmet[] nizPredmeta, String smerDoktorskihStudija) {
		super(ime, prezime, godRodjenja, godZaposlenja, plata, omiljeniPredmet, nizPredmeta);
		this.smerDoktorskihStudija = smerDoktorskihStudija;
	}

	public String toString() {
		return super.toString() + "Asistent na smeru doktorskih studija: " + smerDoktorskihStudija + ".\n";
	}
}
