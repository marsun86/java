package Verwaltung_Mitarbeiter;

public class Girokonto extends Konto{

	
	//Attribute
	static int kreditZinssatz=13;
	static int limit=1000;
	//Konstruktor
	Girokonto(){
nummer=-1;
inhaber = "NA";
	}
	
	Girokonto(int nr,String name){
		nummer=nr;
		inhaber=name;
	}
	//Methoden
	void abheben(int betrag) {
		if(kontoStand-betrag >=-limit)
			kontoStand-=betrag;
	}
	
	
	void überweisen(Konto empfänger,int betrag) {
		abheben(betrag);
		empfänger.einzahlen(betrag);
	}
	

	
}
