import java.util.Scanner;

public class hm2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter time: ");
			 int n = sc.nextInt();
			 
			 
			 
			 
			 
			 if (n >= 8 && n < 12 ){ 
			 System.out.println("Good morning");
			  }
			  else if  (n >= 12 && n < 17) {
			 System.out.println("Good day");}
			  
			 
			 else if ( n >= 17 && n < 24) {
			 System.out.println("Good night"); }
			 else if (n > 24){
				 System.out.println("Default");
			 }else if (n < 8) {
				 System.out.println("Good night");
			 }
			sc.close(); }}
	         
			 
 
		
	
	

	private static void and(boolean b) {
		// TODO Auto-generated method stub
		
	} }

	
	


	


