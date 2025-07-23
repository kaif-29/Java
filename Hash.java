package day08;
import java.util.*;
public class Hash {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		HashSet<Integer>obj=new HashSet<>();
		int num=sc.nextInt();
		for(int i=0;i<num;i++){
			System.out.println("The Coupons Codes Are :");
			int code =sc.nextInt();
			obj.add(code);
		}
		System.out.println(obj);
		System.out.println(obj.size());
		if(obj.contains(2025)){
			System.out.println("Valid Input");
			
		}
		else {
			System.out.println("Invalid Input");
		}
	}

}
