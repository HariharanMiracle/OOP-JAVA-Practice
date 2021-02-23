package inheritance;

public class Main {
	public static void main(String args[]) {
		Parent p = new Parent();
		p.methodOne();
		
		System.out.println("##################");
		
		Elderchild ec = new Elderchild();
		ec.methodOne();
		ec.methodTwo();
		ec.methodThree();
		
		System.out.println("##################");
		YoungerChild yc = new YoungerChild();
		yc.methodOne();
		yc.methodTwo();
		yc.methodThree();
		yc.methodFour();
		yc.methodFive();
		
		
		
		
		System.out.println("##################");
	}
}
