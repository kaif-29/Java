package day07;
import java.util.*;
public class Task1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter the Content");
		String a=sc.nextLine();
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if((ch>=65&&ch<=90)||ch>=97&&ch<=122)
			{
				count++;
			}
			
		}
		 if(count<1){
				System.out.println("it is a integer ");
			}
		 else {
			 System.out.println("it is string");
		 }
		

	}

}
