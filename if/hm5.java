import java.util.Scanner;

public class hm5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int day;
		int month;
		int year;
		String Sign = null;
		String sign = null;
		
		System.out.println("Enter a day: ");
		day = sc.nextInt();
		System.out.println("Enter a month: ");
		month = sc.nextInt();
		System.out.println("Enter a year: ");
		year = sc.nextInt();
		if (day <= 0 && day > 31);{
			if (month <= 0 && month > 12);
			{
				if (year <= 1900);
				System.out.println("���� ��������: " + day +"."  + month + "." + year);
			}
		}
		if((month == 1) && (day <= 20) || (month == 12) && (day>= 22)) {
			System.out.print(sign =" ������� ");
			} else if((month == 1) || (month == 2) && (day <= 19)) {
				System.out.print(sign =" ������� ");
			} else if((month == 2) || (month == 3) && (day <= 20)) {
				System.out.print(sign =" ���� ");
			} else if((month == 3) || (month == 4) && (day <= 19)) {
				System.out.print(sign =" ���� ");
			} else if((month == 4) || (month == 5)&& (day <= 21)) {
				System.out.print(sign =" ����� ");
			} else if((month == 5) || (month == 6) && (day <= 21)) {
				System.out.print(sign =" �������� ");
			} else if((month == 6)|| (month == 7) && (day <= 23)) {
				System.out.print(sign = " ��� ");
			} else if((month == 7) || (month == 8) && (day <= 23)) {
				System.out.print(sign =" ��� ");
			} else if((month == 8) || (month == 9) && (day <= 23)) {
				System.out.print(sign =" ���� ");
			} else if((month == 9) || (month == 10) && (day <= 23)) {
				System.out.print(sign =" ���� ");
			} else if((month == 10) || (month == 11)&& (day <= 22)) {
				System.out.print(sign = " �������� ");
			} else if(month == 12) {
			System.out.print(sign = " ������� ");
			}
			if((sign.equals(" ���� "))||(sign.equals(" ��� "))||(sign.equals(" ������� "))){
			;
			}
			else if((sign.equals(" ����� "))||(sign.equals(" ���� "))||(sign.equals(" ������� "))){
			;
			}
			else if((sign.equals(" �������� "))||(sign.equals(" ���� "))||(sign.equals(" ������� "))){
			;
			}
			else if((sign.equals(" ��� "))||(sign.equals(" �������� "))||(sign.equals(" ���� "))){
			;

	}int x = (1997 - year) % 12;
	if ((x == 1) || (x == -11)){
		System.out.print(Sign = " �����");
		}
		else{
		if (x == 0){
			System.out.print(Sign = " ���");
		}
		else{
		if ((x == 11) || (x == -1)){
			System.out.print(Sign = " ����");
		}
		else{
		if ((x == 10) || (x == -2)){
			System.out.print(Sign = " ������");
		}
		else{
		if ((x == 9) || (x == -3)){
			System.out.print(Sign = " ������");
		}
		else{
		if ((x == 8) || (x == -4)){
			System.out.print(Sign = " ����");
		}
		else{
		if ((x == 7) || (x == -5)){
			System.out.print(Sign = " ������");
		}
		else{
		if ((x == 6) || (x == -6)){
			System.out.print(Sign = " ����");
		}
		else{
		if ((x == 5) || (x == -7)){
			System.out.print(Sign = " ��������");
		}
		else{
		if ((x == 4) || (x == -8)){
			System.out.print(Sign = " ������");
		}
		else{
		if ((x == 3) || (x == -9)){
			System.out.print(Sign = " ������");
		}
		else{
		if ((x ==2) || (x == -10)){
			System.out.print(Sign = " ������");
		}
		}
		}
		}
		}
		}
		System.out.println("��� ���� ������� -  " + sign + ".");
		System.out.println("��������� ������ -  " + Sign + ".");
}sc.close();}}}}}}}
