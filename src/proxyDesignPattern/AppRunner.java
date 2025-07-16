package proxyDesignPattern;

public class AppRunner {

	public static void main(String[] args) {

		try {
			EmployeeDao empObj = new EmployeeDaoImplProxy();
			empObj.create("USER", new EmployeeDo());
		} catch (Exception e) {
			System.out.println("Exception occurred !!!! " +e);
		}
	}

}
