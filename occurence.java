package day05;

import java.util.*;

public class occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the string:");
		Scanner sc=new Scanner(System.in);
		String a= sc.nextLine();
		int count=0;
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch==a.charAt(i)) {
				char ohh=a.charAt(i);
				count++;
			}
		}
		if(count>0) {
			System.out.println(count);
		}
			else {
				System.out.println("enter valid input");
			}
			}
			

	}


