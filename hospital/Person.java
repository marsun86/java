package hospital;

import java.time.LocalDate;

import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Person {

	private static final Month JANUARY = null;
	static final DateTimeFormatter DATE_Formatter = DateTimeFormatter.ofPattern("d,MMMM yyyy");

	protected String givenName;
	protected String familyName;
	protected LocalDate birthDate;

// Konstruktor 1

	public Person() {
		this.givenName = " NA";
		this.familyName = " NA";

	}

	// Konstruktor 2

	Person(String givenName, String familyName) {
		this.givenName = givenName;
		this.familyName = familyName;
		birthDate = LocalDate.of(1900, Month.JANUARY, 3);

	}

//Konstruktor 3
	public Person(String givenName, String familyName, LocalDate birthDate) {
		this.givenName = "NA";
		this.familyName = "NA";
		this.birthDate = birthDate;

	}
//Setter
	
	public void setBirthDate(int year, int month, int day) {
		birthDate = LocalDate.of(year, month, day);
	}
	
		public void setBirthDate(LocalDate date) {
		this.birthDate = date;
	}
	
		
		//Getter
		
	public LocalDate getBirthDate() {
		return birthDate;
	}


//to String Method

	public String toString() {
		String s = "Person:" + "Name: " + givenName + "Familienname: " + familyName + "Geburtdatum\n," + birthDate.format(DATE_Formatter);
		return s;
	}

}
