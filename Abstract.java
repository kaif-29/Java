package day06;
abstract class printable{
	abstract void printdoc();
}
class pdfdoc extends printable{
	void printdoc() {
		System.out.println("pdfdoc is printing");
	}
}
class worddoc extends printable{
	void printdoc() {
		System.out.println("worddoc is printing");
	}
}
public class Abstract {
	public static void main(String[] args) {		
		pdfdoc p1=new pdfdoc();
		p1.printdoc();
		worddoc w1=new worddoc();
		w1.printdoc();

	}
}

	

