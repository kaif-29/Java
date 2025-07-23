package day05;
import java.util.*;
public class uptolow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
Scanner sc=new Scanner(System.in);
String a= sc.nextLine();
for(int i=0;i<a.length();i++) {
	char ch=a.charAt(i);

if(ch>=65&&ch<=90) {
	System.out.print((char)(ch+32));
	}
	else if(ch>=97&&ch<=122) {
		System.out.print((char)(ch-32));
	}
	else {
		System.out.println("Invalid Input");
		}

	}

}

}
	

