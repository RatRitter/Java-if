import java.util.Scanner;

public class hm12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number of ticket: ");
		int b,c;
		int a = sc.nextInt();
		b = ((a / 100)% 10 +(a / 10)% 10 + a % 10);
		c = (a / 100000 + (a / 10000)% 10 + (a / 1000)% 10);
		if (b==c)
		{System.out.println("Lucky");
			}
		else {
			System.out.println("Not lucky");
		}
sc.close();
	}}


