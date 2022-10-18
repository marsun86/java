package Verwaltung_Mitarbeiter;

public class Mitarbeiter extends Person {

	// private Attribute
	private String telefonNummer;
	private String raum;

	// Konstruktoren

	Mitarbeiter() {
		raum = "Z220";
		telefonNummer = "012345";
	}

	// mit den vordefinierten Attributen telefonNummer=“0351-462-00000“ und
	// raum=“unbekannt“
	Mitarbeiter(String name) {
		super.name = name;

	}

	Mitarbeiter(String name, int jahr) {
		super.name = name;
		super.geburtsJahr = jahr;
	}

	Mitarbeiter(String name, int jahr, String tel, String raum) {
		super.name = name;
		super.geburtsJahr = jahr;
		this.telefonNummer = tel;
		this.raum = raum;
	}

	public void settelefonNummer(String nummer) {
		this.telefonNummer = nummer;
	}

	public void setraum(String raum) {
		this.raum = raum;

	}

	String getraum(String raum) {
		return raum;
	}

	String gettelefonNummer(String telefonNummer) {
		return telefonNummer;
	}

	// toString Methode

	public String toString() {
		String s = super.toString() + "  " + "\nName " + name + "\nJahr " + geburtsJahr + "Telefonnummer"
				+ telefonNummer + "\n Raum" + raum;

		return s;
	}

}
