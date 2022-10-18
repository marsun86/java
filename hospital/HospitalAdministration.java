package hospital;

import java.time.LocalDate;
import java.time.Month;

public class HospitalAdministration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// neues Objekt Person 1
		Person p1 = new Person();
		p1.setBirthDate(LocalDate.of(2003, Month.OCTOBER, 7));
		
		
		Person p2 = new Person("Peter ", "Müller ");
		Person p3 = new Person("Peter ", "Meier ", LocalDate.of(2001, Month.JANUARY, 10));
		
		System.out.println(p1.toString());
		System.out.println(p2);
		System.out.println(p3);
		Patient pat1 = new Patient();
		System.out.println(pat1);
		Patient pat2 = new Patient("Lisa", "Hoffmann", LocalDate.of(1990, Month.APRIL, 21));
		pat2.setSickness("cold");
		System.out.println("Pat2"+pat2);
		System.out.println();
		Staff staff1 = new Staff();
		staff1.givenName = "Werner";
		staff1.familyName = "Schmidt";
		staff1.setWorkingSince(LocalDate.of(1998, Month.AUGUST, 3));
		System.out.println(staff1);

	}

}
