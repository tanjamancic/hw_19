package domaci2;

public class List {

	private int redniBroj;
	private String text;

	public List(int redniBroj, String text) {
		this.redniBroj = redniBroj;
		this.text = text;
	}

	public int getRedniBroj() {
		return redniBroj;
	}

	public void poredjenje(List l1) {
		if (this.redniBroj == l1.redniBroj) {
			System.out.println("Redni brojevi su isti.");
			return;
		}
		if (this.redniBroj > l1.redniBroj) {
			System.out.println("Redni broj trenutnog lista je veci.");
			return;
		} else {
			System.out.println("Redni broj lista sa kojime se poredi je veci.");
		}
	}

	public static void poredjenje(List l1, List l2) {
		if (l1.redniBroj == l2.redniBroj) {
			System.out.println("Redni brojevi isti.");
			return;
		}
		if (l1.redniBroj > l2.redniBroj) {
			System.out.println("Veci je redni broj papira zadatog u prvom parametru.");
			return;
		} else {
			System.out.println("Veci je redni broj papira zadatog u drugom parametru.");
		}
	}

	public void setText(String text) {
		this.text = text;
	}

	public String toString() {
		return text + " (" + redniBroj + ")\n";
	}
}
