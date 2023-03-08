import java.util.Scanner;

public class hm9 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Enter y1= ");
		double y1 = sc.nextDouble();
		System.out.println("Enter x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = sc.nextDouble();
		if (y1 == y2) {
			System.out.println("Ровная дорога");
		}else if (x1 == x2) {
			System.out.println("Обрыв");
		}else if ((y2 - y1)/ (x2 - x1)>0) {
			System.out.println("Горка");
		}else {
			System.out.println("Спуск");
		}sc.close();
		
}



}
