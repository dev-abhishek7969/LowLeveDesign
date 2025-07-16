package proxyDesignPattern;

public class EmployeeDaoImplProxy implements EmployeeDao {

	EmployeeDao empDao;

	EmployeeDaoImplProxy() {
		empDao = new EmployeeDaoImpl();
	}

	@Override
	public void create(String client, EmployeeDo obj) throws Exception {
		if (client.equals("ADMIN")) {
			empDao.create(client, obj);
			return;
		}
		throw new Exception("Access Denied.");
	}

	@Override
	public void delete(String client, int employeeId) throws Exception {
		if (client.equals("ADMIN")) {
			empDao.delete(client, employeeId);
			return;
		}
		throw new Exception("ACCESS Denied.");
	}

	@Override
	public EmployeeDo get(String client, int employeeId) throws Exception {
		if (client.equals("ADMIN") || client.equals("USER")) {
			return empDao.get(client, employeeId);
		}
		throw new Exception("Access Denied");
	}

}
