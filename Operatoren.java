package Operatoren;

public class Operatoren {

	
	
	// Zahl zum Quadrat
	public int quadrat(int zahl) {
		int z = zahl*zahl;
		return z;
	}
	
	
	
	public int divisionOhneKomma(float a,float b) {
		int k = (int) (a/b);
		return k;
	}
	
	
	
	public float divisionMitKomma(int a,int b) {
		float g = a/b;
		return g;
		
	}
	
public String doubleString(double f) {
String d =String.valueOf(f);
return d;
}
	
	
	public String intString(int x) {
		String h = String.valueOf(x);
		return h;
	}
	
	
	
	public boolean teilbar(int a,int b) {
		if(a%b==0) {
			System.out.println();
			return true;
		}else {
			return false;
		}
	}
	
	static void countBackwards (int zahl) {
		if(zahl<0)
return;		
		System.out.println(zahl);
		countBackwards(zahl-1);
		
		}
	}
	
	
	
	
	

