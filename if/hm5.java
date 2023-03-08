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
				System.out.println("Дата рождения: " + day +"."  + month + "." + year);
			}
		}
		if((month == 1) && (day <= 20) || (month == 12) && (day>= 22)) {
			System.out.print(sign =" Козерог ");
			} else if((month == 1) || (month == 2) && (day <= 19)) {
				System.out.print(sign =" Водолей ");
			} else if((month == 2) || (month == 3) && (day <= 20)) {
				System.out.print(sign =" Рыбы ");
			} else if((month == 3) || (month == 4) && (day <= 19)) {
				System.out.print(sign =" Овен ");
			} else if((month == 4) || (month == 5)&& (day <= 21)) {
				System.out.print(sign =" Телец ");
			} else if((month == 5) || (month == 6) && (day <= 21)) {
				System.out.print(sign =" Близнецы ");
			} else if((month == 6)|| (month == 7) && (day <= 23)) {
				System.out.print(sign = " Рак ");
			} else if((month == 7) || (month == 8) && (day <= 23)) {
				System.out.print(sign =" Лев ");
			} else if((month == 8) || (month == 9) && (day <= 23)) {
				System.out.print(sign =" Дева ");
			} else if((month == 9) || (month == 10) && (day <= 23)) {
				System.out.print(sign =" Весы ");
			} else if((month == 10) || (month == 11)&& (day <= 22)) {
				System.out.print(sign = " Скорпион ");
			} else if(month == 12) {
			System.out.print(sign = " Стрелец ");
			}
			if((sign.equals(" Овен "))||(sign.equals(" Лев "))||(sign.equals(" Стрелец "))){
			;
			}
			else if((sign.equals(" Телец "))||(sign.equals(" Дева "))||(sign.equals(" Козерог "))){
			;
			}
			else if((sign.equals(" Близнецы "))||(sign.equals(" Весы "))||(sign.equals(" Водолей "))){
			;
			}
			else if((sign.equals(" Рак "))||(sign.equals(" Скорпион "))||(sign.equals(" Рыбы "))){
			;

	}int x = (1997 - year) % 12;
	if ((x == 1) || (x == -11)){
		System.out.print(Sign = " Крыса");
		}
		else{
		if (x == 0){
			System.out.print(Sign = " Бык");
		}
		else{
		if ((x == 11) || (x == -1)){
			System.out.print(Sign = " Тигр");
		}
		else{
		if ((x == 10) || (x == -2)){
			System.out.print(Sign = " Кролик");
		}
		else{
		if ((x == 9) || (x == -3)){
			System.out.print(Sign = " Дракон");
		}
		else{
		if ((x == 8) || (x == -4)){
			System.out.print(Sign = " Змея");
		}
		else{
		if ((x == 7) || (x == -5)){
			System.out.print(Sign = " Лошадь");
		}
		else{
		if ((x == 6) || (x == -6)){
			System.out.print(Sign = " Овца");
		}
		else{
		if ((x == 5) || (x == -7)){
			System.out.print(Sign = " Обезьяна");
		}
		else{
		if ((x == 4) || (x == -8)){
			System.out.print(Sign = " Курица");
		}
		else{
		if ((x == 3) || (x == -9)){
			System.out.print(Sign = " Собака");
		}
		else{
		if ((x ==2) || (x == -10)){
			System.out.print(Sign = " Свинья");
		}
		}
		}
		}
		}
		}
		System.out.println("Ваш знак зодиака -  " + sign + ".");
		System.out.println("Китайский зодиак -  " + Sign + ".");
}sc.close();}}}}}}}
