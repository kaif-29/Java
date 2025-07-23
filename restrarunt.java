package day05;

public class restrarunt {
	String company;
	int price;
void snacks(){
	System.out.println("fried chicken");
System.out.println("bucket chicken");
}
	public static void main(String[] args) {
		restrarunt obj=new restrarunt();
		obj.company="KFC";
		obj.price=199;
		System.out.println(obj.company);
		restrarunt obj1=new restrarunt();
		obj1.company="Dominoes";
		
		System.out.println(obj1.company);
	    obj.snacks();

	}

}
