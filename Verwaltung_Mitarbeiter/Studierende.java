package Verwaltung_Mitarbeiter;

public class Studierende extends Person {

	protected int matrikelNummer;

	static int neueMatrikelNummer = 1000;;

	Studierende() {
		super();
		matrikelNummer = 12345;
	}

	public void setmatrikelnummer(int nummer) {

		nummer = matrikelNummer;
	}

	public int getmatrikelnummer(int matrikelNummer) {

		return matrikelNummer;
	}

	public String toString() {
		String s = "Name" + name + "\n" + "Geburtsjahr" + geburtsJahr + "\nMatrikelnummer ist " + matrikelNummer;
		return s;
	}

}
