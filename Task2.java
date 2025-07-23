package day07;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Content :");
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		int c=sc.nextInt();
		int b= sc.nextInt();
		if(c<b) {
			System.out.println(a.substring(c,b));
		}
		else {
			System.out.println("Invalid Index");
		}

	}

}
