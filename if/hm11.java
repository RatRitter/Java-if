import java.util.Scanner;

public class hm11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
double x1,x2;

System.out.println("Enter a: ");
double a = sc.nextDouble();

System.out.println("Enter b: ");
double b = sc.nextDouble();

System.out.println("Enter c: ");
double c = sc.nextDouble();
double dis = sc.nextDouble();
dis = b * b - 4 * a * c;
if (dis > 0) {
	x1 = ((-b)+ Math.sqrt(dis)) / (2 * a);
	x2 = ((-b)- Math.sqrt(dis)) / (2 * a);
	System.out.println("x1 = " + x1);
	System.out.println("x2 = " + x2);
}else if (dis == 0) {
	x1 = -(b / (2 * a));
	System.out.println("x1 = x2 = " + x1);	
	}else if (dis < 0) {
		System.out.println("D < 0,корней нет");
	}
	
sc.close();}}
	


