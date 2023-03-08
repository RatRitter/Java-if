import java.util.Scanner;

public class hm8 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x: ");
		int x = sc.nextInt();
		System.out.println("Enter y: ");
		int y = sc.nextInt();
		if ( x % 2 == 0 && y % 2 == 0 ) {
			System.out.println("YES");
		
		}else if (x % 2 != 0 && y % 2 != 0) {
			System.out.println("YES");
		}
		sc.close();

	}

	
	}


