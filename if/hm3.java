import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class hm3 {

	public static void main(String[] args) {
		System.out.println("�������� ��������,����� �� 1 �� 10: ");
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
			
				System.out.println("���-���");
			break;
		case 2:
			
				System.out.println("���-���");
			break;
		case 3:
			
			System.out.println("���-���");
			break;
		case 4:
			
			System.out.println("����� �������� ������");
			break;
		case 5:
			
			System.out.println("���-�����");
			break;
		case 6:
			
			System.out.println("����� � ������,���������� ��������");
			break;
		case 7:
			
			System.out.println("��-��");
			break;
		case 8:
			
			System.out.println("���-��");
			break;
		case 9:
			
			System.out.println("��-��");
			break;
		case 10:
			
			System.out.println("��-��");
			break;
		
		}
		sc.close();
		

	}

}
