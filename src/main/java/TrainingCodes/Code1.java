package TrainingCodes;

import java.util.Scanner;
public class Code1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the age n");
		int age = sc.nextInt();
		if(age<18) {
			System.out.println("you are still minor.please grow up!!");
			
		}
		else if(age>65) {
			System.out.println("your are sineor citizen");
		}
		else {
			System.out.println("congratulation you eligible for marrige" );
		}
		
	}

}

