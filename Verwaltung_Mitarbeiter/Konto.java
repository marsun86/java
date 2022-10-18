package Verwaltung_Mitarbeiter;

public class Konto {
	long nummer;
	String inhaber;
	int kontoStand;
	int betrag;
	// Standartkonstruktor

	Konto() {
		nummer = -1;
		inhaber = "NA";
		kontoStand = 0;
	}

	Konto(int nr, String name) {
		inhaber = name;
	}

	Konto(int nr, String name, int begruessungsGeld) {
		name = inhaber;
		kontoStand = kontoStand + begruessungsGeld;
	}

	Konto(int nr, String name, Konto werber, int werbePraemie) {
		name = inhaber;
	}

void einzahlen(int betrag) {

		kontoStand = kontoStand + betrag;

	}

	void abheben(int betrag) {
		kontoStand -= betrag;

	}

	// Methode void druckeÜbersicht
	void druckeÜbersicht() {
		System.out.println("uebersichtdrucke\nKontonummer: " + nummer + "\nInhaber: " + inhaber + "\nKontostand: "
				+ kontoStand + "\n-----");

	}

// Methode toString

	public String toString() {

		String a = "ÜbersichtString\nKontonummer: " + nummer + "\nInhaber: " + inhaber + "\nKontostand: " + kontoStand
				+ "\n-----";
		return a;
	}

// Konto empfaenger it quasi ein Objekt der Klasse
	void ueberweisen(Konto empfaenger, int betrag) {
		abheben(betrag);
		empfaenger.einzahlen(betrag);
	}
//Aufruf wäre  konto2.ueberweisen(konto1,-5000):
// von konto 2 wird abgehoben und bei empfaenger konto 1 draufgemacht

// Methode überweisen

}
