package orangeHR;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		
		System.out.println("Hello world....!");
		int i=1/0;
		
		
		System.out.println("Completed");

	}
		catch(Exception exp)
		{
			System.out.println("I am Inside Catch Block");
			System.out.println("Message is:"+exp.getMessage());
			System.out.println("Cause is :"+exp.getCause());
			exp.printStackTrace();
		}
		finally {
			System.out.println("I am inside a finally block");
		}

}
}
