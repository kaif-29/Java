package day05;

public class Student {
	static String Bike="Yamaha";
	String name;
	int no;
	 static void display(String s, int n) {
		System.out.println(s+" "+n);
	}
	 static {
		System.out.println("This is MT-15");
	 }

	public static void main(String[] args) {
		
		Student obj=new Student();
		Student.display("Zenin", 8692);
		System.out.println(Bike);

	}

}
