package day05;

	class dad{
		void show()
				{
			System.out.println("Yamaha");
			
				}
	}

	class Child extends dad
	{
		void show()
		{
			System.out.println("MT-15");
		}
	}

public class Poly {
	public static void main(String[] args) {
		Child obj=new Child();
		obj.show();
		
		

	}

}
