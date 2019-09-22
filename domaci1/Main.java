package domaci;

public class Main {

	public static void main(String[] args) {

		StudentOsnovnihStudija s1 = new StudentOsnovnihStudija("Entoni", "Kidis", 1962, 2, 10, "Solfedjo");
		System.out.println(s1.toString());

		StudentMasterStudija s2 = new StudentMasterStudija("Tanja", "Zubic", 1987, 4, 10, "Java Programiranje");
		System.out.println(s2.toString());

		Predmet p1 = new Predmet("Java programiranje");
		Predmet p2 = new Predmet("Nasledjivanje");
		Predmet p3 = new Predmet("Algoritmi");
		Predmet[] nizP = { p1, p2, p3 };

		Profesor pro1 = new Profesor("Robert C", "Martin", 1952, 2000, 500000, p1, nizP, "redovni");
		System.out.println(pro1.toString());

		Asistent a1 = new Asistent("Uros", "Mancic", 1988, 2019, 400000, p3, nizP, "Arhitektura");
		System.out.println(a1.toString());

		Sluzbenik sl1 = new Sluzbenik("Pera", "Peric", 1984, 2003, 100000, "Ekonomija");
		System.out.println(sl1.toString());
	}
}
