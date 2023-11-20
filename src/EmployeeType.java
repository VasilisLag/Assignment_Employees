// Violation of Open-Closed Principle (OCP)
public class EmployeeType {
    public double calculateBonus(Employee employee) {
        if (employee instanceof Manager) {
            return employee.getSalary() * 0.2;
        } else if (employee instanceof Developer) {
            return employee.getSalary() * 0.1;
        }
        return 0;
    }
}