package Verwaltung_Mitarbeiter;

public class Sparkonto extends Konto {
	static int sparZinssatz = 3;

	Sparkonto() {
		nummer = -1;
		inhaber = "NA";
	}

	Sparkonto(int nr, String name) {
		nummer = nr;
		inhaber = name;
	}

	void schreibeZinsenGut() {
		einzahlen(kontoStand * sparZinssatz / 100);
	}

	void abheben(int betrag) {
		if (kontoStand >= betrag)
			kontoStand -= betrag;
	}

}
