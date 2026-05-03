
public class atamaOperatörleri {

	public static void main(String[] args) {
		
		int a = 15; int b = 7;
		
		a %= b; // a'nın b ile bölümünden kalan
		a = a * a;
		b = a + b * b;
		
		System.out.println(" a = " + a);
		System.out.println(" b = " + b);
		

	}

}
