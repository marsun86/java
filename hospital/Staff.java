package hospital;

import java.time.LocalDate;

import java.time.Month;

public class Staff extends Person {
//Atributte
	private static final Month Month = null;
	private LocalDate workingSince;
	public String language;
//Konstruktor
	Staff() {
		workingSince = LocalDate.of(1900, Month.JANUARY, 1);
		language = "German,English";
	}
//Setter
	public void setWorkingSince(LocalDate workingSince) {
		this.workingSince = workingSince;
	}
//toString Method
	public String toString() {
		String s = "Staff:" + "Arbeitet seit: " + workingSince + "  " + " und spricht " + language;
		return s;
	}

}
