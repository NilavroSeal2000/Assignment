package lab5.com.cg.eis.exception;

public class EmployeeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "EmployeeException";
	}

	@Override
	public String getMessage() {
		return "Salary cant be less than 3000";
	}

}
