import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class hm3 {

	public static void main(String[] args) {
		System.out.println("¬ыберите животное,введ€ от 1 до 10: ");
		Scanner sc = new Scanner(System.in);
		ArrayList<String> animalList = new ArrayList<String>();
		animalList.add("1-dog");
		animalList.add("2-cat");
		animalList.add("3-frog");
		animalList.add("4-fish");
		animalList.add("5-parrot");
		animalList.add("6-rat");
		animalList.add("7-chicken");
		animalList.add("8-horse");
		animalList.add("9-sheep");
		animalList.add("10-owl");
		int n;
		n = sc.nextInt();
		switch(n) {
		case 1:
			
				System.out.println("√ав-гав");
			break;
		case 2:
			
				System.out.println("ћ€у-м€у");
			break;
		case 3:
			
			System.out.println(" ва-ква");
			break;
		case 4:
			
			System.out.println("«вучи гробовой тишины");
			break;
		case 5:
			
			System.out.println("„ик-чирик");
			break;
		case 6:
			
			System.out.println("ѕищит и грызет,прекрасное создание");
			break;
		case 7:
			
			System.out.println(" о-ко");
			break;
		case 8:
			
			System.out.println("»го-го");
			break;
		case 9:
			
			System.out.println("ће-ме");
			break;
		case 10:
			
			System.out.println("”х-ух");
			break;
		
		}
		sc.close();
		

	}

}
