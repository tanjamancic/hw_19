package domaci;

public class StudentOsnovnihStudija extends Student {
	
	private String smer;

	public StudentOsnovnihStudija(String ime, String prezime, int godRodjenja, int trenutnaGodStudija, double trenutniProsek, String smer) {
		super(ime, prezime, godRodjenja, trenutnaGodStudija, trenutniProsek);
		this.smer = smer;
	}

	public String toString() {
		return super.toString() + "Student Osnovnih Studija, smer: " + smer + ".\n";
	}
	
	
}
