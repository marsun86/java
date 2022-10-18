package Verwaltung_Mitarbeiter;

public class Person extends Mitarbeiterverwaltung {
	// Attribute
	String name;
	int geburtsJahr;

	Person(int geburtsJahr, String name) {
		geburtsJahr = -1;
		name = "unbekannt";
	}

	Person() {
		geburtsJahr = -1;
		name = "unbekannt";
	}

	Person(String name) {

		this.name = name;
		;
	}

	// Standartkonstruktor Konstruktor ohne Eingabeparameter.
	// Person(){}

	Person(String personname, int jahr) {
		name = personname;
		geburtsJahr = -1;
	}

	// Methode getgeburtsJahr
	public int getgeburtsJahr(int geburtsJahr) {

		return geburtsJahr;
	}

	// Methode getName

	public String getName(String name) {
		return name;
	}

	// Methode drucke

	public void drucke() {
		System.out.println(name);
		System.out.println(geburtsJahr);
	}

	// Methode toString()

	public String toString() {
		String s = "---\n" + "Name: " + name + "\n" + "Geburtsjahr: " + geburtsJahr;
		return s;
	}

	public void setName(String personName) {
		name = personName;
	}

	public void setgeburtsJahr(int Jahr) {
		Jahr = geburtsJahr;
	}

}
