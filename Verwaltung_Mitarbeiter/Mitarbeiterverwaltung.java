package Verwaltung_Mitarbeiter;

public class Mitarbeiterverwaltung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Mitarbeiter der HTW Dresden");
		System.out.println("-------------------------");
		System.out.println();
		// Objekt Person 1 erzeugt

		Person Person1 = new Person();

// Max M�ller, einmal direkt und einmal mit der getMethode
		// Max M�ller ausgegeben
		String u = Person1.getName("Max M�ller");
		System.out.println("Name: " + u);

		// leerzeile
		System.out.println();

		// Max M�ller ausgegeben
		System.out.println(Person1.getName("Max M�ller"));

		// geburtsjahr ausgegeben
		System.out.println("Geburtsjahr: " + Person1.getgeburtsJahr(1995));
		System.out.println();

		System.out.println("-------------------------");

		// Objekt Person 2 erzeugt

		Person person2 = new Person();
		person2.name = "Linda";

		System.out.println(person2.toString());

		System.out.println("|||||||||||||||!");
		System.out.println(person2);
		System.out.println();
		System.out.println(person2.getName("Max M�ller"));

		System.out.println("Geburtsjahr: " + person2.getgeburtsJahr(1995));

		System.out.println("//////////////");

		System.out.println(person2.getName("Lisa Mustermann"));
		// objekt.attribut
		System.out.println(person2.geburtsJahr);

		System.out.println();

		System.out.println(person2.name);
		System.out.println(person2.geburtsJahr);

		System.out.println();
		System.out.println(person2.toString());

		System.out.println();
		// Ausgabe unbekannt

		// Objekt person3
		Person person3 = new Person();
		System.out.println(person3.name);

		Mitarbeiter mitarbeiter1 = new Mitarbeiter();

		System.out.println("Mitarbeiter 1");
		mitarbeiter1.geburtsJahr = 1990;
		mitarbeiter1.setName("M�ller");

		mitarbeiter1.getName("M�ller");
		mitarbeiter1.settelefonNummer("33333333");

		System.out.println(mitarbeiter1.gettelefonNummer("4444444"));

		mitarbeiter1.setraum("Z220");

		System.out.println("\n-------------------------------------------");
		System.out.println(mitarbeiter1);
		System.out.println("\n-----------------------------------");

		Studierende s1 = new Studierende();
		s1.name = "Schmidt";

		s1.setmatrikelnummer(2345);
		s1.getmatrikelnummer(12345);

		// s1.setraum("z333");
		// s1.getraum("z333");
		s1.toString();
		
		
		
		
		
		
		Konto konto1 =new Konto();	
		konto1.nummer=621736172;
		konto1.inhaber="Dagobert Duck;";
		konto1.kontoStand=900000000;
		
		// Ausgabe konto�bersicht mit drucke�bersicht
		System.out.println(" Ausgabe konto�bersicht mit drucke�bersicht");
		konto1.drucke�bersicht();
		
		System.out.println();


		System.out.println("Ausgabe mit toString");
		System.out.println(konto1.toString());
		
		
		
		System.out.println();
		System.out.println("Sysout konto1");
	System.out.println(konto1);
	
	konto1.abheben (100000000);
	//Leerzeile
			System.out.println(konto1);
	
konto1.einzahlen(100);
//Leerzeile
		System.out.println(konto1);
konto1.abheben(200);
//Leerzeile
		System.out.println(konto1);
konto1.einzahlen(-1000);
//Leerzeile
System.out.println("Sysout konto1 nach Buchungen");
		System.out.println(konto1);
		System.out.println("drucke�bersicht nach Buchungen");
		konto1.drucke�bersicht();
	
		
		System.out.println();
	// Objekt.methode
//7 Ausgabe Kontostand mit toString
		System.out.println("toString nach Buchungen");
		System.out.println(konto1.toString());
		

		System.out.println();
		Konto konto2 =new Konto();
		
		System.out.println("Konto2 mit Standartkonstruktor");
		System.out.println(konto2);
		
	konto2.nummer=1345;
	konto2.inhaber="Donald Duck";
	konto2.kontoStand=5;
	
	System.out.println("Konto2 mit Werten");
	System.out.println("Konto 2\n"+konto2);
	
		konto2.abheben(10);
		System.out.println("Kontostand Konto2 vor �berweisung ");
		System.out.println(konto2);
		
		System.out.println("Kontostand Konto1 vor  �berweisung");
		System.out.println(konto1);
		
		System.out.println("Konto2mittoString");
		System.out.println(konto2.toString());
		
		konto2.ueberweisen(konto1, 50099);
		
		System.out.println("Kontostand Konto1 nach �berweisung");
		System.out.println(konto1);
		System.out.println("Kontostand Konto2 nach �berweisung");
		System.out.println(konto2);
		
		System.out.println("konto 3  bei objekterstellung");	
		
		Konto konto3 =new Konto(2,"3333",8);
		
		System.out.println(konto3);

		Konto konto4 =new Konto();
		
		System.out.println(konto4);
		
		
		
		
		
		
	}

}
