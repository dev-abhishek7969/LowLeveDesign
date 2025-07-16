package proxyDesignPattern;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		System.out.println("Creating new record in emploee table.");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		System.out.println("Deleted row with employee Id "+ employeeId);
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		System.out.println("Fetching data from the DB");
		return new EmployeeDo();
	}

}
