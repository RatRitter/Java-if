import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hm7{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������: ");
		String symbol = sc.nextLine();
		
		Pattern letletters = Pattern.compile("[a-zA-Z]{1}");
		Matcher lleters = letletters.matcher(symbol);
		Pattern kirletters = Pattern.compile("[�-��-�]{1}");
		Matcher kletters = kirletters.matcher(symbol);
		Pattern numbers = Pattern.compile("[0-9]{1}");
		Matcher nnumbers = numbers.matcher(symbol);
		if (lleters.matches()==true) {
			System.out.println("��������");
			
		}if(kletters.matches()==true) {
			System.out.println("���������");
		}if (nnumbers.matches()==true) {
			System.out.println("�����");
		}sc.close();
		}
		}

	

//������� �� �������