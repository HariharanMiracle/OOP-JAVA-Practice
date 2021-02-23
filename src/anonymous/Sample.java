package anonymous;

interface Eservice{
//	void concat(String branch, String ins);
//	int calc(int x, int y);
	void ref();
}

public class Sample {

	Sample(){
		System.out.println("Hello constructor");
	}
	
	public static void method() {
		System.out.println("Method");
	}
	
	public static void main(String args[]) {
//		Eservice eservice = (branch, ins) -> System.out.println(branch + " " + ins);
//		eservice.concat("sdf", "sadfg");
//		Eservice eservice = Sample::new;
		
		Sample sample = new Sample();
		Eservice eservice = Sample::method;
		eservice.ref();
	}
	
	
}
