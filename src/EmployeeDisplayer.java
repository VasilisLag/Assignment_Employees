
public class EmployeeDisplayer {
	
    public String displayEmployeeInfo(Employee employee) {
        System.out.println("Employee Details: " + employee.getName() + ", " + employee.getSalary());
        return "Employee Details: " + employee.getName() + ", " + employee.getSalary();
    }
}
