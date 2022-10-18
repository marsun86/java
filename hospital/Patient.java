package hospital;

import java.time.LocalDate;
import java.time.Month;

public class Patient extends Person {
	private static short nextID = 1;
	// Variablen
	private short id = 1;
	private String sickness;

	// Konstruktor 1
	public Patient() {
		this("NA", "NA", LocalDate.of(1900, Month.JANUARY, 1));
	}

	// Konstruktor 2
	public Patient(String sickness) {

		this.sickness = sickness;

	}

	// Konstruktor 3
	public Patient(String givenName, String familyName, LocalDate birthDate) {
		super(givenName, familyName, birthDate);
		this.id = nextID++;
		this.sickness = "unknown";
	}
//Setter
	public void setSickness(String sickness) {
		this.sickness = sickness;
	}
//to String Method
	public String toString() {
		String s = "id= " + nextID + ",sickness = " + sickness + "" + familyName + givenName +

				super.birthDate;
		return s;
	}

	// Patient: id=2, sickness=cold, Person: Lisa Meier, 21. Oktober 1990
	//

}
