package day06;
class Bank{
	private float balance;
	public void setbalance(Float amt) {
		balance=amt;
	}
	public float getbalance() {
		return balance;
	}
	public void withdraw(int amt) {
		float val=balance-amt;
		setbalance(val);
	}
	public void deposit(int amt) {
		float val=balance+amt;
		setbalance(val);
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank obj=new Bank();
		obj.setbalance(1000.0f);
		System.out.println("the balance of your account is:"+" "+obj.getbalance());
		obj.withdraw(500);
		System.out.println("the withdrawal balance of your account is:"+" "+obj.getbalance());
		obj.deposit(2000);
		System.out.println("the deposit balance of your account is:"+" "+obj.getbalance());
		

	}

}
