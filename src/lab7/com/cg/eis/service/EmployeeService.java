package lab7.com.cg.eis.service;

import lab7.com.cg.eis.bean.Employee;

interface IEmployeeService {
	abstract String insuranceScheme(Employee e);
}

public class EmployeeService implements IEmployeeService {

	@Override
	public String insuranceScheme(Employee e) {
		if (e.getSalary() > 5000 && e.getSalary() < 20000 && e.getDesignation().equals("System Associate"))
			return "Scheme C";
		if (e.getSalary() >= 20000 && e.getSalary() < 40000 && e.getDesignation().equals("Programmer"))
			return "Scheme B";
		if (e.getSalary() >= 40000 && e.getDesignation().equals("System Associate"))
			return "Scheme A";
		else
			return "No Scheme available";
	}

}
