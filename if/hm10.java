import java.util.Scanner;

public class hm10 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("How many flats per floor m= ");
	int flat = sc.nextInt();
    System.out.println("Flat number n= ");
    
    
    int adoc = sc.nextInt();
    
    int dock=flat/adoc+1,level=(flat-(dock-1)*adoc)/4;
    System.out.printf("flat %d Dock %d Level %d",flat,dock,level);
    
    sc.close();
}


	
}

