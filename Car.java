package day05;

public class Car {
	String name;
	int price;
	Car(){
		System.out.print("this is default");
	}
	Car(String name,int price)
	{
		this.name=name;
		this.price=price;
		
	}

	void display() {
		System.out.println("name :"+name+" " +"price :"+price);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj =new Car ("volvo",10);
		obj.display();
		

	}

}
