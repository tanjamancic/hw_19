package domaci;

public class StudentMasterStudija extends Student {
	
	private String smer;

	public StudentMasterStudija(String ime, String prezime, int godRodjenja, int trenutnaGodStudija, double trenutniProsek, String smer) {
		super(ime, prezime, godRodjenja, trenutnaGodStudija, trenutniProsek);
		this.smer = smer;
	}
	
	public String toString() {
		return super.toString() + "Student Master Studija, smer: " + smer + ".\n";
	}
	
	
	

}
