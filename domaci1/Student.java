package domaci;

public class Student extends Covek {

	private int trenutnaGodStudija;
	private double trenutniProsek;

	public Student(String ime, String prezime, int godRodjenja, int trenutnaGodStudija, double trenutniProsek) {
		super(ime, prezime, godRodjenja);
		this.trenutnaGodStudija = trenutnaGodStudija;
		this.trenutniProsek = trenutniProsek;

	}

	public String toString() {
		return super.toString() + "Trenutna godina studija: " + trenutnaGodStudija + ", trenutniProsek: "
				+ trenutniProsek + ".\n";
	}
}
