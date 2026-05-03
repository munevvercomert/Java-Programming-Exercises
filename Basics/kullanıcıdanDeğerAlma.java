import java.util.Scanner;


public class kullanıcıdanDeğerAlma {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		System.out.println("the number you entered: " + number);
	
	        scan.close();
	
	}
	
	

}
