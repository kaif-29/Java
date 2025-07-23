package day06;
class animal{
String color;
public void breathe(){
	System.out.println("the animal is breathing");
}
}
	class dog extends animal{
		public void eat() {
			System.out.println("the dog is eating");
		}
	}
		class cat extends animal{
			public void eat() {
				System.out.println("the cat is eating");
			
		}
		
	}
	

public class Inheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
dog d1=new dog();
cat c1=new cat();
d1.breathe();
d1.eat();
c1.eat();
d1.color="White";
System.out.println(d1.color);

	}

}
	
	
