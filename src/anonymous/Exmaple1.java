package anonymous;

interface IGreetService{
	void greet();
}

public class Exmaple1 {

	public static void main(String args[]) {
		IGreetService iGreetService = new IGreetService() {
			
			@Override
			public void greet() {
				// TODO Auto-generated method stub
				System.out.println("Hello Hariharan");
			}
		};
		
		iGreetService.greet();
	}
	
}
