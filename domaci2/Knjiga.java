package domaci2;

import java.util.Arrays;

public class Knjiga {

	private String naziv;
	private List[] l1;
	private int brStranica;

	public Knjiga(String naziv) {
		this.naziv = naziv;
		l1 = new List[1];
	}

	public String getNaziv() {
		return naziv;
	}

	public void sirenjeNizaStranica() {
		if (brStranica >= l1.length) {
			l1 = Arrays.copyOf(l1, l1.length * 2);
		}
	}

	public void dodajStranicu(List a) {
		sirenjeNizaStranica();
		for (int i = 0; i < brStranica; i++) {
			if (l1[i].getRedniBroj() == a.getRedniBroj()) {
				l1[i] = a;
				return;
			}
		}
		l1[brStranica] = a;
		brStranica++;
	}

	public int getBrojStranica() {
		return brStranica;
	}

	public List getListPoBroju(int a) {
		if (a < 0 || a > brStranica) {
			System.out.println("Stranica sa tim rednim brojem ne postoji.");
			return null;
		}
		int i;
		for (i = 0; i < brStranica; i++) {
			if (l1[i].getRedniBroj() == a) {
				break;
			}
		}
		return l1[i];
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.naziv + ":\n");
		for (int i = 0; i < brStranica - 1; i++) {
			for (int j = i + 1; j <= brStranica - 1; j++)
				if (l1[j].getRedniBroj() < l1[i].getRedniBroj()) {
					List temp = l1[i];
					l1[i] = l1[j];
					l1[j] = temp;
				}
			sb.append(l1[i].toString());
		}
		sb.append(l1[brStranica - 1]);
		String s = sb.toString();
		return s;
	}
}
